package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num, previous = 0, tempNum, next = 1;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = inp.nextInt();

        for (int i = 1; i <= num ; i++) {
            System.out.print(previous + " ");
            tempNum = next;
            next += previous;
            previous = tempNum;

        }

    }
}