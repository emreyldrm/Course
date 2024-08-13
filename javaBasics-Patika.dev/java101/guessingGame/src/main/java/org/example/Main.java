package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100);
        int life = 5;
        System.out.println(number);
        boolean isWin = false;
        int[] guessNumbers = new int[5];
        boolean isWrong = false;
        while(life > 0){

            System.out.print("Guess Number: ");
            int guess = inp.nextInt();
            guessNumbers[5-life] = guess;
            if (guess < 0 || guess > 99){
                System.out.println("You entered a incorrect number!");
                if (isWrong){
                    life--;
                    System.out.println("You have " + life + " lives left !");
                }
                while(!isWrong){
                    System.out.println("Next time you enter an incorrect number your lives will be reduced!");
                    isWrong = true;
                }

                continue;
            }


            if (guess == number){
                System.out.println("Congratulations! You Win!");
                isWin = true;
                break;
            }else{
                System.out.println("Your guess is wrong !");
                if (guess < number){
                    System.out.println("The secret number is greater than " + guess);
                }else{
                    System.out.println("The secret number is less than " + guess);
                }
                life--;
                System.out.println("You have " + life + " lives left !");
            }

        }

        if (!isWin){
            System.out.println("You lost! The secret number is: " + number);
        }
        System.out.println("Your guesses: " + Arrays.toString(guessNumbers));




    }
}