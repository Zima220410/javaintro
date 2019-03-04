package com.hillel.javaintro.lessons._7;

public class NumbersFibonachi {
    public static void main(String[] args) {
        int[] fib = new int[20];
        fib[0] = 1;
        fib[1] = 1;
        System.out.print(fib[0] + " " + fib[1] + " ");
        for (int i = 2; i < 20; i++) {
            fib[i] = fib[i - 2] + fib[i - 1];
            System.out.print(fib[i] + " ");
        }
    }
}
