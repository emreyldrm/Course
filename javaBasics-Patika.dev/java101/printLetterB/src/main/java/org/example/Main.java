package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[][] letter = new String[13][4];

        //initialize 2D array
        for (int i = 0; i < letter.length ; i++) {
            Arrays.fill(letter[i], " ");
        }
        String star = "*";
        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length ; j++) {
                if (j == 0){
                    letter[i][j] = star;
                }
                if (i == 1 || i == 11){
                    letter[i][j] = star;
                }
                if (j == 1){
                    if (i == 0 || i == 1 || i == 6 || i == 11 || i == 12){
                        letter[i][j] = star;
                    }
                }
                if (j == 2){
                    if (i == 0 || i == 1 || i == 2 || i == 5 || i == 6 || i == 7 || i == 10 || i == 11 || i == 12){
                        letter[i][j] = star;
                    }
                }
                if (j == 3){
                    if (i != 0 && i != 6 && i != 12){
                        letter[i][j] = star;
                    }
                }
            }
        }

        for (String[] row: letter){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }

    }
}