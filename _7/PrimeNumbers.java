package com.hillel.javaintro.lessons._7;

public class PrimeNumbers {
    public static void main(String[] args) {
        int[] num = {5, 7, 12, 6, 8, 22};
        for (int i = 0; i < num.length; i++) {
            boolean b = true;
            for (int j = 2; j < num[i]; j++) {
                if (num[i] % j == 0) {
                    b = false;
                    break;
                }
            }
            if (b == true) {
                System.out.println("Число " + num[i] + " простое число");
            }
        }
    }
}
