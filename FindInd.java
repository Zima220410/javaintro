package com.hillel.javaintro.lessons._5;

import java.util.Arrays;

public class FindInd {
    // Задание 1
    // Найти индекс элемента, значение которого равно 15.

    public static void main(String[] args) {
        int[] myArray = new int[]{2, 5, 10, 12, 20, 25};
        findArray(myArray);

    }
//    public static double findArray(int[] arr){
//        int n = 15;
//        for (int i =0;i<arr.length; i++){
//            if (arr[i] == n)
//                System.out.println("Индекс этемента  - " + i + " Значение " + arr[i]);
//        }
//        return n;
//    }

    // Задание 2
    // То же самое, но чтобы 15 не было в массиве, т е пройтись по всем элементам,
    // ничего не найти и вывести в консоль, что ничего не нашли. Сделать с помощью for & while.

//    public static double findArray(int[] arr) {
//        int n = 15;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == n) {
//                System.out.println("Индекс этемента  - " + i + " Значение " + arr[i]);
//                return n;
//            }
//        }
//        System.out.println("Элемента со значением " + n + " не найдено");
//        return n;
//    }


    // Задание 3
    // Пройтись по массиву и напечатать каждый 2й элемент в консоль.

//    public static double findArray(int[] arr) {
//        int n = 15;
//        for (int i = 0; i < arr.length; i++) {
//            if ((i%2) != 0) {
//                System.out.println("Индекс этемента  - " + i + " Значение " + arr[i]);
//            }
//        }
//        return n;
//    }


    // Задание 4
    // Найти максимальный элемент в массиве.

//    public static double findArray(int[] arr) {
//        int max = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max=arr[i];
//            }
//        }
//        System.out.println("Максимальное значение  - " + max);
//        return max;
//    }

    // Задание 5
    // Вывести все элементы на консоль по порядку в формате [1,2,3,4,5]

//    public static double findArray(int[] arr) {
//        System.out.print("[ "+arr[0]);
//        int t = 0;
//        for (int i = 1; i < arr.length; i++) {
//            System.out.print(", " + arr[i]);
//            if (i == arr.length-1){
//                System.out.println(" ]");
//            }
//        }
//        return t;
//    }

    // Задание 6
    // Вывести все элементы на консоль в формате [1,2,3,4,5] в обратном порядке.

    public static double findArray(int[] arr) {
        int t = arr.length;
        System.out.print("[ ");
        for (int i = 1; i < arr.length; i++) {
            int y = t - i;
            System.out.print(arr[y] + ", ");
            if (i == arr.length - 1) {
                System.out.println(arr[y - 1] + " ]");
            }
        }
        return t;
    }
}
