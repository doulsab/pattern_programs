package com.dd.patterns;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        /*
         * - & & & & &
         * - - & & & & &
         * - - - & & & & &
         * - - - - & & & & &
         * - - - - - & & & & &
         */
        System.out.println("Enter number to print pattern");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("- ");
            }
            for (int k = 1; k <= n; k++) {
                System.out.print("& ");
            }
            System.out.println("  ");
        }
    }
}
