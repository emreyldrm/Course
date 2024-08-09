package org.example;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {5,13,9,23,7};

        double average = 0.0;
        double sum = 0.0;
        for (int number : numbers) {
            sum += 1.0 / number;
        }
        average = numbers.length / sum;
        System.out.println("Harmonic mean: " + average);

    }
}