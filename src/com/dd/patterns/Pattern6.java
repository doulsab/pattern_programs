package com.dd.patterns;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
//        Pattern 6.
        /*
         * + + + + +
         * +       +
         * +       +
         * +       +
         * + + + + +
         *
         * */
        System.out.println("Enter number to print pattern");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(i == 1 || i == n || j == 1 || j ==  n){
                    System.out.print("+ ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
