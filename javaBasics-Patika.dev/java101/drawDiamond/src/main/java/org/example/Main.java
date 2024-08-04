package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num;

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = inp.nextInt();

        //draw a triangle
        for (int i = 1; i <= num; i++){
            for (int k = 1; k <= num - i ; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i) - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //draw a reverse triangle
        for (int i = num; i >= 1; i--){

            for (int k = (num - i); k >= 1 ; k--) {
                System.out.print(" ");

            }
            for (int j = (2*i) - 1; j >= 1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}