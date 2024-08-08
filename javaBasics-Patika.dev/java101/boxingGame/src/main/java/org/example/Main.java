package org.example;

public class Main {
    public static void main(String[] args) {
        
        Fighter f1 = new Fighter("John",20,100,89,35);
        Fighter f2 = new Fighter("Mike",16,78,84,55);

        Ring ring = new Ring(f1,f2,80,89);
        ring.run();
    }
}