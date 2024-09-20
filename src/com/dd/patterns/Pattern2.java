package com.dd.patterns;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
//        Pattern 2.
        /*
         * + + + + +
         * + + + +
         * + + +
         * + +
         * +
         * */
        System.out.println("Enter number to print pattern");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("+ ");
            }
            System.out.println();
        }
    }
}
