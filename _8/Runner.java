package com.hillel.javaintro.lessons._8;

public class Runner {
    public static void main(String[] args) {
        Car[] cars = {new Car(1, "BMW", "X5", 2000, "Black", 50000, 0202),
                new Car(2, "Audi", "Q7", 2015, "White", 60000, 4040),
                new Car(3, "Lexus", "RX", 2000, "Red", 40000, 9898)};

        CarProcessor processor = new CarProcessor();
        processor.findCarsByMark(cars, "Lexus");
        processor.findCarsByModelMoreYears(cars, "X5",2);
        processor.findCarsByProdYearAndPrice(cars, 2000, 10000);
    }
}
