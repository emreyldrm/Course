package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] array = {{1, 2, 3}, {4, 5, 6}};

        System.out.println("Matrix: ");
        for (int[] row: array){
            for (int col: row){
                System.out.print(col + " ");
            }
            System.out.println();
        }
        System.out.println("Transpose: ");
        int[][] arrayTranspose = new int[array[0].length][array.length];

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j <array[0].length ; j++) {
                arrayTranspose[j][i] = array[i][j];
            }
        }
        for (int[] row: arrayTranspose){
            for (int col: row){
                System.out.print(col + " ");
            }
            System.out.println();
        }




    }
}