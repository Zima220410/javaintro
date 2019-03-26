package com.hillel.javaintro.lessons._10;


import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        Taxis[] cars = {new Bus(20000, 35, 95, 40),
                new Crane(25000, 30, 70, 9000, 10),
                new DumpTruck(15000, 40, 120, 15000, 5),
                new Truck(24000, 50, 120, 20000)
        };
        TaxiPark tp = new TaxiPark(cars);

        System.out.println("Стоимость парка=" + tp.calculateCost());

        System.out.println(tp);
        tp.sortCarsByFuelConsumption();
        System.out.println("Сортировка по расходу топлива");
        System.out.println(tp);
        System.out.println(Arrays.toString(tp.findCarsBySpeedRange(100)));
        System.out.println(tp.findCarsBySpeedRange(100));
    }
}
