package com.cs.internal.factory;

public class Bike {

    //TODO: F, make these final => shows that they will never change after creation
    private final int bikeNumber;
    private BikePart frame;
    private BikePart wheels;
    private BikePart bar;
    private BikePart fork;

    private int price;

    public Bike(int bikeNumber, BikePart frame, BikePart wheels, BikePart bar, BikePart fork) {
        this.bikeNumber = bikeNumber;
        this.frame = frame;
        this.wheels = wheels;
        this.bar = bar;
        this.fork = fork;
        this.price = frame.getPrice() + wheels.getPrice() + bar.getPrice() + fork.getPrice();
    }

    public int getBikeNumber() {
        return bikeNumber;
    }

    public BikePart getFrame() {
        return frame;
    }

    public BikePart getWheels() {
        return wheels;
    }

    public BikePart getBar() {
        return bar;
    }

    public BikePart getFork() {
        return fork;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "bikeNumber=" + bikeNumber +
                "\n frame=" + frame +
                "\n wheels=" + wheels +
                "\n bar=" + bar +
                "\n fork=" + fork +
                "\n price=" + price +
                '}';
    }



}
