package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num;
        double total = 0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = inp.nextInt();

        for (int i = 1; i <= num; i++){
            total += (1.0/i);
        }

        System.out.println("Total is: " + total);
    }
}