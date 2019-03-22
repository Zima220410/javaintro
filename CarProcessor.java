package com.hillel.javaintro.lessons._8;

public class CarProcessor {
    private Car[] arrayCar;

    CarProcessor(Car[] arrayCar){
        this.arrayCar = arrayCar;
    }

    CarProcessor(){

    }

    public void findCarsByMark(Car[] cars, String mark) {
        System.out.println("-Марка - " + mark);
        for (Car car : cars) {
            if (car.mark.equals(mark)) {
                printCar(car);
            }
        }
    }

    public void findCarsByMark(String mark){
        if(this.arrayCar != null){
            findCarsByMark(this.arrayCar, mark);
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

    public void findCarsByModelMoreYears(String model, int years){
        if (this.arrayCar != null){
            findCarsByModelMoreYears(this.arrayCar, model, years);
        }
    }

    public void findCarsByProdYearAndPrice(Car[] cars, int prodYear, int price) {
        System.out.println("-Авто заданного года с ценой больше - " + prodYear + " " + price);
        for (Car car : cars) {
            if (car.prodYear == prodYear && car.price > price) {
                printCar(car);
            }
        }
    }

    public void findCarsByProdYearAndPrice(int prodYear, int price){
        if(this.arrayCar != null){
            findCarsByProdYearAndPrice(this.arrayCar, prodYear, price);
        }
    }

    public void printCar(Car car) {
        System.out.println("Id Авто - " + car.id + ", Марка - " + car.mark + ", Модель - " + car.model + ", Год выпуска - " + car.prodYear +
                ", Цвет - " + car.collor + ", Цена - " + car.price + ", Номер - " + car.number);
    }
}
