package com.hillel.javaintro.lessons._10;

class Crane extends Truck {
    private int boomLength;

    public Crane(int price, int fuelConsuption, int maxSpeed, int cargo, int boomLength) {
        super(price, fuelConsuption, maxSpeed, cargo);
        this.boomLength = boomLength;
    }

    public int getBoomLength() {
        return boomLength;
    }

    public void setBoomLength(int boomLength) {
        this.boomLength = boomLength;
    }

    @Override
    public String toString() {
        return "Crane{" + "boomLength=" + boomLength + ", price=" + getPrice() + ", max speed=" + getMaxSpeed() + '}';
    }
}
