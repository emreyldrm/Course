package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // C(n,r) = n! / (r! * (n-r)!)
        //Just use loops
        int n, r;
        int nFac = 1, rFac = 1, nrFac = 1;
        double total;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Total number of objects(n): ");
        n = scanner.nextInt();
        System.out.print("The number of objects to be chosen(r): ");
        r = scanner.nextInt();

        for (int i = 1; i <= n; i++){
            nFac *= i;
        }
        for (int j = 1; j <= r; j++){
            rFac *= j;
        }
        for (int k = 1; k <= n-r; k++){
            nrFac *= k;
        }

        total = (double) nFac / (rFac * nrFac);

        System.out.println("Result of your chosen combination: " + total);
        System.out.println("nfac: " + nFac);
        System.out.println("rfac: " + rFac);
        System.out.println("nrfac: " + nrFac);

    }
}