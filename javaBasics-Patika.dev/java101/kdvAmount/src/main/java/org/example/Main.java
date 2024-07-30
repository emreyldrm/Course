package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double price, kdvRate = 0.18, kdvPrice, priceIncludingKdv;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Price: ");
        price = input.nextDouble();

        if (price > 1000){
            kdvRate = 0.8;
        }
        kdvPrice = price * kdvRate;
        priceIncludingKdv = price + kdvPrice;

        System.out.println("Price excluding KDV: " +price);
        System.out.println("KDV Rate: " + kdvRate);
        System.out.println("KDV Price: " + kdvPrice);
        System.out.println("Price including KDV: " + priceIncludingKdv);
    }
}