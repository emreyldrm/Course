package org.example;

import java.util.Arrays;

public class Main {

    public static boolean isFind(int[] list, int value){
        if (value == 0){
            return false;
        }
        for (int number: list){
            if(value == number){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] numbers = {3,4,2,0,11,11,20,3,4,7,0,5,4,0,20,6};
        int[] tempNumbers = new int[numbers.length];
        int startIndex = 0;
        int zeroCount = 0;
        //When we create a tempArray of the length Array, Array's default value is 0,
        //but we lose 0, if our Array has already repeats 0.
        //so we find out in advance how many 0s our array contains.
        for (int i : numbers){
            if (i == 0){
                zeroCount++;
            }
        }
        //Do not process if there is no 0 in the array! Otherwise, do it!
        if (zeroCount > 0){
            zeroCount -= 1;
        }

        int count = 0;
        for (int i = 0; i < numbers.length ; i++) {
            for (int j = 0; j < numbers.length ; j++) {
                if (i != j && numbers[i] == numbers[j]){
                    if (!isFind(tempNumbers,numbers[i])){
                       tempNumbers[startIndex++] = numbers[i];
                        count++;
                    }
                    break;
                }
            }
        }

        //print tempArray
        System.out.println(Arrays.toString(tempNumbers));

        //create a new array containing all repeating numbers(including 0)
        int[] finalNumbers = Arrays.copyOf(tempNumbers,(count-zeroCount));
        System.out.println(Arrays.toString(finalNumbers));

        System.out.print("Repeating even numbers:");
        for (int i: finalNumbers){
            if (i % 2 == 0){
                System.out.print(" " + i);
            }
        }


    }
}