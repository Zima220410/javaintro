package com.hillel.javaintro.lessons._10;

abstract class Taxis {
    private int price;
    private int fuelConsuption; // расход топлива
    private int maxSpeed;

    public Taxis(int price, int fuelConsuption, int maxSpeed) {
        this.price = price;
        this.fuelConsuption = fuelConsuption;
        this.maxSpeed = maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getFuelConsuption() {
        return fuelConsuption;
    }

    public void setFuelConsuption(int fuelConsuption) {
        this.fuelConsuption = fuelConsuption;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Taxis{" +
                "price=" + price +
                ", fuelConsuption=" + fuelConsuption +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}

