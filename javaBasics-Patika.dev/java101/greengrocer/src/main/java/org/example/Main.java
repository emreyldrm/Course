package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double total, pearPrice=2.14, applePrice=3.67, tomatoPrice=1.11, bananaPrice=0.95, eggplantPrice=5.0;
        int pearKg, appleKg, tomatoKg, bananaKg, eggplantKg;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter pear kg: ");
        pearKg = input.nextInt();
        System.out.print("Enter apple kg: ");
        appleKg = input.nextInt();
        System.out.print("Enter tomato kg: ");
        tomatoKg = input.nextInt();
        System.out.print("Enter banana kg: ");
        bananaKg = input.nextInt();
        System.out.print("Enter eggplant kg: ");
        eggplantKg = input.nextInt();


        total = pearKg * pearPrice + applePrice * appleKg + tomatoPrice * tomatoKg + bananaPrice * bananaKg + eggplantPrice * eggplantKg;

        System.out.println("Total is: " + total);
    }
}