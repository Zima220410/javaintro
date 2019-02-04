package com.hillel.javaintro.lessons;

public class DoWhile {
    public static void main(String[] args){
        int count = 1;
        do {
            System.out.println("Номер числа:" + count + ", число " + count*7);
        } while (count++ < 15);
    }
}
