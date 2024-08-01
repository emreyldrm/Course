package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int month, day;
        String horoscope = "";
        boolean isError = false;


        Scanner inp = new Scanner(System.in);

        System.out.print("Enter your birth month: ");
        month = inp.nextInt();
        System.out.print("Enter your birth day: ");
        day = inp.nextInt();

        if (month == 1){
            if (day >= 1 && day <= 21){
                horoscope = "Capricorn";
            } else if (day > 21 && day <= 31) {
                horoscope = "Aquarius";
            }else {
                isError = true;
            }
        }else if (month == 2){
            if (day >= 1 && day <= 19){
                horoscope = "Aquarius";
            } else if (day > 19 && day <= 28) {
                horoscope = "Pisces";
            }else {
                isError = true;
            }
        }else if (month == 3){
            if (day >= 1 && day <= 20){
                horoscope = "Pisces";
            } else if (day > 20 && day <= 31) {
                horoscope = "Aries";
            }else {
                isError = true;
            }
        }else if (month == 4){
            if (day >= 1 && day <= 20){
                horoscope = "Aries";
            } else if (day > 20 && day <= 30) {
                horoscope = "Taurus";
            }else {
                isError = true;
            }
        }else if (month == 5){
            if (day >= 1 && day <= 21){
                horoscope = "Taurus";
            } else if (day > 21 && day <= 31) {
                horoscope = "Gemini";
            }else {
                isError = true;
            }
        }else if (month == 6){
            if (day >= 1 && day <= 22){
                horoscope = "Gemini";
            } else if (day > 22 && day <= 30) {
                horoscope = "Cancer";
            }else {
                isError = true;
            }
        }else if (month == 7){
            if (day >= 1 && day <= 22){
                horoscope = "Cancer";
            } else if (day > 22 && day <= 31) {
                horoscope = "Leo";
            }else {
                isError = true;
            }
        }else if (month == 8){
            if (day >= 1 && day <= 22){
                horoscope = "Leo";
            } else if (day > 22 && day <= 31) {
                horoscope = "Virgo";
            }else {
                isError = true;
            }
        }else if (month == 9){
            if (day >= 1 && day <= 22){
                horoscope = "Virgo";
            } else if (day > 22 && day <= 30) {
                horoscope = "Libra";
            }else {
                isError = true;
            }
        }else if (month == 10){
            if (day >= 1 && day <= 22){
                horoscope = "Libra";
            } else if (day > 22 && day <= 31) {
                horoscope = "Scorpio";
            }else {
                isError = true;
            }
        }else if (month == 11){
            if (day >= 1 && day <= 21){
                horoscope = "Scorpio";
            } else if (day > 21 && day <= 30) {
                horoscope = "Sagittarius";
            }else {
                isError = true;
            }
        }else if (month == 12){
            if (day >= 1 && day <= 21){
                horoscope = "Sagittarius";
            } else if (day > 21 && day <= 31) {
                horoscope = "Capricorn";
            }else {
                isError = true;
            }
        }else{
            isError = true;
        }

        if (isError){
            System.out.println("Wrong date!");
        }else {
            System.out.println("Your zodiac sign is: " + horoscope);
        }

    }
}