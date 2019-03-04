package com.hillel.javaintro.lessons._7;

public class Mas {
    public static void main(String[] args) {
        int[][] aaa = {{7, 3}, {4, 2}, {8, 4}};
        int[][] bbb = {{2, 7, 4}, {8, 1, 2}};
        int a = aaa.length;
        int b = bbb[0].length;
        int c = bbb.length;
        int[][] sss = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                for (int k = 0; k < c; k++) {
                    sss[i][j] = aaa[i][k] * bbb[k][j];
                }
            }
        }
        for (int i = 0; i < sss.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < sss[0].length; j++) {
                System.out.print(sss[i][j] + " ");
            }
        }
    }
}
