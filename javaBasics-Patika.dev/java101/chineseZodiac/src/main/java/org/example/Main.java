package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int birthYear;
        String chineseHoroscope = "";

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter your birth year: ");
        birthYear = inp.nextInt();

        switch (birthYear % 12){
            case 0:
                chineseHoroscope = "Monkey";
                break;
            case 1:
                chineseHoroscope = "Rooster";
                break;
            case 2:
                chineseHoroscope = "Dog";
                break;
            case 3:
                chineseHoroscope = "Pig";
                break;
            case 4:
                chineseHoroscope = "Rat";
                break;
            case 5:
                chineseHoroscope = "Ox";
                break;
            case 6:
                chineseHoroscope = "Tiger";
                break;
            case 7:
                chineseHoroscope = "Rabbit";
                break;
            case 8:
                chineseHoroscope = "Dragon";
                break;
            case 9:
                chineseHoroscope = "Snake";
                break;
            case 10:
                chineseHoroscope = "Horse";
                break;
            case 11:
                chineseHoroscope = "Sheep";
                break;
        }
        System.out.println("Your chinese zodiac sign is: " + chineseHoroscope);
    }
}