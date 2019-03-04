package com.hillel.javaintro.lessons._7;

public class MinMaxNum {
    public static void main(String[] args) {
        int[] num = {2, 7, 45, 12, 55,1};
        int max = num[0];
        int min = num[0];
        for (int i = 0; i != num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
            if (num[i] < min){
                min = num[i];
            }
        }
        System.out.println("Max - " + max);
        System.out.println("Min - " + min);
    }
}
