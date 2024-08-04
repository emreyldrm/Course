package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number, sum = 0;

        Scanner inp = new Scanner(System.in);



        do{
            System.out.print("Enter a number: ");
            number = inp.nextInt();
            if (number % 4 == 0){
                sum += number;
            }
        }while (number % 2 != 1);

        System.out.println("Total is: " + sum);

    }
}