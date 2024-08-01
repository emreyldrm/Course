package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int math, physics, turkish, chemistry, music;

        Scanner input = new Scanner(System.in);

        System.out.print("Math Grade: ");
        math = input.nextInt();
        System.out.print("Physics Grade: ");
        physics = input.nextInt();
        System.out.print("Turkish Grade: ");
        turkish = input.nextInt();
        System.out.print("Chemistry Grade: ");
        chemistry = input.nextInt();
        System.out.print("Music Grade: ");
        music = input.nextInt();

        double lecture = 5.0;
        double lessons = math + physics + turkish + chemistry + music;
        //only used if else
        if (math<0 || math>100){
            lecture--;
            lessons-=math;
        }if (physics<0 || physics>100){
            lecture--;
            lessons-=physics;
        }if (turkish<0 || turkish>100){
            lecture--;
            lessons-=turkish;
        }if (chemistry<0 || chemistry>100){
            lecture--;
            lessons-=chemistry;
        }if (music<0 || music>100){
            lecture--;
            lessons-=music;
        }

        double average = lessons / lecture;

        if (average >= 55){
            System.out.println("You passed the class");
        }else {
            System.out.println("You failed the class");
        }
        System.out.println("Average: " + average);

    }
}