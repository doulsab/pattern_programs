package com.dd.patterns;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        // Upper part from Pattern 16 and Lower part from Pattern15
        /*
         *           $
         *         $ $ $
         *       $ $ $ $ $
         *     $ $ $ $ $ $ $
         *   $ $ $ $ $ $ $ $ $
         *   $ $ $ $ $ $ $ $ $
         *     $ $ $ $ $ $ $
         *       $ $ $ $ $
         *         $ $ $
         *           $
         */
        System.out.println("Enter number to print pattern");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
//       Upper part
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("$ ");
            }
            System.out.println("  ");
        }
//       Lower part
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int k = (2 * n) - i; k >= i; k--) {
                System.out.print("$ ");
            }
            System.out.println("  ");
        }
    }
}
