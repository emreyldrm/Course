package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num1, num2, tempNum;
        int gcd = 1, lcm = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        num1 = scanner.nextInt();
        System.out.print("Enter number 2: ");
        num2 = scanner.nextInt();

        //find the smallest number - num1 is required to be small
        if(num1 > num2){
            tempNum = num1;
            num1 = num2;
            num2 = tempNum;
        }
        //find gcd (greatest common divisor)
        int i = num1;
        while (i != 0){
            if(num1 % i == 0 && num2 % i == 0){
                gcd = i;
                break;
            }
            i--;
        }
        System.out.println("GCD is: " + gcd);
        //find lcm (least common multiple)
        int j = 1;
        while(j <= (num1 * num2)){
            if (j % num1 == 0 && j % num2 == 0){
                lcm = j;
                break;
            }
            j++;
        }
        System.out.println("LCM is: " + lcm);

    }
}