package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int number, digitCount = 0, digitSum = 0, digit, total = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        number = input.nextInt();

        int tempNumber = number;

        //find digit count
        while (tempNumber != 0){
            digitSum += tempNumber % 10; //extra
            tempNumber /= 10;
            digitCount++;
        }

        tempNumber = number;
        //find armstrong number
        while (tempNumber != 0){
            digit = tempNumber % 10;
            int tempPow = 1;
            for (int i = 1; i <= digitCount; i++){
                tempPow *= digit;
            }
            total += tempPow;
            tempNumber /= 10;
        }

        if (total == number){
            System.out.println(number + " is a armstrong number");
        }else{
            System.out.println(number + " is not a armstrong number");
        }
        System.out.println("You entered a " + digitCount + "-digit number");
        System.out.println("Sum of all digits: " + digitSum);







    }
}