package org.example;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {15,12,788,1,-1,-778,2,0};

        Arrays.sort(numbers);
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int value = inp.nextInt();
        int nearestMin = 0;
        int nearestMax = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] >= value){
                nearestMax = i;
                nearestMin = i-1;
                break;
            }
        }

        System.out.println("The nearest number smaller than the entered value: " + numbers[nearestMin]);
        System.out.println("The nearest number greater than the entered value: " + numbers[nearestMax]);





    }
}