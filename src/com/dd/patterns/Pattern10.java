package com.dd.patterns;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
//        Pattern 10.
        /*
         * - - - - -         -
         *         -         -
         *         -         -
         *         -         -
         * - - - - - - - - - -
         * -       -
         * -       -
         * -       -
         * -       -
         * -       - - - - - -
         */
        System.out.println("Enter number to print pattern");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(( j == 1 && i >= n/2 ) || ( i == n/2)  || (i <= n/2 && j == n) ||
                        ( i == 1 && j <= n/2 ) || ( j == n/2) || (j >= n/2 && i == n)){
                    System.out.print("- ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
