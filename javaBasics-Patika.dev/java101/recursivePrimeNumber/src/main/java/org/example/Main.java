package org.example;

import java.util.Scanner;

public class Main {

    static boolean isPrime(int num, int i){

        if (i == num){
            return true;
        }
        if (num < i){
            return false;
        }
        if (num % i == 0){
            return false;
        }

        return isPrime(num, ++i);

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isPrime(number, 2)){
            System.out.println(number + " is a prime number.");
        }else{
            System.out.println(number + " is not a prime number.");
        }

    }
}