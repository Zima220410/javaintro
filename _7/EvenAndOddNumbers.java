package com.hillel.javaintro.lessons._7;

public class EvenAndOddNumbers {
    public static void main(String[] args) {
        int num[] = {2, 7, 12, 74, 25, 22, 10};
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                System.out.println(num[i] + " Четное число");
            }
            else {
                System.out.println(num[i] + " Нечетное число");
            }
        }
    }
}
