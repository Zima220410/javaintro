package com.hillel.javaintro.lessons._8;

public class Car {
    int id;
    String mark;
    String model;
    int prodYear;
    String collor;
    int price;
    int number;

    public Car(int id, String mark, String model, int prodYear, String collor, int price, int number) {
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.prodYear = prodYear;
        this.collor = collor;
        this.price = price;
        this.number = number;
    }
    public int workingYears(){
        return 2019 - prodYear;
    }
}