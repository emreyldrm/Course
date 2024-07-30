package org.example;

import java.util.Scanner;

public class HeronFormula {
    public static void main(String[] args) {

        int a, b, c;
        double area, s;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first edge: ");
        a = input.nextInt();
        System.out.print("Enter second edge: ");
        b = input.nextInt();
        System.out.print("Enter third edge: ");
        c = input.nextInt();

        s = (a + b + c) / 2.0;

        area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
        System.out.println("Area of Triangle is: " + area);
    }
}
