package org.example;

public class Main {
    public static void main(String[] args) {
        char harf = 'u';
        char harfDuzeltme = Character.toUpperCase(harf);

        switch (harfDuzeltme){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın sesli harf");
                break;
            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
                System.out.println("İnce sesli harf");
                break;
            default:
                System.out.println("Hatalı harf");
        }
    }
}