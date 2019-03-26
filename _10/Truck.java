package com.hillel.javaintro.lessons._10;

class Truck extends Taxis {
    private int cargo;

    public Truck(int price, int fuelConsuption, int maxSpeed, int cargo) {
        super(price, fuelConsuption, maxSpeed);
        this.cargo = cargo;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Truck{" + "cargo=" + cargo + ", price=" + getPrice() + ", max speed=" + getMaxSpeed() + '}';
    }
}
