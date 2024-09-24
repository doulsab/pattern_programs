package com.dd.patterns;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        // dollar will starts from 2(n)-line to iterate if n = 5 then (9,7,5,3,1)
        /*
         * - $ $ $ $ $ $ $ $ $
         * - - $ $ $ $ $ $ $
         * - - - $ $ $ $ $
         * - - - - $ $ $
         * - - - - - $
         */
        System.out.println("Enter number to print pattern");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("- ");
            }
            for (int k = (2 * n) - i ; k>=i; k--) {
                System.out.print("$ ");
            }
            System.out.println("  ");
        }
    }
}
