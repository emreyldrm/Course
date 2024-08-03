package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int distance, age, travelType;
        double pricePerDistance = 0.10, discount;
        boolean isError = false;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the distance: ");
        distance = inp.nextInt();
        System.out.print("Enter your age: ");
        age = inp.nextInt();
        System.out.print("Enter your travel type (1 => one way, 2 => round trip): ");
        travelType = inp.nextInt();

        double totalPrice = distance * pricePerDistance;

        if (distance < 0 || age < 0 || !(travelType == 1 || travelType == 2)){
            System.out.println("You have entered incorrect data!");
            isError = true;
        }
        if (age < 12){
            discount = totalPrice * 0.5;
            totalPrice -= discount;
        } else if (age < 24){
            discount = totalPrice * 0.1;
            totalPrice -= discount;
        } else if (age >65) {
            discount = totalPrice * 0.3;
            totalPrice -= discount;
        }

        if (travelType == 2){
            discount = totalPrice * 0.2;
            totalPrice -= discount;
            totalPrice *= 2;
        }
        if (!isError){
            System.out.println("Total price is: " + totalPrice);
        }


    }
}