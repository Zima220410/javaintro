package com.hillel.javaintro.lessons._7;

public class DifferentNumbers {
    public static void main(String[] args) {
        int[] mas = {13556, 92284, 5627, 456654, 9879};
        int[] n = new int[10];
        int l = 0, f = 0;

        for (int i = 0; i < mas.length; i++) {
            f = mas[i];
            for (int y = 1; y < 20; y++) {
                l = f % 10;
                f = (f - l) / 10;
                n[l] += 1;
                if (f < 1) break;
                if (n[l] > 1) break;
            }
            for (int k = 0; k < 10; k++) {
                if (n[k] > 1) {
                    System.out.println(mas[i] + " имеет задвоенные цифры");
                }
                n[k] = 0;
            }
        }
    }
}

