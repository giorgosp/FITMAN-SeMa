// $ANTLR 3.4 /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g 2016-11-02 15:53:10
package de.wdilab.coma.matching.validation;
import org.antlr.runtime.*;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ComaWorkFlowLexer extends Lexer {
    public static final int EOF=-1;
    public static final int BOOLEAN=4;
    public static final int CHAR_BRACE_LEFT=5;
    public static final int CHAR_BRACE_RIGHT=6;
    public static final int CHAR_COMMA=7;
    public static final int CHAR_DOT=8;
    public static final int CHAR_SEMICOLON=9;
    public static final int COMPOSITION=10;
    public static final int DIGIT=11;
    public static final int DIRECTION=12;
    public static final int RESOLUTION_1=13;
    public static final int RESOLUTION_2=14;
    public static final int RESOLUTION_3=15;
    public static final int RESULT_COMBINATION=16;
    public static final int SELECTION_MAXDELTA=17;
    public static final int SELECTION_MAXN=18;
    public static final int SELECTION_MULTIPLE=19;
    public static final int SELECTION_THRESHOLD=20;
    public static final int SETCOMBINATION=21;
    public static final int SIMCOMBINATION1=22;
    public static final int SIMCOMBINATION2=23;
    public static final int SIMMEASURE=24;
    public static final int V1=25;
    public static final int V2=26;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public ComaWorkFlowLexer() {} 
    public ComaWorkFlowLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ComaWorkFlowLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g"; }

    // $ANTLR start "CHAR_BRACE_LEFT"
    public final void mCHAR_BRACE_LEFT() throws RecognitionException {
        try {
            int _type = CHAR_BRACE_LEFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:2:17: ( '(' )
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:2:19: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHAR_BRACE_LEFT"

    // $ANTLR start "CHAR_BRACE_RIGHT"
    public final void mCHAR_BRACE_RIGHT() throws RecognitionException {
        try {
            int _type = CHAR_BRACE_RIGHT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:3:18: ( ')' )
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:3:20: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHAR_BRACE_RIGHT"

    // $ANTLR start "CHAR_COMMA"
    public final void mCHAR_COMMA() throws RecognitionException {
        try {
            int _type = CHAR_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:4:12: ( ',' )
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:4:14: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHAR_COMMA"

    // $ANTLR start "CHAR_DOT"
    public final void mCHAR_DOT() throws RecognitionException {
        try {
            int _type = CHAR_DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:5:10: ( '.' )
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:5:12: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHAR_DOT"

    // $ANTLR start "CHAR_SEMICOLON"
    public final void mCHAR_SEMICOLON() throws RecognitionException {
        try {
            int _type = CHAR_SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:6:16: ( ';' )
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:6:18: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHAR_SEMICOLON"

    // $ANTLR start "RESOLUTION_1"
    public final void mRESOLUTION_1() throws RecognitionException {
        try {
            int _type = RESOLUTION_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:139:14: ( ( 'paths' | 'innerpaths' | 'leafpaths' | 'nodes' | 'innernodes' | 'leafnodes' | 'roots' | 'shared' | 'uppaths' | 'downpaths' | 'user' | 'sharedpaths' ) )
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:139:17: ( 'paths' | 'innerpaths' | 'leafpaths' | 'nodes' | 'innernodes' | 'leafnodes' | 'roots' | 'shared' | 'uppaths' | 'downpaths' | 'user' | 'sharedpaths' )
            {
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:139:17: ( 'paths' | 'innerpaths' | 'leafpaths' | 'nodes' | 'innernodes' | 'leafnodes' | 'roots' | 'shared' | 'uppaths' | 'downpaths' | 'user' | 'sharedpaths' )
            int alt1=12;
            switch ( input.LA(1) ) {
            case 'p':
                {
                alt1=1;
                }
                break;
            case 'i':
                {
                int LA1_2 = input.LA(2);

                if ( (LA1_2=='n') ) {
                    int LA1_9 = input.LA(3);

                    if ( (LA1_9=='n') ) {
                        int LA1_14 = input.LA(4);

                        if ( (LA1_14=='e') ) {
                            int LA1_17 = input.LA(5);

                            if ( (LA1_17=='r') ) {
                                int LA1_20 = input.LA(6);

                                if ( (LA1_20=='p') ) {
                                    alt1=2;
                                }
                                else if ( (LA1_20=='n') ) {
                                    alt1=5;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 1, 20, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 1, 17, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 14, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 9, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;

                }
                }
                break;
            case 'l':
                {
                int LA1_3 = input.LA(2);

                if ( (LA1_3=='e') ) {
                    int LA1_10 = input.LA(3);

                    if ( (LA1_10=='a') ) {
                        int LA1_15 = input.LA(4);

                        if ( (LA1_15=='f') ) {
                            int LA1_18 = input.LA(5);

                            if ( (LA1_18=='p') ) {
                                alt1=3;
                            }
                            else if ( (LA1_18=='n') ) {
                                alt1=6;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 1, 18, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 15, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 10, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 3, input);

                    throw nvae;

                }
                }
                break;
            case 'n':
                {
                alt1=4;
                }
                break;
            case 'r':
                {
                alt1=7;
                }
                break;
            case 's':
                {
                int LA1_6 = input.LA(2);

                if ( (LA1_6=='h') ) {
                    int LA1_11 = input.LA(3);

                    if ( (LA1_11=='a') ) {
                        int LA1_16 = input.LA(4);

                        if ( (LA1_16=='r') ) {
                            int LA1_19 = input.LA(5);

                            if ( (LA1_19=='e') ) {
                                int LA1_23 = input.LA(6);

                                if ( (LA1_23=='d') ) {
                                    int LA1_26 = input.LA(7);

                                    if ( (LA1_26=='p') ) {
                                        alt1=12;
                                    }
                                    else {
                                        alt1=8;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 1, 23, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 1, 19, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 16, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 11, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 6, input);

                    throw nvae;

                }
                }
                break;
            case 'u':
                {
                int LA1_7 = input.LA(2);

                if ( (LA1_7=='p') ) {
                    alt1=9;
                }
                else if ( (LA1_7=='s') ) {
                    alt1=11;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 7, input);

                    throw nvae;

                }
                }
                break;
            case 'd':
                {
                alt1=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:139:19: 'paths'
                    {
                    match("paths"); 



                    }
                    break;
                case 2 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:139:29: 'innerpaths'
                    {
                    match("innerpaths"); 



                    }
                    break;
                case 3 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:139:44: 'leafpaths'
                    {
                    match("leafpaths"); 



                    }
                    break;
                case 4 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:139:58: 'nodes'
                    {
                    match("nodes"); 



                    }
                    break;
                case 5 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:139:68: 'innernodes'
                    {
                    match("innernodes"); 



                    }
                    break;
                case 6 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:139:83: 'leafnodes'
                    {
                    match("leafnodes"); 



                    }
                    break;
                case 7 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:139:97: 'roots'
                    {
                    match("roots"); 



                    }
                    break;
                case 8 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:139:107: 'shared'
                    {
                    match("shared"); 



                    }
                    break;
                case 9 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:139:118: 'uppaths'
                    {
                    match("uppaths"); 



                    }
                    break;
                case 10 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:139:130: 'downpaths'
                    {
                    match("downpaths"); 



                    }
                    break;
                case 11 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:139:144: 'user'
                    {
                    match("user"); 



                    }
                    break;
                case 12 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:139:153: 'sharedpaths'
                    {
                    match("sharedpaths"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RESOLUTION_1"

    // $ANTLR start "RESOLUTION_2"
    public final void mRESOLUTION_2() throws RecognitionException {
        try {
            int _type = RESOLUTION_2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:140:14: ( ( 'selfpath' | 'selfnode' | 'parents' | 'siblings' | 'children' | 'leaves' | 'allnodes' | 'successors' ) )
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:140:17: ( 'selfpath' | 'selfnode' | 'parents' | 'siblings' | 'children' | 'leaves' | 'allnodes' | 'successors' )
            {
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:140:17: ( 'selfpath' | 'selfnode' | 'parents' | 'siblings' | 'children' | 'leaves' | 'allnodes' | 'successors' )
            int alt2=8;
            switch ( input.LA(1) ) {
            case 's':
                {
                switch ( input.LA(2) ) {
                case 'e':
                    {
                    int LA2_6 = input.LA(3);

                    if ( (LA2_6=='l') ) {
                        int LA2_9 = input.LA(4);

                        if ( (LA2_9=='f') ) {
                            int LA2_10 = input.LA(5);

                            if ( (LA2_10=='p') ) {
                                alt2=1;
                            }
                            else if ( (LA2_10=='n') ) {
                                alt2=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 10, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 9, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 6, input);

                        throw nvae;

                    }
                    }
                    break;
                case 'i':
                    {
                    alt2=4;
                    }
                    break;
                case 'u':
                    {
                    alt2=8;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;

                }

                }
                break;
            case 'p':
                {
                alt2=3;
                }
                break;
            case 'c':
                {
                alt2=5;
                }
                break;
            case 'l':
                {
                alt2=6;
                }
                break;
            case 'a':
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:140:19: 'selfpath'
                    {
                    match("selfpath"); 



                    }
                    break;
                case 2 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:140:32: 'selfnode'
                    {
                    match("selfnode"); 



                    }
                    break;
                case 3 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:140:45: 'parents'
                    {
                    match("parents"); 



                    }
                    break;
                case 4 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:140:57: 'siblings'
                    {
                    match("siblings"); 



                    }
                    break;
                case 5 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:140:70: 'children'
                    {
                    match("children"); 



                    }
                    break;
                case 6 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:140:83: 'leaves'
                    {
                    match("leaves"); 



                    }
                    break;
                case 7 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:140:94: 'allnodes'
                    {
                    match("allnodes"); 



                    }
                    break;
                case 8 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:140:107: 'successors'
                    {
                    match("successors"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RESOLUTION_2"

    // $ANTLR start "RESOLUTION_3"
    public final void mRESOLUTION_3() throws RecognitionException {
        try {
            int _type = RESOLUTION_3;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:141:14: ( ( 'name' | 'nametoken' | 'path' | 'pathtoken' | 'pathsyn' | 'comment' | 'commenttoken' | 'datatype' | 'statistics' | 'synonyms' | 'instance_constraints' | 'instance_content' | 'instance_content_indirect' | 'instance_all' | 'nameandsynonyms' ) )
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:141:17: ( 'name' | 'nametoken' | 'path' | 'pathtoken' | 'pathsyn' | 'comment' | 'commenttoken' | 'datatype' | 'statistics' | 'synonyms' | 'instance_constraints' | 'instance_content' | 'instance_content_indirect' | 'instance_all' | 'nameandsynonyms' )
            {
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:141:17: ( 'name' | 'nametoken' | 'path' | 'pathtoken' | 'pathsyn' | 'comment' | 'commenttoken' | 'datatype' | 'statistics' | 'synonyms' | 'instance_constraints' | 'instance_content' | 'instance_content_indirect' | 'instance_all' | 'nameandsynonyms' )
            int alt3=15;
            switch ( input.LA(1) ) {
            case 'n':
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1=='a') ) {
                    int LA3_7 = input.LA(3);

                    if ( (LA3_7=='m') ) {
                        int LA3_13 = input.LA(4);

                        if ( (LA3_13=='e') ) {
                            switch ( input.LA(5) ) {
                            case 't':
                                {
                                alt3=2;
                                }
                                break;
                            case 'a':
                                {
                                alt3=15;
                                }
                                break;
                            default:
                                alt3=1;
                            }

                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 13, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 7, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;

                }
                }
                break;
            case 'p':
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2=='a') ) {
                    int LA3_8 = input.LA(3);

                    if ( (LA3_8=='t') ) {
                        int LA3_14 = input.LA(4);

                        if ( (LA3_14=='h') ) {
                            switch ( input.LA(5) ) {
                            case 't':
                                {
                                alt3=4;
                                }
                                break;
                            case 's':
                                {
                                alt3=5;
                                }
                                break;
                            default:
                                alt3=3;
                            }

                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 14, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 8, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;

                }
                }
                break;
            case 'c':
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3=='o') ) {
                    int LA3_9 = input.LA(3);

                    if ( (LA3_9=='m') ) {
                        int LA3_15 = input.LA(4);

                        if ( (LA3_15=='m') ) {
                            int LA3_19 = input.LA(5);

                            if ( (LA3_19=='e') ) {
                                int LA3_27 = input.LA(6);

                                if ( (LA3_27=='n') ) {
                                    int LA3_29 = input.LA(7);

                                    if ( (LA3_29=='t') ) {
                                        int LA3_31 = input.LA(8);

                                        if ( (LA3_31=='t') ) {
                                            alt3=7;
                                        }
                                        else {
                                            alt3=6;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 3, 29, input);

                                        throw nvae;

                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 3, 27, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 3, 19, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 15, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 9, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

                    throw nvae;

                }
                }
                break;
            case 'd':
                {
                alt3=8;
                }
                break;
            case 's':
                {
                int LA3_5 = input.LA(2);

                if ( (LA3_5=='t') ) {
                    alt3=9;
                }
                else if ( (LA3_5=='y') ) {
                    alt3=10;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 5, input);

                    throw nvae;

                }
                }
                break;
            case 'i':
                {
                int LA3_6 = input.LA(2);

                if ( (LA3_6=='n') ) {
                    int LA3_12 = input.LA(3);

                    if ( (LA3_12=='s') ) {
                        int LA3_16 = input.LA(4);

                        if ( (LA3_16=='t') ) {
                            int LA3_20 = input.LA(5);

                            if ( (LA3_20=='a') ) {
                                int LA3_28 = input.LA(6);

                                if ( (LA3_28=='n') ) {
                                    int LA3_30 = input.LA(7);

                                    if ( (LA3_30=='c') ) {
                                        int LA3_32 = input.LA(8);

                                        if ( (LA3_32=='e') ) {
                                            int LA3_35 = input.LA(9);

                                            if ( (LA3_35=='_') ) {
                                                int LA3_36 = input.LA(10);

                                                if ( (LA3_36=='c') ) {
                                                    int LA3_37 = input.LA(11);

                                                    if ( (LA3_37=='o') ) {
                                                        int LA3_39 = input.LA(12);

                                                        if ( (LA3_39=='n') ) {
                                                            int LA3_40 = input.LA(13);

                                                            if ( (LA3_40=='s') ) {
                                                                alt3=11;
                                                            }
                                                            else if ( (LA3_40=='t') ) {
                                                                int LA3_42 = input.LA(14);

                                                                if ( (LA3_42=='e') ) {
                                                                    int LA3_43 = input.LA(15);

                                                                    if ( (LA3_43=='n') ) {
                                                                        int LA3_44 = input.LA(16);

                                                                        if ( (LA3_44=='t') ) {
                                                                            int LA3_45 = input.LA(17);

                                                                            if ( (LA3_45=='_') ) {
                                                                                alt3=13;
                                                                            }
                                                                            else {
                                                                                alt3=12;
                                                                            }
                                                                        }
                                                                        else {
                                                                            NoViableAltException nvae =
                                                                                new NoViableAltException("", 3, 44, input);

                                                                            throw nvae;

                                                                        }
                                                                    }
                                                                    else {
                                                                        NoViableAltException nvae =
                                                                            new NoViableAltException("", 3, 43, input);

                                                                        throw nvae;

                                                                    }
                                                                }
                                                                else {
                                                                    NoViableAltException nvae =
                                                                        new NoViableAltException("", 3, 42, input);

                                                                    throw nvae;

                                                                }
                                                            }
                                                            else {
                                                                NoViableAltException nvae =
                                                                    new NoViableAltException("", 3, 40, input);

                                                                throw nvae;

                                                            }
                                                        }
                                                        else {
                                                            NoViableAltException nvae =
                                                                new NoViableAltException("", 3, 39, input);

                                                            throw nvae;

                                                        }
                                                    }
                                                    else {
                                                        NoViableAltException nvae =
                                                            new NoViableAltException("", 3, 37, input);

                                                        throw nvae;

                                                    }
                                                }
                                                else if ( (LA3_36=='a') ) {
                                                    alt3=14;
                                                }
                                                else {
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("", 3, 36, input);

                                                    throw nvae;

                                                }
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 3, 35, input);

                                                throw nvae;

                                            }
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 3, 32, input);

                                            throw nvae;

                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 3, 30, input);

                                        throw nvae;

                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 3, 28, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 3, 20, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 16, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 12, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 6, input);

                    throw nvae;

                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:141:19: 'name'
                    {
                    match("name"); 



                    }
                    break;
                case 2 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:141:28: 'nametoken'
                    {
                    match("nametoken"); 



                    }
                    break;
                case 3 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:141:42: 'path'
                    {
                    match("path"); 



                    }
                    break;
                case 4 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:141:51: 'pathtoken'
                    {
                    match("pathtoken"); 



                    }
                    break;
                case 5 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:141:65: 'pathsyn'
                    {
                    match("pathsyn"); 



                    }
                    break;
                case 6 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:141:77: 'comment'
                    {
                    match("comment"); 



                    }
                    break;
                case 7 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:141:89: 'commenttoken'
                    {
                    match("commenttoken"); 



                    }
                    break;
                case 8 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:141:106: 'datatype'
                    {
                    match("datatype"); 



                    }
                    break;
                case 9 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:141:119: 'statistics'
                    {
                    match("statistics"); 



                    }
                    break;
                case 10 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:142:5: 'synonyms'
                    {
                    match("synonyms"); 



                    }
                    break;
                case 11 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:142:18: 'instance_constraints'
                    {
                    match("instance_constraints"); 



                    }
                    break;
                case 12 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:142:43: 'instance_content'
                    {
                    match("instance_content"); 



                    }
                    break;
                case 13 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:142:63: 'instance_content_indirect'
                    {
                    match("instance_content_indirect"); 



                    }
                    break;
                case 14 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:142:92: 'instance_all'
                    {
                    match("instance_all"); 



                    }
                    break;
                case 15 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:142:109: 'nameandsynonyms'
                    {
                    match("nameandsynonyms"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RESOLUTION_3"

    // $ANTLR start "SIMMEASURE"
    public final void mSIMMEASURE() throws RecognitionException {
        try {
            int _type = SIMMEASURE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:145:11: ( ( 'trigram' | 'soundex' | 'editdist' | 'datatypesimilarity' | 'featvect' | 'tfidf' | 'usersyn' | 'cosine' | 'jaccard' | 'jarowinkler' | 'sim_equal' | 'trigramcoma' | 'trigramifuice' | 'trigramlowmem' | 'trigramopt' | 'edjoin' | 'levenshteinlucene' | 'levenshteinsecondstring' | 'levenshteinlimes' | 'cosineppjoin+fullycached' | 'cosineppjoin' | 'cosinesimmetrics' | 'jaccardppjoin+fullycached' | 'jaccardppjoin+' | 'jaccardsecondstring' | 'jaccardsimmetrics' | 'jarowinklerlucene' | 'tfidflucenefullycached' | 'tfidflucenefullycachedalternative' | 'tfidfsecondstring' | 'ngramtzk' ) )
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:145:14: ( 'trigram' | 'soundex' | 'editdist' | 'datatypesimilarity' | 'featvect' | 'tfidf' | 'usersyn' | 'cosine' | 'jaccard' | 'jarowinkler' | 'sim_equal' | 'trigramcoma' | 'trigramifuice' | 'trigramlowmem' | 'trigramopt' | 'edjoin' | 'levenshteinlucene' | 'levenshteinsecondstring' | 'levenshteinlimes' | 'cosineppjoin+fullycached' | 'cosineppjoin' | 'cosinesimmetrics' | 'jaccardppjoin+fullycached' | 'jaccardppjoin+' | 'jaccardsecondstring' | 'jaccardsimmetrics' | 'jarowinklerlucene' | 'tfidflucenefullycached' | 'tfidflucenefullycachedalternative' | 'tfidfsecondstring' | 'ngramtzk' )
            {
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:145:14: ( 'trigram' | 'soundex' | 'editdist' | 'datatypesimilarity' | 'featvect' | 'tfidf' | 'usersyn' | 'cosine' | 'jaccard' | 'jarowinkler' | 'sim_equal' | 'trigramcoma' | 'trigramifuice' | 'trigramlowmem' | 'trigramopt' | 'edjoin' | 'levenshteinlucene' | 'levenshteinsecondstring' | 'levenshteinlimes' | 'cosineppjoin+fullycached' | 'cosineppjoin' | 'cosinesimmetrics' | 'jaccardppjoin+fullycached' | 'jaccardppjoin+' | 'jaccardsecondstring' | 'jaccardsimmetrics' | 'jarowinklerlucene' | 'tfidflucenefullycached' | 'tfidflucenefullycachedalternative' | 'tfidfsecondstring' | 'ngramtzk' )
            int alt4=31;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:145:15: 'trigram'
                    {
                    match("trigram"); 



                    }
                    break;
                case 2 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:145:27: 'soundex'
                    {
                    match("soundex"); 



                    }
                    break;
                case 3 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:145:39: 'editdist'
                    {
                    match("editdist"); 



                    }
                    break;
                case 4 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:145:52: 'datatypesimilarity'
                    {
                    match("datatypesimilarity"); 



                    }
                    break;
                case 5 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:145:75: 'featvect'
                    {
                    match("featvect"); 



                    }
                    break;
                case 6 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:145:88: 'tfidf'
                    {
                    match("tfidf"); 



                    }
                    break;
                case 7 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:146:5: 'usersyn'
                    {
                    match("usersyn"); 



                    }
                    break;
                case 8 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:146:17: 'cosine'
                    {
                    match("cosine"); 



                    }
                    break;
                case 9 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:146:28: 'jaccard'
                    {
                    match("jaccard"); 



                    }
                    break;
                case 10 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:146:40: 'jarowinkler'
                    {
                    match("jarowinkler"); 



                    }
                    break;
                case 11 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:146:56: 'sim_equal'
                    {
                    match("sim_equal"); 



                    }
                    break;
                case 12 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:147:5: 'trigramcoma'
                    {
                    match("trigramcoma"); 



                    }
                    break;
                case 13 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:147:21: 'trigramifuice'
                    {
                    match("trigramifuice"); 



                    }
                    break;
                case 14 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:147:39: 'trigramlowmem'
                    {
                    match("trigramlowmem"); 



                    }
                    break;
                case 15 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:147:57: 'trigramopt'
                    {
                    match("trigramopt"); 



                    }
                    break;
                case 16 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:147:72: 'edjoin'
                    {
                    match("edjoin"); 



                    }
                    break;
                case 17 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:148:5: 'levenshteinlucene'
                    {
                    match("levenshteinlucene"); 



                    }
                    break;
                case 18 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:148:27: 'levenshteinsecondstring'
                    {
                    match("levenshteinsecondstring"); 



                    }
                    break;
                case 19 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:148:55: 'levenshteinlimes'
                    {
                    match("levenshteinlimes"); 



                    }
                    break;
                case 20 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:148:75: 'cosineppjoin+fullycached'
                    {
                    match("cosineppjoin+fullycached"); 



                    }
                    break;
                case 21 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:148:104: 'cosineppjoin'
                    {
                    match("cosineppjoin"); 



                    }
                    break;
                case 22 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:148:121: 'cosinesimmetrics'
                    {
                    match("cosinesimmetrics"); 



                    }
                    break;
                case 23 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:149:5: 'jaccardppjoin+fullycached'
                    {
                    match("jaccardppjoin+fullycached"); 



                    }
                    break;
                case 24 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:149:35: 'jaccardppjoin+'
                    {
                    match("jaccardppjoin+"); 



                    }
                    break;
                case 25 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:149:54: 'jaccardsecondstring'
                    {
                    match("jaccardsecondstring"); 



                    }
                    break;
                case 26 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:149:78: 'jaccardsimmetrics'
                    {
                    match("jaccardsimmetrics"); 



                    }
                    break;
                case 27 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:149:100: 'jarowinklerlucene'
                    {
                    match("jarowinklerlucene"); 



                    }
                    break;
                case 28 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:150:5: 'tfidflucenefullycached'
                    {
                    match("tfidflucenefullycached"); 



                    }
                    break;
                case 29 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:150:32: 'tfidflucenefullycachedalternative'
                    {
                    match("tfidflucenefullycachedalternative"); 



                    }
                    break;
                case 30 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:150:70: 'tfidfsecondstring'
                    {
                    match("tfidfsecondstring"); 



                    }
                    break;
                case 31 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:150:92: 'ngramtzk'
                    {
                    match("ngramtzk"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SIMMEASURE"

    // $ANTLR start "SETCOMBINATION"
    public final void mSETCOMBINATION() throws RecognitionException {
        try {
            int _type = SETCOMBINATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:152:15: ( ( 'set_average' | 'set_dice' | 'set_max' | 'set_min' | 'set_highest' ) )
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:152:18: ( 'set_average' | 'set_dice' | 'set_max' | 'set_min' | 'set_highest' )
            {
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:152:18: ( 'set_average' | 'set_dice' | 'set_max' | 'set_min' | 'set_highest' )
            int alt5=5;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='s') ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1=='e') ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2=='t') ) {
                        int LA5_3 = input.LA(4);

                        if ( (LA5_3=='_') ) {
                            switch ( input.LA(5) ) {
                            case 'a':
                                {
                                alt5=1;
                                }
                                break;
                            case 'd':
                                {
                                alt5=2;
                                }
                                break;
                            case 'm':
                                {
                                int LA5_7 = input.LA(6);

                                if ( (LA5_7=='a') ) {
                                    alt5=3;
                                }
                                else if ( (LA5_7=='i') ) {
                                    alt5=4;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 5, 7, input);

                                    throw nvae;

                                }
                                }
                                break;
                            case 'h':
                                {
                                alt5=5;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 4, input);

                                throw nvae;

                            }

                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 3, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:152:19: 'set_average'
                    {
                    match("set_average"); 



                    }
                    break;
                case 2 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:152:35: 'set_dice'
                    {
                    match("set_dice"); 



                    }
                    break;
                case 3 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:152:48: 'set_max'
                    {
                    match("set_max"); 



                    }
                    break;
                case 4 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:152:60: 'set_min'
                    {
                    match("set_min"); 



                    }
                    break;
                case 5 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:152:72: 'set_highest'
                    {
                    match("set_highest"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SETCOMBINATION"

    // $ANTLR start "COMPOSITION"
    public final void mCOMPOSITION() throws RecognitionException {
        try {
            int _type = COMPOSITION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:154:12: ( ( 'com_average' | 'com_max' | 'com_min' ) )
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:154:16: ( 'com_average' | 'com_max' | 'com_min' )
            {
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:154:16: ( 'com_average' | 'com_max' | 'com_min' )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='c') ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1=='o') ) {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2=='m') ) {
                        int LA6_3 = input.LA(4);

                        if ( (LA6_3=='_') ) {
                            int LA6_4 = input.LA(5);

                            if ( (LA6_4=='a') ) {
                                alt6=1;
                            }
                            else if ( (LA6_4=='m') ) {
                                int LA6_6 = input.LA(6);

                                if ( (LA6_6=='a') ) {
                                    alt6=2;
                                }
                                else if ( (LA6_6=='i') ) {
                                    alt6=3;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 6, 6, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 6, 4, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 3, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:154:17: 'com_average'
                    {
                    match("com_average"); 



                    }
                    break;
                case 2 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:154:33: 'com_max'
                    {
                    match("com_max"); 



                    }
                    break;
                case 3 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:154:45: 'com_min'
                    {
                    match("com_min"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMPOSITION"

    // $ANTLR start "SIMCOMBINATION1"
    public final void mSIMCOMBINATION1() throws RecognitionException {
        try {
            int _type = SIMCOMBINATION1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:156:17: ( ( 'max' | 'min' | 'average' | 'nonlinear' | 'openii' | 'harmony' | 'sigmoid' | 'owa' | 'owa_most' | 'weighted2' ) )
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:156:20: ( 'max' | 'min' | 'average' | 'nonlinear' | 'openii' | 'harmony' | 'sigmoid' | 'owa' | 'owa_most' | 'weighted2' )
            {
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:156:20: ( 'max' | 'min' | 'average' | 'nonlinear' | 'openii' | 'harmony' | 'sigmoid' | 'owa' | 'owa_most' | 'weighted2' )
            int alt7=10;
            switch ( input.LA(1) ) {
            case 'm':
                {
                int LA7_1 = input.LA(2);

                if ( (LA7_1=='a') ) {
                    alt7=1;
                }
                else if ( (LA7_1=='i') ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;

                }
                }
                break;
            case 'a':
                {
                alt7=3;
                }
                break;
            case 'n':
                {
                alt7=4;
                }
                break;
            case 'o':
                {
                int LA7_4 = input.LA(2);

                if ( (LA7_4=='p') ) {
                    alt7=5;
                }
                else if ( (LA7_4=='w') ) {
                    int LA7_11 = input.LA(3);

                    if ( (LA7_11=='a') ) {
                        int LA7_12 = input.LA(4);

                        if ( (LA7_12=='_') ) {
                            alt7=9;
                        }
                        else {
                            alt7=8;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 11, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 4, input);

                    throw nvae;

                }
                }
                break;
            case 'h':
                {
                alt7=6;
                }
                break;
            case 's':
                {
                alt7=7;
                }
                break;
            case 'w':
                {
                alt7=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:156:21: 'max'
                    {
                    match("max"); 



                    }
                    break;
                case 2 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:156:29: 'min'
                    {
                    match("min"); 



                    }
                    break;
                case 3 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:156:37: 'average'
                    {
                    match("average"); 



                    }
                    break;
                case 4 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:156:49: 'nonlinear'
                    {
                    match("nonlinear"); 



                    }
                    break;
                case 5 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:156:63: 'openii'
                    {
                    match("openii"); 



                    }
                    break;
                case 6 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:156:74: 'harmony'
                    {
                    match("harmony"); 



                    }
                    break;
                case 7 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:156:86: 'sigmoid'
                    {
                    match("sigmoid"); 



                    }
                    break;
                case 8 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:156:98: 'owa'
                    {
                    match("owa"); 



                    }
                    break;
                case 9 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:156:106: 'owa_most'
                    {
                    match("owa_most"); 



                    }
                    break;
                case 10 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:156:119: 'weighted2'
                    {
                    match("weighted2"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SIMCOMBINATION1"

    // $ANTLR start "SIMCOMBINATION2"
    public final void mSIMCOMBINATION2() throws RecognitionException {
        try {
            int _type = SIMCOMBINATION2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:157:17: ( ( 'weighted' ) )
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:157:19: ( 'weighted' )
            {
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:157:19: ( 'weighted' )
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:157:20: 'weighted'
            {
            match("weighted"); 



            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SIMCOMBINATION2"

    // $ANTLR start "RESULT_COMBINATION"
    public final void mRESULT_COMBINATION() throws RecognitionException {
        try {
            int _type = RESULT_COMBINATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:159:20: ( ( 'intersect' | 'diff' | 'merge' ) )
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:159:23: ( 'intersect' | 'diff' | 'merge' )
            {
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:159:23: ( 'intersect' | 'diff' | 'merge' )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 'i':
                {
                alt8=1;
                }
                break;
            case 'd':
                {
                alt8=2;
                }
                break;
            case 'm':
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }

            switch (alt8) {
                case 1 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:159:25: 'intersect'
                    {
                    match("intersect"); 



                    }
                    break;
                case 2 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:159:39: 'diff'
                    {
                    match("diff"); 



                    }
                    break;
                case 3 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:159:48: 'merge'
                    {
                    match("merge"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RESULT_COMBINATION"

    // $ANTLR start "DIRECTION"
    public final void mDIRECTION() throws RecognitionException {
        try {
            int _type = DIRECTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:162:11: ( ( 'both' | 'forward' | 'backward' | 'simple' ) )
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:162:14: ( 'both' | 'forward' | 'backward' | 'simple' )
            {
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:162:14: ( 'both' | 'forward' | 'backward' | 'simple' )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 'b':
                {
                int LA9_1 = input.LA(2);

                if ( (LA9_1=='o') ) {
                    alt9=1;
                }
                else if ( (LA9_1=='a') ) {
                    alt9=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;

                }
                }
                break;
            case 'f':
                {
                alt9=2;
                }
                break;
            case 's':
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:162:15: 'both'
                    {
                    match("both"); 



                    }
                    break;
                case 2 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:162:24: 'forward'
                    {
                    match("forward"); 



                    }
                    break;
                case 3 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:162:36: 'backward'
                    {
                    match("backward"); 



                    }
                    break;
                case 4 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:162:49: 'simple'
                    {
                    match("simple"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIRECTION"

    // $ANTLR start "SELECTION_THRESHOLD"
    public final void mSELECTION_THRESHOLD() throws RecognitionException {
        try {
            int _type = SELECTION_THRESHOLD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:164:21: ( ( 'threshold' ) )
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:164:24: ( 'threshold' )
            {
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:164:24: ( 'threshold' )
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:164:25: 'threshold'
            {
            match("threshold"); 



            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SELECTION_THRESHOLD"

    // $ANTLR start "SELECTION_MAXDELTA"
    public final void mSELECTION_MAXDELTA() throws RecognitionException {
        try {
            int _type = SELECTION_MAXDELTA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:165:20: ( ( 'maxdelta' ) )
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:165:23: ( 'maxdelta' )
            {
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:165:23: ( 'maxdelta' )
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:165:24: 'maxdelta'
            {
            match("maxdelta"); 



            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SELECTION_MAXDELTA"

    // $ANTLR start "SELECTION_MAXN"
    public final void mSELECTION_MAXN() throws RecognitionException {
        try {
            int _type = SELECTION_MAXN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:166:16: ( ( 'maxn' ) )
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:166:19: ( 'maxn' )
            {
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:166:19: ( 'maxn' )
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:166:20: 'maxn'
            {
            match("maxn"); 



            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SELECTION_MAXN"

    // $ANTLR start "SELECTION_MULTIPLE"
    public final void mSELECTION_MULTIPLE() throws RecognitionException {
        try {
            int _type = SELECTION_MULTIPLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:167:20: ( ( 'multiple' ) )
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:167:23: ( 'multiple' )
            {
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:167:23: ( 'multiple' )
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:167:24: 'multiple'
            {
            match("multiple"); 



            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SELECTION_MULTIPLE"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            int _type = DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:170:7: ( '0' .. '9' )
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "V2"
    public final void mV2() throws RecognitionException {
        try {
            int _type = V2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:171:4: ( ( DIGIT )+ )
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:171:8: ( DIGIT )+
            {
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:171:8: ( DIGIT )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "V2"

    // $ANTLR start "V1"
    public final void mV1() throws RecognitionException {
        try {
            int _type = V1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:172:4: ( ( ( '0' CHAR_DOT ( DIGIT )+ ) | '1.0' | '1' | '0' ) )
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:172:9: ( ( '0' CHAR_DOT ( DIGIT )+ ) | '1.0' | '1' | '0' )
            {
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:172:9: ( ( '0' CHAR_DOT ( DIGIT )+ ) | '1.0' | '1' | '0' )
            int alt12=4;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='0') ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1=='.') ) {
                    alt12=1;
                }
                else {
                    alt12=4;
                }
            }
            else if ( (LA12_0=='1') ) {
                int LA12_2 = input.LA(2);

                if ( (LA12_2=='.') ) {
                    alt12=2;
                }
                else {
                    alt12=3;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:172:11: ( '0' CHAR_DOT ( DIGIT )+ )
                    {
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:172:11: ( '0' CHAR_DOT ( DIGIT )+ )
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:172:12: '0' CHAR_DOT ( DIGIT )+
                    {
                    match('0'); 

                    mCHAR_DOT(); 


                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:172:25: ( DIGIT )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:172:35: '1.0'
                    {
                    match("1.0"); 



                    }
                    break;
                case 3 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:172:43: '1'
                    {
                    match('1'); 

                    }
                    break;
                case 4 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:172:49: '0'
                    {
                    match('0'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "V1"

    // $ANTLR start "BOOLEAN"
    public final void mBOOLEAN() throws RecognitionException {
        try {
            int _type = BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:173:8: ( ( 'true' | 'false' ) )
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:173:11: ( 'true' | 'false' )
            {
            // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:173:11: ( 'true' | 'false' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='t') ) {
                alt13=1;
            }
            else if ( (LA13_0=='f') ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:173:12: 'true'
                    {
                    match("true"); 



                    }
                    break;
                case 2 :
                    // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:173:21: 'false'
                    {
                    match("false"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BOOLEAN"

    public void mTokens() throws RecognitionException {
        // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:1:8: ( CHAR_BRACE_LEFT | CHAR_BRACE_RIGHT | CHAR_COMMA | CHAR_DOT | CHAR_SEMICOLON | RESOLUTION_1 | RESOLUTION_2 | RESOLUTION_3 | SIMMEASURE | SETCOMBINATION | COMPOSITION | SIMCOMBINATION1 | SIMCOMBINATION2 | RESULT_COMBINATION | DIRECTION | SELECTION_THRESHOLD | SELECTION_MAXDELTA | SELECTION_MAXN | SELECTION_MULTIPLE | DIGIT | V2 | V1 | BOOLEAN )
        int alt14=23;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:1:10: CHAR_BRACE_LEFT
                {
                mCHAR_BRACE_LEFT(); 


                }
                break;
            case 2 :
                // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:1:26: CHAR_BRACE_RIGHT
                {
                mCHAR_BRACE_RIGHT(); 


                }
                break;
            case 3 :
                // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:1:43: CHAR_COMMA
                {
                mCHAR_COMMA(); 


                }
                break;
            case 4 :
                // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:1:54: CHAR_DOT
                {
                mCHAR_DOT(); 


                }
                break;
            case 5 :
                // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:1:63: CHAR_SEMICOLON
                {
                mCHAR_SEMICOLON(); 


                }
                break;
            case 6 :
                // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:1:78: RESOLUTION_1
                {
                mRESOLUTION_1(); 


                }
                break;
            case 7 :
                // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:1:91: RESOLUTION_2
                {
                mRESOLUTION_2(); 


                }
                break;
            case 8 :
                // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:1:104: RESOLUTION_3
                {
                mRESOLUTION_3(); 


                }
                break;
            case 9 :
                // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:1:117: SIMMEASURE
                {
                mSIMMEASURE(); 


                }
                break;
            case 10 :
                // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:1:128: SETCOMBINATION
                {
                mSETCOMBINATION(); 


                }
                break;
            case 11 :
                // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:1:143: COMPOSITION
                {
                mCOMPOSITION(); 


                }
                break;
            case 12 :
                // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:1:155: SIMCOMBINATION1
                {
                mSIMCOMBINATION1(); 


                }
                break;
            case 13 :
                // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:1:171: SIMCOMBINATION2
                {
                mSIMCOMBINATION2(); 


                }
                break;
            case 14 :
                // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:1:187: RESULT_COMBINATION
                {
                mRESULT_COMBINATION(); 


                }
                break;
            case 15 :
                // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:1:206: DIRECTION
                {
                mDIRECTION(); 


                }
                break;
            case 16 :
                // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:1:216: SELECTION_THRESHOLD
                {
                mSELECTION_THRESHOLD(); 


                }
                break;
            case 17 :
                // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:1:236: SELECTION_MAXDELTA
                {
                mSELECTION_MAXDELTA(); 


                }
                break;
            case 18 :
                // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:1:255: SELECTION_MAXN
                {
                mSELECTION_MAXN(); 


                }
                break;
            case 19 :
                // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:1:270: SELECTION_MULTIPLE
                {
                mSELECTION_MULTIPLE(); 


                }
                break;
            case 20 :
                // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:1:289: DIGIT
                {
                mDIGIT(); 


                }
                break;
            case 21 :
                // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:1:295: V2
                {
                mV2(); 


                }
                break;
            case 22 :
                // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:1:298: V1
                {
                mV1(); 


                }
                break;
            case 23 :
                // /Users/gio/Documents/COMA/FITMAN-SeMa/coma-engine/resources/ComaWorkFlow.g:1:301: BOOLEAN
                {
                mBOOLEAN(); 


                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA4_eotS =
        "\42\uffff\1\52\10\uffff\1\63\3\uffff\1\73\4\uffff\1\100\35\uffff"+
        "\1\130\2\uffff\1\135\14\uffff\1\145\11\uffff\1\156\2\uffff";
    static final String DFA4_eofS =
        "\157\uffff";
    static final String DFA4_minS =
        "\1\143\1\146\1\151\1\144\3\uffff\1\157\1\141\1\145\1\uffff\2\151"+
        "\2\uffff\1\151\1\163\1\143\1\166\1\147\1\144\2\uffff\1\151\1\143"+
        "\1\157\1\145\1\162\1\146\1\156\1\141\1\167\1\156\1\141\1\154\1\145"+
        "\1\162\1\151\1\163\1\155\1\165\2\uffff\1\160\1\144\1\156\1\150\2"+
        "\143\1\160\2\uffff\1\160\1\153\1\164\5\uffff\1\145\1\152\1\160\1"+
        "\145\1\uffff\1\154\1\145\1\156\1\157\1\152\2\uffff\1\145\1\151\1"+
        "\145\1\151\1\157\1\162\1\156\1\146\1\156\1\151\2\154\1\165\1\53"+
        "\1\156\2\uffff\1\151\1\uffff\1\154\2\uffff\1\53\2\uffff\1\154\1"+
        "\146\1\171\2\uffff\1\143\1\141\1\143\1\150\1\145\1\144\1\141\2\uffff";
    static final String DFA4_maxS =
        "\1\165\1\162\1\157\1\144\3\uffff\1\157\1\141\1\145\1\uffff\2\151"+
        "\2\uffff\1\152\1\163\1\162\1\166\1\147\1\144\2\uffff\1\151\1\143"+
        "\1\157\1\145\1\162\1\146\1\156\1\141\1\167\1\156\1\141\1\163\1\145"+
        "\1\162\1\151\1\163\1\155\1\165\2\uffff\1\163\1\144\1\156\1\150\1"+
        "\157\1\143\1\160\2\uffff\1\163\1\153\1\164\5\uffff\1\145\1\152\1"+
        "\160\1\151\1\uffff\1\154\1\145\1\156\1\157\1\152\2\uffff\1\145\1"+
        "\151\1\145\1\151\1\157\1\162\1\156\1\146\1\156\1\151\1\154\1\163"+
        "\1\165\1\53\1\156\2\uffff\1\165\1\uffff\1\154\2\uffff\1\53\2\uffff"+
        "\1\154\1\146\1\171\2\uffff\1\143\1\141\1\143\1\150\1\145\1\144\1"+
        "\141\2\uffff";
    static final String DFA4_acceptS =
        "\4\uffff\1\4\1\5\1\7\3\uffff\1\37\2\uffff\1\2\1\13\6\uffff\1\3\1"+
        "\20\22\uffff\1\36\1\6\7\uffff\1\26\1\10\3\uffff\1\14\1\15\1\16\1"+
        "\17\1\1\4\uffff\1\11\5\uffff\1\31\1\32\17\uffff\1\33\1\12\1\uffff"+
        "\1\22\1\uffff\1\24\1\25\1\uffff\1\21\1\23\3\uffff\1\27\1\30\7\uffff"+
        "\1\35\1\34";
    static final String DFA4_specialS =
        "\157\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\7\1\4\1\3\1\5\3\uffff\1\10\1\uffff\1\11\1\uffff\1\12\4\uffff"+
            "\1\2\1\1\1\6",
            "\1\14\13\uffff\1\13",
            "\1\16\5\uffff\1\15",
            "\1\17",
            "",
            "",
            "",
            "\1\20",
            "\1\21",
            "\1\22",
            "",
            "\1\23",
            "\1\24",
            "",
            "",
            "\1\25\1\26",
            "\1\27",
            "\1\30\16\uffff\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "",
            "",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50\6\uffff\1\51",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "",
            "",
            "\1\61\2\uffff\1\62",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67\5\uffff\1\70\2\uffff\1\71\2\uffff\1\72",
            "\1\74",
            "\1\75",
            "",
            "",
            "\1\76\2\uffff\1\77",
            "\1\101",
            "\1\102",
            "",
            "",
            "",
            "",
            "",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106\3\uffff\1\107",
            "",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "",
            "",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\131\6\uffff\1\132",
            "\1\133",
            "\1\134",
            "\1\136",
            "",
            "",
            "\1\140\13\uffff\1\137",
            "",
            "\1\141",
            "",
            "",
            "\1\142",
            "",
            "",
            "\1\143",
            "\1\144",
            "\1\146",
            "",
            "",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "145:14: ( 'trigram' | 'soundex' | 'editdist' | 'datatypesimilarity' | 'featvect' | 'tfidf' | 'usersyn' | 'cosine' | 'jaccard' | 'jarowinkler' | 'sim_equal' | 'trigramcoma' | 'trigramifuice' | 'trigramlowmem' | 'trigramopt' | 'edjoin' | 'levenshteinlucene' | 'levenshteinsecondstring' | 'levenshteinlimes' | 'cosineppjoin+fullycached' | 'cosineppjoin' | 'cosinesimmetrics' | 'jaccardppjoin+fullycached' | 'jaccardppjoin+' | 'jaccardsecondstring' | 'jaccardsimmetrics' | 'jarowinklerlucene' | 'tfidflucenefullycached' | 'tfidflucenefullycachedalternative' | 'tfidfsecondstring' | 'ngramtzk' )";
        }
    }
    static final String DFA14_eotS =
        "\27\uffff\3\54\34\uffff\1\24\1\uffff\1\36\1\12\5\uffff\1\12\6\uffff"+
        "\1\36\1\110\1\uffff";
    static final String DFA14_eofS =
        "\111\uffff";
    static final String DFA14_minS =
        "\1\50\5\uffff\1\141\1\156\1\145\1\141\1\uffff\1\145\1\160\1\141"+
        "\1\150\1\154\1\146\1\uffff\2\141\1\uffff\1\145\1\uffff\2\56\1\60"+
        "\1\162\1\156\1\141\1\144\1\uffff\1\154\1\142\1\uffff\1\145\1\164"+
        "\1\uffff\1\155\1\151\2\uffff\1\170\1\uffff\1\151\3\uffff\1\150\1"+
        "\146\1\uffff\1\137\1\162\1\141\1\137\1\144\1\147\2\163\1\164\3\uffff"+
        "\1\150\2\171\1\164\1\160\2\145\1\144\1\163\1\62\1\uffff";
    static final String DFA14_maxS =
        "\1\167\5\uffff\1\141\1\156\1\145\1\157\1\uffff\1\171\1\163\2\157"+
        "\1\166\1\162\1\uffff\1\157\1\165\1\uffff\1\145\1\uffff\3\71\2\164"+
        "\1\166\1\156\1\uffff\1\164\1\155\1\uffff\1\145\1\164\1\uffff\1\163"+
        "\1\165\2\uffff\1\170\1\uffff\1\151\3\uffff\1\150\1\166\1\uffff\1"+
        "\160\1\162\1\141\1\155\1\156\1\147\2\163\1\164\3\uffff\1\150\2\171"+
        "\1\164\1\160\2\145\1\144\1\163\1\62\1\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\4\uffff\1\6\6\uffff\1\11\2\uffff\1"+
        "\14\1\uffff\1\17\7\uffff\1\10\2\uffff\1\7\2\uffff\1\16\2\uffff\1"+
        "\20\1\27\1\uffff\1\23\1\uffff\1\24\1\25\1\26\2\uffff\1\12\11\uffff"+
        "\1\13\1\21\1\22\12\uffff\1\15";
    static final String DFA14_specialS =
        "\111\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\1\1\2\2\uffff\1\3\1\uffff\1\4\1\uffff\1\27\1\30\10\31\1\uffff"+
            "\1\5\45\uffff\1\17\1\26\1\16\1\15\1\21\1\22\1\uffff\1\24\1\7"+
            "\1\21\1\uffff\1\10\1\23\1\11\1\24\1\6\1\uffff\1\12\1\13\1\20"+
            "\1\14\1\uffff\1\25",
            "",
            "",
            "",
            "",
            "",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\36\5\uffff\1\21\7\uffff\1\35",
            "",
            "\1\37\2\uffff\1\12\1\40\5\uffff\1\21\4\uffff\1\36\1\41\3\uffff"+
            "\1\36",
            "\1\12\2\uffff\1\42",
            "\1\43\7\uffff\1\44\5\uffff\1\12",
            "\1\41\6\uffff\1\45",
            "\1\41\11\uffff\1\24",
            "\1\21\1\uffff\1\47\11\uffff\1\46",
            "",
            "\1\50\3\uffff\1\21\11\uffff\1\26",
            "\1\51\3\uffff\1\44\3\uffff\1\24\13\uffff\1\52",
            "",
            "\1\53",
            "",
            "\1\56\1\uffff\12\55",
            "\1\56\1\uffff\12\55",
            "\12\55",
            "\1\41\1\uffff\1\57",
            "\1\12\4\uffff\1\36\1\44",
            "\1\60\24\uffff\1\21",
            "\1\12\11\uffff\1\24",
            "",
            "\1\41\7\uffff\1\61",
            "\1\41\4\uffff\1\24\5\uffff\1\62",
            "",
            "\1\63",
            "\1\64",
            "",
            "\1\65\5\uffff\1\21",
            "\1\21\13\uffff\1\50",
            "",
            "",
            "\1\66",
            "",
            "\1\67",
            "",
            "",
            "",
            "\1\70",
            "\1\12\17\uffff\1\41",
            "",
            "\1\21\20\uffff\1\26",
            "\1\71",
            "\1\72",
            "\1\73\15\uffff\1\36",
            "\1\74\11\uffff\1\75",
            "\1\76",
            "\1\77",
            "\1\21",
            "\1\100",
            "",
            "",
            "",
            "\1\101",
            "\1\36",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\21",
            "\1\24",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( CHAR_BRACE_LEFT | CHAR_BRACE_RIGHT | CHAR_COMMA | CHAR_DOT | CHAR_SEMICOLON | RESOLUTION_1 | RESOLUTION_2 | RESOLUTION_3 | SIMMEASURE | SETCOMBINATION | COMPOSITION | SIMCOMBINATION1 | SIMCOMBINATION2 | RESULT_COMBINATION | DIRECTION | SELECTION_THRESHOLD | SELECTION_MAXDELTA | SELECTION_MAXN | SELECTION_MULTIPLE | DIGIT | V2 | V1 | BOOLEAN );";
        }
    }
 

}