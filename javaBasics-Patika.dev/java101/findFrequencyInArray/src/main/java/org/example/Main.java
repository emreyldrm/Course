package org.example;

import java.util.Arrays;

public class Main {

    //Check if it's in the array!
    public static boolean check(int[] array, int value){
        for(int number : array){
            if (value == number ){
                return  true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] array = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] countArray = new int[array.length];
        int[] repeatingNumbers = new int[array.length];

        //find out how many times it is repeated!
        for (int i = 0; i < array.length ; i++) {
            int count = 0;
            for (int j = 0; j < array.length ; j++) {
               if (array[i] == array[j]){
                   count++;
                   //find repeating numbers
                   if (!check(repeatingNumbers,array[i])){
                       //j is important because we need the precise index for countArray
                       repeatingNumbers[j] = array[j];
                   }

               }
            }
            countArray[i] = count;
        }

        System.out.println("Count Array(for all elements): " + Arrays.toString(countArray));
        System.out.println("Repeating Array(precise location): " + Arrays.toString(repeatingNumbers));

        //prints repeating numbers and the number of repetitions
        for(int i = 0; i < repeatingNumbers.length; i++){
            if (repeatingNumbers[i] != 0){
                System.out.println("The number " + repeatingNumbers[i] + " was repeated " + countArray[i] + " times");
            }
        }
    }
}