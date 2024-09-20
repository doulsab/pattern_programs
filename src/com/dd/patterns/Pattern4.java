package com.dd.patterns;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
//        Pattern 4.
//        i = line , j = + , k = space or _(underscore).
        /*
         * _ _ _ _ _ +
         * _ _ _ _ + +
         * _ _ _ + + +
         * _ _ + + + +
         * _ + + + + +
         * */
        System.out.println("Enter number to print pattern");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int k = n; k > i; k--) {
                System.out.print("_ ");// space or _(underscore).
            }
            for(int j = 0; j <=i ; j++ ){
                System.out.print("+ ");
            }
            System.out.println();
        }
    }
}
