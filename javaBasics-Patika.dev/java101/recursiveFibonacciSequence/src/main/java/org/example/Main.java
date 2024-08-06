package org.example;

public class Main {

    static int fibo(int number){
        if (number == 1)
            return 0;
        if (number == 2)
            return 1;
 //0 1 1 2 3 5 8 13 21

        return fibo(number - 1) + fibo(number - 2); //6 : 3 + 2  = 5
    }

    public static void main(String[] args) {

        System.out.println(fibo(47));
    }
}