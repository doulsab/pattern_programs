package com.dd.patterns;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
//        Pattern 7.
        /*
         * +
         * + +
         * +   +
         * +     +
         * + + + + +
         *
         * */
        System.out.println("Enter number to print pattern");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(i == j || i == n || j == 1 ){
                    System.out.print("+ ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
