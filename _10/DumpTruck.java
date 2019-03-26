package com.hillel.javaintro.lessons._10;

class DumpTruck extends Truck{
    private int liftHeight;

    public DumpTruck(int price, int fuelConsuption, int maxSpeed, int cargo, int liftHeight) {
        super(price, fuelConsuption, maxSpeed, cargo);
        this.liftHeight = liftHeight;
    }

    public int getLiftHeight() {
        return liftHeight;
    }

    public void setLiftHeight(int liftHeight) {
        this.liftHeight = liftHeight;
    }

    @Override
    public String toString() {
        return "DumpTruck{" + "liftHeight=" + liftHeight + ", price=" + getPrice() + ", max speed=" + getMaxSpeed() + '}';
    }
}
