/*
 *  COMA 3.0 Community Edition
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Affero General Public License for more details.
 *
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program.  If not, see http://www.gnu.org/licenses/.
 */

package de.wdilab.coma.gui;

import java.net.URL;
import java.net.URLClassLoader;

/**
 * start the COMA++ GUI
 *
 * @author Sabine Massmann
 */
public class Main {
    static void printClasspath() {
        ClassLoader cl = ClassLoader.getSystemClassLoader();
        URL[] urls = ((URLClassLoader) cl).getURLs();
        for (URL url : urls) {
            System.out.println(url.getFile());
        }
    }

    public static void main(String[] _args) throws Exception {
        System.out.println(GUIConstants.COMA_ASCIIART);

        printClasspath();

        Controller c = new Controller();
        c.start();
    }
}