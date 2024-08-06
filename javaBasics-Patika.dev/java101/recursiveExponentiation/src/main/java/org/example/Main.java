package org.example;

import java.util.Scanner;

public class Main {

    static int pow(int base, int exp){
        if (exp == 0){
            return 1;
        }
        return base * pow(base, exp - 1);
    }
    // 2 3 = 8
    //p(2,3) = 2 * p(2,2) = 8
    //p(2,2) = 2 * p(2,1) = 4
    //p(2,1) = 2 * p(2,0) = 2
    //p(2,0) = 1

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int base = scanner.nextInt();
        System.out.print("Enter the exponent: ");
        int exp = scanner.nextInt();

        System.out.println("Result is: " + pow(base,exp));



    }
}