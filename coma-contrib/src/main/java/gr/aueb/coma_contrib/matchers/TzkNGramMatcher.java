package gr.aueb.coma_contrib.matchers;

import de.wdilab.ml.impl.Similarity;
import de.wdilab.ml.impl.matcher.simple.AbstractSimpleAttributeObjectMatcher;
import de.wdilab.ml.interfaces.mapping.IMappingProvider;
import de.wdilab.ml.interfaces.mapping.IMappingStore;
import de.wdilab.ml.interfaces.mapping.MappingStoreException;
import de.wdilab.ml.interfaces.matcher.IAttributeObjectMatcher;
import de.wdilab.ml.interfaces.oi.IObjectInstance;
import de.wdilab.ml.interfaces.oi.IObjectInstanceProvider;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class TzkNGramMatcher extends AbstractSimpleAttributeObjectMatcher implements IAttributeObjectMatcher {

    private static final int DEFAULT_NGRAM_LENGTH = 2;

    private final String attrLinks;
    private final String attrRechts;
    private final float threshold;


    public TzkNGramMatcher(String attrLinks, String attrRechts, float threshold) {
        this.attrLinks = attrLinks;
        this.attrRechts = attrRechts;
        this.threshold = threshold;
    }

    private String[] generateNGrams(String word, int ngramLength) {
        final int resultCount = word.length() - ngramLength + 1;
        String[] result = new String[resultCount];
        for (int i = 0; i < resultCount; i++) {
            result[i] = word.substring(i, i + ngramLength);
        }
        return result;
    }

    private String[] generateNGramsUnique(String word, int ngramLength) {
        String[] nGrams = this.generateNGrams(word, ngramLength);
        return new HashSet<String>(Arrays.asList(nGrams)).toArray(new String[0]);
    }

    private int calculateNgramFrequencyInWord(String ngram, String word) {
        String[] wordNGrams = this.generateNGrams(word, DEFAULT_NGRAM_LENGTH);
        return this.calculateNgramFrequencyInWord(ngram, wordNGrams);
    }

    private int calculateNgramFrequencyInWord(String ngram, String[] wordNGrams) {
        int count = 0;
        for (String wordGram : wordNGrams) {
            if (ngram.equals(wordGram)) {
                count++;
            }
        }
        return count;
    }

    public void match(IObjectInstanceProvider sourceInstanceProvider, IObjectInstanceProvider targetInstanceProvider, IMappingStore mappingStore) throws MappingStoreException {
        // store all the words of the target schema to avoid re-iterating the targetInstanceProvider.iterator()
        IObjectInstance[] targetObjectInstances = new IObjectInstance[targetInstanceProvider.size()];

        // create the index with the target schema, ie ngram -> frequencies in each term
        // keys will be the ngrams, values will be array of ints. The indices of the int array will
        // match the targetObjectInstances array
        HashMap<String, int[]> index = new HashMap<String, int[]>();

        Iterator targetSchemaIterator = targetInstanceProvider.iterator();
        for (int i = 0; i < targetInstanceProvider.size(); i++) {
            IObjectInstance targetInstance = (IObjectInstance) targetSchemaIterator.next();
            targetObjectInstances[i] = targetInstance;
        }

        // for each word, calculate the ngrams and populate the index
        for (int i = 0; i < targetObjectInstances.length; i++) {
            String word = targetObjectInstances[i].getStringValue(this.attrRechts).toLowerCase();

            String[] nGrams = this.generateNGramsUnique(word, DEFAULT_NGRAM_LENGTH);

            // for each unique ngram
            for (final String nGram : nGrams) {
                // put ngram in the index if it doesnt exist
                int[] frequenciesArray = index.get(nGram);
                if (frequenciesArray == null) {
                    frequenciesArray = new int[targetObjectInstances.length];
                    index.put(nGram, frequenciesArray);
                }

                // set frequencies of this ngram for the current word
                for (int wordIdx = 0; wordIdx < frequenciesArray.length; wordIdx++) {
                    if (wordIdx == i) {
                        // just an optimization to not re-calculate the ngrams
                        frequenciesArray[wordIdx] = this.calculateNgramFrequencyInWord(nGram, nGrams);
                    } else {
                        String targetWord = targetObjectInstances[wordIdx].getStringValue(this.attrRechts).toLowerCase();
                        frequenciesArray[wordIdx] = this.calculateNgramFrequencyInWord(nGram, targetWord);
                    }
                }
            }
        }

        // calculate the sum of ngram frequencies for each word
        int[] sumNGramFrequenciesPerWord = new int[targetObjectInstances.length];
        for (int i = 0; i < sumNGramFrequenciesPerWord.length; i++) {
            int sum = 0;
            for (String ngram : index.keySet()) {
                sum += index.get(ngram)[i];
            }
            sumNGramFrequenciesPerWord[i] = sum;
        }

        // for each word in the source schema create the ngram -> frequency in word map
        for (IObjectInstance sourceInstance : sourceInstanceProvider) {
            String sourceWord = sourceInstance.getStringValue(this.attrLinks).toLowerCase();
            Map<String, Integer> sourceNGramsWithFrequencies = this.generateNGramsWithFrequencies(sourceWord, DEFAULT_NGRAM_LENGTH);

            // for each word of the target schema, calculate the score with the word of the source schema
            for (int j = 0; j < targetObjectInstances.length; j++) {
                double score = 0;
                for (Map.Entry<String, Integer> entry : sourceNGramsWithFrequencies.entrySet()) {
                    String sourceNGram = entry.getKey();
                    int targetWordScore = 0;
                    if (index.containsKey(sourceNGram)) {
                        targetWordScore = index.get(sourceNGram)[j];
                    }
                    score += this.min(entry.getValue(), targetWordScore);
                }
                String targetWord = targetObjectInstances[j].getStringValue(this.attrRechts);
                int sourceWordNGramsLength = this.generateNGrams(sourceWord, DEFAULT_NGRAM_LENGTH).length;
                int targetWordNGramsLength = this.generateNGrams(targetWord, DEFAULT_NGRAM_LENGTH).length;
                score /= sourceWordNGramsLength + targetWordNGramsLength - score;
                System.out.println(score);
                if (score >= threshold) {
                    System.out.println("added");
                    mappingStore.add(sourceInstance, targetObjectInstances[j], new Similarity(score));
                }
            }
        }
    }

    private int countAllNGrams(IObjectInstanceProvider oip, String attr, int ngramLength) {
        int count = 0;
        for (IObjectInstance oi : oip) {
            count += this.generateNGrams(oi.getStringValue(attr), ngramLength).length;
        }
        return count;
    }

    private int min(int a, int b) {
        return a < b ? a : b;
    }

    private Map<String, Integer> generateNGramsWithFrequencies(String word, int ngramLength) {
        String[] uniqueNGrams = this.generateNGramsUnique(word, ngramLength);
        String[] nGrams = this.generateNGramsUnique(word, ngramLength);
        Map<String, Integer> result = new HashMap<String, Integer>();
        for (int i = 0; i < uniqueNGrams.length; i++) {
            int count = 0;
            for (int j = 0; j < nGrams.length; j++) {
                if (uniqueNGrams[i].equals(nGrams[j])) {
                    count++;
                }
            }
            result.put(uniqueNGrams[i], count);
        }
        return result;
    }


    public void match(IObjectInstanceProvider iObjectInstanceProvider, IMappingStore iMappingStore) throws MappingStoreException {
        throw new NotImplementedException();
    }

    public void match(IMappingProvider iMappingProvider, IMappingStore iMappingStore) throws MappingStoreException {
        throw new NotImplementedException();
    }
}
