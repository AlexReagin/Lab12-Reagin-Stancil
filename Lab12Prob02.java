/**
 * File: Lab12Prob02.java
 * Class: CSCI 1302
 * Author: Alex Reagin Brenden Stancil 
 * Created on: May 2, 2025
 * Last Modified: May 2, 2025
 * Description: 
 */
public class Lab12Prob02 {

    public static void main(String[] args) {
        String[] tests = {
            "a",
            "12345",
            "hello",
            "level",
            ".......",
            "gggggggg"
        };
        for (String s : tests) {
            System.out.printf("Original: %-10s  Reversed: %s%n", s, reverseString(s));
        }
    }

    public static String reverseString(String s) {
        if (s.length() <= 1) {
            return s;
        }
        char lastChar = s.charAt(s.length() - 1);
        String rest    = s.substring(0, s.length() - 1);
        return lastChar + reverseString(rest);
    }
}