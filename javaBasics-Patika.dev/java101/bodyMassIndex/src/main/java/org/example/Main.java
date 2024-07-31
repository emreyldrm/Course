package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double height, weight, bmi;

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the your height(meter): ");
        height = inp.nextDouble();
        System.out.print("Enter the your weight: ");
        weight = inp.nextDouble();

        bmi = weight / (height * height);

        System.out.println("Your bmi is: " + bmi);


    }
}