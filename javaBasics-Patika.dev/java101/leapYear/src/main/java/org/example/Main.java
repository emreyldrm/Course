package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year;
        boolean leapYear = false;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the year: ");
        year = inp.nextInt();

        leapYear = (year % 4) == 0;
        if (year % 100 == 0){
            leapYear = (year % 400) == 0;
        }

        if (leapYear){
            System.out.println(year + " is a leap year!");
        }else {
            System.out.println(year + " is not a leap year!");
        }
    }
}