package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num, pow, total = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        num = scanner.nextInt();

        System.out.print("Enter the exponent: ");
        pow = scanner.nextInt();

        for (int i = 1; i <= pow; i++){
            total*= num;
        }

        System.out.println("Total is: " + total);
    }
}