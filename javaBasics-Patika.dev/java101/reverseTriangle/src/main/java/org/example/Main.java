package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num;

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = inp.nextInt();

        for (int i = 1; i <= num; i++){
            for (int k = 0; k < i - 1; k++) {
                System.out.print(" ");
            }
            for (int j = (2*num - 2*i + 1); j >= 1 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}