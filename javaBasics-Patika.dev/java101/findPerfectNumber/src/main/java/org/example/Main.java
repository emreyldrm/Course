package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num, total = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = scanner.nextInt();

        for (int i = 1; i < num ; i++) {
            if (num % i == 0){
                total += i;
            }
        }
        if (total == num){
            System.out.println(num + " is a perfect number");
        }else {
            System.out.println(num + " is not a perfect number");
        }

    }
}