package com.hillel.javaintro.lessons._10;

import java.util.Arrays;

public class TaxiPark {
    private Taxis[] cars;

    public TaxiPark(Taxis[] cars) {
        this.cars = cars;
    }

    public int calculateCost() {
        int cost = 0;
        for (Taxis car : cars) {
            cost += car.getPrice();
        }
        return cost;
    }

    public void sortCarsByFuelConsumption() {
        for (int i = 0; i < cars.length; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[j].getFuelConsuption() < cars[i].getFuelConsuption()) {
                    Taxis temp = cars[j];
                    cars[j] = cars[i];
                    cars[i] = temp;
                }
            }
        }
    }

    public Taxis[] findCarsBySpeedRange(int maxSpeed) {
        Taxis[] res = {};
        for (Taxis car : getCars()) {
            if (car.getMaxSpeed() <= maxSpeed) {
                res = extendCarsArrayByNewCar(car, res);
            }
        }
        return res;
    }

    private Taxis[] extendCarsArrayByNewCar(Taxis carToAdd, Taxis[] cars) {
        if (cars.length == 0) {
            return new Taxis[]{carToAdd};
        } else {
            Taxis[] newCarsArr = new Taxis[cars.length + 1];
            for (int i = 0; i < cars.length; i++){
                newCarsArr[i] = cars[i];
            }
            newCarsArr[cars.length] = carToAdd;
            return newCarsArr;
        }
    }

    public Taxis[] getCars() {
        return cars;
    }

    public void setCars(Taxis[] cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        String result = "";

        for (Taxis car : cars) {
            result += (car.toString() + "\n");
        }
        return result;
    }
}