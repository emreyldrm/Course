package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numCount, min, max, tempNum;

        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers will you enter: ");
        numCount = scanner.nextInt();
        System.out.print("Enter the 1. number: ");
        tempNum = scanner.nextInt();
        min = tempNum;
        max = tempNum;
        for (int i = 2; i <= numCount ; i++) {
            System.out.print("Enter the " + i + ". number: ");
            tempNum = scanner.nextInt();
            if (tempNum < min){
                min = tempNum;
            }
            if (tempNum > max){
                max = tempNum;
            }
        }
        System.out.println("Biggest number is: " + max);
        System.out.println("Smallest number is: " + min);

    }
}