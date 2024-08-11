package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size ; i++) {
            System.out.print("Enter " + (i+1) + ". number: ");
            array[i] = input.nextInt();
        }
        Arrays.sort(array);
        System.out.print("Sorted Array: ");
        for(int i : array){ //or we can use Arrays.toString();
            System.out.print(i + " ");
        }
    }
}