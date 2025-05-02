/**
 * File: Lab12Prob01.java
 * Class: CSCI 1302
 * Author: Alex Reagin Brenden Stancil 
 * Created on: May 2, 2025
 * Last Modified: May 2, 2025
 * Description: 
 */
public class Lab12Prob01 {

    public static void main(String[] args) {
        for (int i = 0; i <= 7; i++) {
            System.out.printf("f(%d) = %d%n", i, recursiveAbstract(i));
        }
    }

    public static int recursiveAbstract(int n) {
        if (n == 0) {
            return 1;
        } 
        if (n == 1) {
            return 3;
        } 
        if (n == 2) {
            return 4;
        }

        return recursiveAbstract(n - 3)
             * (recursiveAbstract(n - 2) - recursiveAbstract(n - 1));
    }
}