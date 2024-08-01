package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String username, password, checkP="123";

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your username: ");
        username = input.nextLine();
        System.out.print("Enter your password: ");
        password = input.nextLine();

        if (username.equals("patika") && password.equals(checkP)){
            System.out.println("You are logged in");
        }else {
            System.out.println("You have logged in incorrectly");
            System.out.print("Do you want to reset password(y, n):");
            String letter = input.nextLine();

            if (letter.equals("y")){
                System.out.print("Enter new password: ");
                String newCheckP = input.nextLine();
                if (checkP.equals(newCheckP)){
                    System.out.println("Password could not be created");
                }else {
                    checkP= newCheckP;
                    System.out.println("New password created");
                }
            }else {
                System.out.println("The program is closing...");
            }
        }

    }
}