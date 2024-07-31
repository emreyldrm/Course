package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double price, costPerKm = 2.20, startingPrice = 10, minPrice = 20, path;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the KM traveled: ");
        path = input.nextDouble();

        price = startingPrice + (path * costPerKm);
        System.out.println(price < minPrice ? "Total cost is: " + minPrice : "Total cost is: " + price);

    }
}