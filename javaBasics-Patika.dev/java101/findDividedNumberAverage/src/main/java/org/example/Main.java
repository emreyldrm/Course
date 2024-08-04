package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number, sum = 0;
        double count = 0;

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = inp.nextInt();


        for(int i = 1; i <= number; i++){
            if ((i % 3) == 0){
                if((i % 4) == 0){
                    sum += i;
                    count++;
                    System.out.println(i);
                }
            }
        }
        double average = sum / count;

        System.out.println("Average of numbers divided by 3 and 4 up to the numbered you entered: " + average);
    }
}