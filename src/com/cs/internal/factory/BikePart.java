package com.cs.internal.factory;

public class BikePart {

    //variables
    //TODO: F, make these final => shows that they will never change after creation
    private final int partNumber;
    private String brand;
    private String part;
    private int price;
    private String colour;
    private int yearModel;
    private String size;

    //BikePart(1,"colony", "Frame", 300, "black", 2016, "20");
    public BikePart(int partNumber,String brand, String part, int price, String colour, int yearmodel, String size) {
        this.brand = brand;
        this.partNumber = partNumber;
        this.part = part;
        this.price = price;
        this.colour = colour;
        this.yearModel = yearmodel;
        this.size = size;
    }


    public String getBrand() {
        return brand;
    }


    public int getPartNumber() {
        return partNumber;
    }

    public String getPart() {
        return part;
    }

    public String getColour() {
        return colour;
    }

    public int getYearModel() {
        return yearModel;
    }

    public String getSize() {
        return size;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "{partNumber='" + partNumber +'\'' +
                ", brand='" + brand +  '\'' +
                ", part='" + part + '\'' +
                ", price=" + price +
                ", colour='" + colour + '\'' +
                ", yearModel=" + yearModel +
                ", size='" + size + '\'' +
                '}';
    }



}
