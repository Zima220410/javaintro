package com.hillel.javaintro.lessons._10;

class Bus extends Taxis {
    private int seats;

    public Bus(int price, int fuelConsuption, int maxSpeed, int seats) {
        super(price, fuelConsuption, maxSpeed);
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Bus{" + "seats=" + seats + ", price = " + getPrice() + ", max Speed = " + getMaxSpeed() + '}';
    }
}