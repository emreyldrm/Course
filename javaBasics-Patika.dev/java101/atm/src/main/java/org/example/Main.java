package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String username, password;
        int right = 3, select;
        int balance = 1500;

        Scanner inp = new Scanner(System.in);

        while (right > 0){

            System.out.print("Enter your username: ");
            username = inp.nextLine();
            System.out.print("Enter your password: ");
            password = inp.nextLine();

            if (username.equals("patika") && password.equals("dev123")){
                System.out.println("You have successfully logged in.");
                do {
                    System.out.println("1 - Deposit\n" +
                            "2 - Withdrawal\n" +
                            "3 - Balance Inquiry\n" +
                            "4 - Quit");
                    System.out.print("Please select the action you wish to perform: ");
                    select = inp.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Amount of money: ");
                            int price = inp.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Amount of money: ");
                            int price2 = inp.nextInt();
                            if (price2 > balance){
                                System.out.println("Insufficient fund!");
                            }else {
                                balance -= price2;
                            }
                            break;
                        case 3:
                            System.out.println("Your balance is: " + balance);
                            break;
                        case 4:
                            System.out.println("Thank you for choosing us...");
                            break;
                        default:
                            System.out.println("Try Again");
                            break;
                    }
                }while(select != 4);
                break;
            }else {
                right--;
                System.out.println("You have logged in incorrectly!");
                System.out.println("You have " + right + " rights left.");
                if (right == 0){
                    System.out.println("Your account has been blocked.");
                }
            }
        }

    }
}