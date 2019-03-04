package com.hillel.javaintro.lessons._7;

public class LongShort {
    public static void main(String[] args) {
        int[] mas = {12, 123456789, 12345, 1234567};
        int secB = mas[0];
        int secS = mas[0];
        int p, n, d = 1;
        int f = 1, g = 1, h = 1;

        for (int i = 1; i < mas.length; i++) {
            if (mas[i] > secB) {
                secB = mas[i];
            }
        }
        for (int i = 1; i < mas.length; i++) {
            if (mas[i] < secS) {
                secS = mas[i];
            }
        }
        n = secB;
        for (int m = 1; m < 20; m++) {
            if (n > 1) {
                p = n % 10;
                n -= p;
                n /= 10;
                d ++;
            }
        }
        f = secS;
        for (int m = 1; m < 15; m++) {
            if (f > 1) {
                g = f % 10;
                f -= g;
                f /= 10;
                h ++;
            }
        }
        System.out.println("Количество значений большого числа - " + d + " ,число - " + secB);
        System.out.println("Количество значений меньшего числа - " + h + " ,число - " + secS);
    }
}