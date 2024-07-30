package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b;
        double c;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first edge: ");
        a = input.nextInt();
        System.out.print("Enter second edge: ");
        b = input.nextInt();

        c = Math.sqrt((a*a) + (b*b));

        System.out.println("Hypotenuse is: " + c);
    }
}