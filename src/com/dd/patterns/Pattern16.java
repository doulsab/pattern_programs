package com.dd.patterns;

import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        // dollar will iterate 2(line)-1 i.e (1,3,5,7....)
        /*
         * - - - - - $
         * - - - - $ $ $
         * - - - $ $ $ $ $
         * - - $ $ $ $ $ $ $
         * - $ $ $ $ $ $ $ $ $
         */
        System.out.println("Enter number to print pattern");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("- ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("$ ");
            }
            System.out.println("  ");
        }
    }
}
