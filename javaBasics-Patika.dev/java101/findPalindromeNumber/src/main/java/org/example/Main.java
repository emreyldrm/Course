package org.example;

public class Main {

    static boolean isPalindrome(int number){
        int temp = number, reverseNumber = 0;

        while (temp != 0){
            reverseNumber = (reverseNumber * 10) + (temp % 10);
            temp/=10;
        }
        return reverseNumber == number;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome(1551));
    }
}