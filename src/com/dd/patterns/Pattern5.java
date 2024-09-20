package com.dd.patterns;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
// pattern 4 , pattern 1 ,pattern 3, pattern 2

        /*
         *
         *              +  +
         *            + +  + +
         *          + + +  + + +
         *        + + + +  + + + +
         *      + + + + +  + + + + +
         *      + + + + +  + + + + +
         *        + + + +  + + + +
         *          + + +  + + +
         *            + +  + +
         *              +  +
         *
         */

        System.out.println("Enter number to print pattern");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int k = n - i - 1; k > 0; k--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("+ ");
            }
            System.out.print("  ");

            for (int j = 0; j <= i; j++) {
                System.out.print("+ ");
            }
            System.out.println();
        }

        for (int i = n; i > 0; i--) {
            for (int k = n - i; k > 0; k--) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("+ ");
            }
            System.out.print("  ");
            for (int j = 0; j < i; j++) {
                System.out.print("+ ");
            }
            System.out.println();
        }
    }

}
