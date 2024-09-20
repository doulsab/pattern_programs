package com.dd.patterns;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
//        Pattern 3.
//        i = line , j = + , k = space or _(underscore).
        /*
         * _ + + + + +
         * _ _ + + + +
         * _ _ _ + + +
         * _ _ _ _ + +
         * _ _ _ _ _ +
         * */
        System.out.println("Enter number to print pattern");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for(int k = 0; k <=i ; k++ ){
                System.out.print("_ ");// space or _(underscore).
            }
            for (int j = n; j > i; j--) {
                System.out.print("+ ");
            }

            System.out.println();
        }
    }
}
