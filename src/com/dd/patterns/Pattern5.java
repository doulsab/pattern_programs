package com.dd.patterns;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        /*
         *
         *              +  +
         *            + +  + +
         *          + + +  + + +
         *        + + + +  + + + +
         *      + + + + +  + + + + +
         *
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
            // pattern 4
            for (int k = n - i - 1; k > 0; k--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("+ ");
            }
            System.out.print("  ");
            // pattern 1
            for (int j = 0; j <= i; j++) {
                System.out.print("+ ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = n; i > 0; i--) {
            // pattern 3
            for (int k = n - i; k > 0; k--) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("+ ");
            }
            System.out.print("  ");
            // pattern 2
            for (int j = 0; j < i; j++) {
                System.out.print("+ ");
            }
            System.out.println();
        }
    }

}
