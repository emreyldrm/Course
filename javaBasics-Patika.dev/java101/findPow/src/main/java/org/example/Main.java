package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = inp.nextInt();

        for (int i=1; i <= number; i*=4){
            System.out.println("Powers of 4: " + i);

        }
        for (int j=1; j <= number; j*=5){
            System.out.println("Powers of 5: " + j);
        }

    }
}