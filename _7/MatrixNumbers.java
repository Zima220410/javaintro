package com.hillel.javaintro.lessons._7;

public class MatrixNumbers {
    public static void main(String[] args) {
        int k = 31;
        int n = 1;

        while (n * n < k) {
            n++;
        }
        int p = 0;
        for (int i = 0; i < n; i++){
            for (int y = 0; y < n; y++){
                p ++;
                if (p <= k){
                    System.out.print(" "+ p + " ");
                }
            }
            System.out.println();
        }
    }
}
