package org.example;

import java.util.Scanner;

public class Main {

    static void pattern(int num, int temp, int dec){
        if (temp <= 0){
            dec = 5;
            if (temp == num){
                return;
            }
        }
        if (temp > num)
            return;

        System.out.print(temp + " ");
        pattern(num,temp + dec,dec);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.print("Output: ");
        pattern(num, num, -5);

    }
}