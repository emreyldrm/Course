package org.example;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int rowNumber;
    int colNumber;
    int mineNumber;
    int stage;
    String[][] board;
    String[][] game;

    public MineSweeper(){

    }

    public void run(){
        this.getRowColNumbers();
        this.calculateMineNumber();
        this.calculateStage();
        this.createBoard();
        this.play();

    }

    public void getRowColNumbers(){
        Scanner input = new Scanner(System.in);
        int col = 0, row = 0;
        do {
            System.out.print("Enter row number: ");
            row = input.nextInt();
            System.out.print("Enter col number: ");
            col = input.nextInt();
            if (row < 2 || col < 2){
                System.out.println("You entered incorrect number! (Min size 2 x 2) ");
                System.out.println("Try Again!");
            }
        }while (row < 2 || col < 2);
        this.rowNumber = row;
        this.colNumber = col;

    }

    public void calculateMineNumber(){
        this.mineNumber = (int) Math.round((this.colNumber * this.rowNumber) / 4.0);
    }
    public void calculateStage(){
        this.stage = (this.rowNumber * this.colNumber) - this.mineNumber;
    }

    public void createBoard(){

        this.createEmptyBoard();
        this.addMines();
        this.printMatrix(this.board);
        this.printMatrix(this.game);
    }
    public void addMines(){

        int count = 0;
        Random random = new Random();
        do {

            int randomCol = random.nextInt(0, this.colNumber);
            int randomRow = random.nextInt(0, this.rowNumber);

            if (this.board[randomRow][randomCol].equals("-")){
                this.board[randomRow][randomCol] = "*";
                count++;
            }

        }while (count < this.mineNumber);

    }

    public void createEmptyBoard(){

        this.board = new String[this.rowNumber][this.colNumber];
        this.game = new String[this.rowNumber][this.colNumber];

        for (int i = 0; i < this.rowNumber ; i++) {
            for (int j = 0; j < this.colNumber ; j++) {
                this.board[i][j] = "-";
                this.game[i][j] = "-";
            }
        }

    }
    public void printMatrix(String[][] matrix){
        System.out.println("================");
        for(String[] row: matrix){
            for (String col: row){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public void play(){

        boolean isWin = false;

        do{
            isWin = this.checkMine();
            this.stage--;

        }while (!isWin && this.stage > 0);

        if (this.stage == 0){
            System.out.println("You win!");
        }else {
            System.out.println("You lose!");
        }

    }
    public boolean checkMine(){

        Scanner scanner = new Scanner(System.in);
        int row;
        int col;
        boolean isError = false;
        do {
            if(isError){
                System.out.println("You entered the wrong index! Try Again!");
            }
            System.out.print("Enter row number: ");
            row = scanner.nextInt();
            System.out.print("Enter col number: ");
            col = scanner.nextInt();
            isError = true;
        }while(row < 0 || row >= this.rowNumber || col < 0 || col >= this.colNumber);


        if(!this.game[row][col].equals("-")) {
            System.out.println("You entered the same index! Try again!");
            this.stage++;
        }
        if (this.board[row][col].equals("*")){
            return true;
        } else if (this.board[row][col].equals("-")) {
            this.game[row][col] = this.findMinesAround(row,col);
        }

        this.printMatrix(this.game);

        return false;
    }


    public String findMinesAround(int row, int col) {

        int countMine = 0;
        int minRow = row - 1;
        int minCol = col - 1;
        int maxRow = row + 1;
        int maxCol = col + 1;
        if (minRow < 0){
            minRow = row;
        }
        if (minCol < 0){
            minCol = col;
        }
        if (maxRow >= this.rowNumber){
            maxRow = row;
        }
        if (maxCol >= this.colNumber){
            maxCol = col;
        }


        for (int i = minRow; i <= maxRow ; i++) {
            for (int j = minCol; j <= maxCol ; j++) {
                if (this.board[i][j].equals("*")){
                    countMine++;
                }
            }
        }
        return String.valueOf(countMine);

    }


}
