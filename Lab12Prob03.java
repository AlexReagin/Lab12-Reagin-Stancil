/**
 * File: Lab12Prob03.java
 * Class: CSCI 1302
 * Author: Alex Reagin Brenden Stancil 
 * Created on: May 2, 2025
 * Last Modified: May 2, 2025
 * Description: 
 */
public class Lab12Prob03 {

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
            System.out.printf("Original: %-10s Reversed: %s%n",
                              s, reverseString(s));
        }
    }

    public static String reverseString(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        return reverseStringHelper(s, s.length() - 1);
    }

    private static String reverseStringHelper(String s, int pointer) {
        if (pointer == 0) {
            return String.valueOf(s.charAt(0));
        }
        return s.charAt(pointer)
             + reverseStringHelper(s, pointer - 1);
    }
}