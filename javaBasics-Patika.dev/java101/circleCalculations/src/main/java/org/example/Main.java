package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r;
        double pi = 3.14, angle;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the circle radius: ");
        r = input.nextInt();
        System.out.print("Enter the center angle: ");
        angle = input.nextDouble();;

        double circleArea = pi * r * r;
        double circumference = 2 * pi * r;
        double angleArea = (pi * r * r * angle) / 360;

        System.out.println("Area of the circle: " + circleArea);
        System.out.println("Circumference of the circle: " + circumference);
        System.out.println("Area of the circle sector: " + angleArea);

    }
}