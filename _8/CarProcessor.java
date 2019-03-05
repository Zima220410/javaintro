package com.hillel.javaintro.lessons._8;

public class CarProcessor {
    public void findCarsByMark(Car[] cars, String mark) {
        System.out.println("-Марка - " + mark);
        for (Car car : cars) {
            if (car.mark.equals(mark)) {
                printCar(car);
            }
        }
    }

    public void findCarsByModelMoreYears(Car[] cars, String model, int workingYeats) {
        System.out.println("-Авто в эксплуатации заданной модели - " + model + " " + workingYeats);
        for (Car car : cars) {
            if (car.model.equals(model) && car.workingYears() > workingYeats) {
                printCar(car);
            }
        }
    }

    public void findCarsByProdYearAndPrice(Car[] cars, int prodYear, int price) {
        System.out.println("-Авто заданного года с ценой больше - " + prodYear + " " + price);
        for (Car car : cars){
            if (car.prodYear == prodYear && car.price > price){
                printCar(car);
            }
        }
    }
    public void printCar(Car car){
        System.out.println("Id Авто - " + car.id + ", Марка - " + car.mark + ", Модель - " + car.model + ", Год выпуска - " + car.prodYear +
                ", Цвет - " + car.collor + ", Цена - " + car.price + ", Номер - " + car.number);
    }
}
