/*
   This file is provided exclusively for the purpose of Spartez Online Assessment.
   Unauthorized distribution of this file, derived work or information about its
   content, via any medium, is strictly prohibited.
 */
package main.java.mapdecoder;

import java.util.Map;

public interface MapDecoder
{
    /**
     * Decodes the given String into a Map. The String format is a URL parameter string (key=value&key=value&...).
     * Empty keys and values are allowed.
     *
     * @param s     the String to decode
     * @return a    Map representing the given String. If the given String is empty, an empty Map is returned. If the given
     *              String is null, null is returned.
     * @throws IllegalArgumentException if the given String has an invalid format
     */
    Map<String, String> decode(String s);
}
