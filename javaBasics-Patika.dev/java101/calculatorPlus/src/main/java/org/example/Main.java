package org.example;

import java.util.Scanner;

public class Main {

    static void add(int a, int b){
        System.out.println("Addition = " + a + " + " + b + " = " + (a+b));
    }
    static void subtract(int a, int b){
        System.out.println("Subtraction: " + a + " - " + b + " = " + (a - b));
    }
    static void multiply(int a, int b){
        System.out.println("Multiplication: " + a + " x " + b + " = " + (a * b));
    }
    static void division(int a, int b){
        if (b == 0){
            System.out.println("A number cannot be divided by 0.");
            return;
        }
        System.out.println("Division: " + a + " / " + b + " = " + (a / b));
    }
    static void pow(int a, int b){
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println("Exponent: " + a + " to the power of " + b + " = " + result);
    }
    static void factorial(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = scanner.nextInt();
        int result = 1;
        for (int i = 1; i <= a ; i++) {
            result *= i;
        }
        System.out.println("Factorial: " + a + "! = " + result);
    }
    static void modulo(int a, int b){
        System.out.println("Modulo: " + a + " % " + b + " = " + (a % b));
    }
    static void rectangle(int a, int b){

        int perimeter = 2 * (a+b);
        int area = a * b;
        System.out.println("Area of rectangle: " + area);

        System.out.println("Perimeter of rectangle: " + perimeter);
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int select;

        String menu = "1 - Addition\n" +
                "2 - Subtraction\n" +
                "3 - Multiplication\n" +
                "4 - Division\n" +
                "5 - Exponent Calculation\n" +
                "6 - Factorial Calculation\n" +
                "7 - Modulo Calculation\n" +
                "8 - Rectangular Area and Perimeter Calculation\n" +
                "0 - Exit";
            System.out.println(menu);

        do {
            System.out.print("Select an action: ");
            select = scanner.nextInt();
            int a = 0,b = 0;
            if (select != 0 && select != 6){
                System.out.print("Enter first number: ");
                a = scanner.nextInt();
                System.out.print("Enter second number: ");
                b = scanner.nextInt();
            }

            switch (select){
                case 1:
                    add(a,b);
                    break;
                case 2:
                    subtract(a,b);
                    break;
                case 3:
                    multiply(a,b);
                    break;
                case 4:
                    division(a,b);
                    break;
                case 5:
                    pow(a,b);
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    modulo(a,b);
                    break;
                case 8:
                    rectangle(a,b);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid action! Try again.");
            }

        }while (select != 0);

    }
}