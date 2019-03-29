package com.cs.internal.factory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BikeFactory {
    private static int bikeNumber = 0;
    private static int partNumber = 0;

    //bike list
    private static List<Bike> allBikes = new ArrayList<>();
    //[e1->e2->e3->,e4] Bike b = allBikes.get(e2), Bike c = e2.getNext();
    //frame list
    private static List<BikePart> allFrames = new ArrayList<>();//[e1,e2,e3,e4] e2.getNext(); -> error!
    //....
    private static List<BikePart> allWheels = new ArrayList<>();
    private static List<BikePart> allBars = new ArrayList<>();
    private static List<BikePart> allForks = new ArrayList<>();
    private static List<BikePart> allParts = new ArrayList();

    //Bike toBuy = getBike(bikeNumber);
    //private static List<BikePart> allPartPrices = new ArrayList();
    //recursion, sort by price, linked list, search by brand, file op.
    //for i=0 to i = allBikes.getSize() = 10
    //[p3,p2,p4,p1] -> [p1,p2,p3,p4]
    //add[p3]
    //p2.price > p3.price => p3.next = p2
    //

    public static void createBikes(String fileName) {
        //read data from file and create parts. TODO
        //loop over file lines and create BikeParts.
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                String[] properties = sCurrentLine.split("=")[1].split(",");
                BikePart frame = new BikePart(
                        ++partNumber,
                        properties[0],
                        properties[1],
                        Integer.parseInt(properties[2]),
                        properties[3],
                        Integer.parseInt(properties[4]),
                        properties[5]);
                allFrames.add(frame);

                sCurrentLine = br.readLine();
                properties = sCurrentLine.split("=")[1].split(",");
                BikePart wheels = new BikePart(
                        ++partNumber,
                        properties[0],
                        properties[1],
                        Integer.parseInt(properties[2]),
                        properties[3],
                        Integer.parseInt(properties[4]),
                        properties[5]);
                allWheels.add(wheels);

                sCurrentLine = br.readLine();
                properties = sCurrentLine.split("=")[1].split(",");
                BikePart bar = new BikePart(
                        ++partNumber,
                        properties[0],
                        properties[1],
                        Integer.parseInt(properties[2]),
                        properties[3],
                        Integer.parseInt(properties[4]),
                        properties[5]);
                allBars.add(bar);

                sCurrentLine = br.readLine();
                properties = sCurrentLine.split("=")[1].split(",");
                BikePart fork = new BikePart(
                        ++partNumber,
                        properties[0],
                        properties[1],
                        Integer.parseInt(properties[2]),
                        properties[3],
                        Integer.parseInt(properties[4]),
                        properties[5]);
                allForks.add(fork);

                Bike b = new Bike(++bikeNumber, frame, wheels, bar, fork);
                allBikes.add(b);
            }
            allParts.addAll(allFrames);
            allParts.addAll(allWheels);
            allParts.addAll(allForks);
            allParts.addAll(allBars);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void createBikes() {
        BikePart frame1 = new BikePart(++partNumber, "colony", "Frame", 300, "black", 2016, "20");
        allFrames.add(frame1);
        BikePart wheels1 = new BikePart(++partNumber, "Merritt", "Wheels", 465, "black", 2015, "Medium");
        allWheels.add(wheels1);
        BikePart bar1 = new BikePart(++partNumber, "BSD", "Bar", 50, "black", 2015, "9.2");
        allBars.add(bar1);
        BikePart fork1 = new BikePart(++partNumber, "Cult", "Fork", 170, "black", 2015, "25");
        allForks.add(fork1);
        BikePart frame2 = new BikePart(++partNumber, "Cult", "Frame", 300, "black", 2016, "20");
        allFrames.add(frame2);
        BikePart wheels2 = new BikePart(++partNumber, "Cult", "Wheels", 395, "black", 2015, "Medium");
        allWheels.add(wheels2);
        BikePart bar2 = new BikePart(++partNumber, "Merritt", "Bar", 45, "black", 2015, "9.2");
        allBars.add(bar2);
        BikePart fork2 = new BikePart(++partNumber, "colony", "Fork", 145, "black", 2015, "25");
        allForks.add(fork2);
        BikePart frame3 = new BikePart(++partNumber, "Cult", "Frame", 380, "black", 2016, "20");
        allFrames.add(frame3);
        BikePart wheels3 = new BikePart(++partNumber, "colony", "Wheels", 510, "black", 2015, "Medium");
        allWheels.add(wheels3);
        BikePart bar3 = new BikePart(++partNumber, "BSD", "Bar", 39, "black", 2015, "9.2");
        allBars.add(bar3);
        BikePart fork3 = new BikePart(++partNumber, "Merritt", "Fork", 170, "black", 2015, "25");
        allForks.add(fork3);
        BikePart frame4 = new BikePart(++partNumber, "colony", "Frame", 312, "black", 2016, "20");
        allFrames.add(frame4);
        BikePart wheels4 = new BikePart(++partNumber, "Merritt", "Wheels", 420, "black", 2015, "Medium");
        allWheels.add(wheels4);
        BikePart bar4 = new BikePart(++partNumber, "BSD", "Bar", 65, "black", 2015, "9.2");
        allBars.add(bar4);
        BikePart fork4 = new BikePart(++partNumber, "Cult", "Fork", 183, "black", 2015, "25");
        allForks.add(fork4);

        Bike b1 = new Bike(++bikeNumber, frame1, wheels1, bar1, fork1);
        allBikes.add(b1);

        Bike b2 = new Bike(++bikeNumber, frame2, wheels2, bar2, fork2);
        allBikes.add(b2);

        Bike b3 = new Bike(++bikeNumber, frame3, wheels3, bar3, fork3);
        allBikes.add(b3);

        Bike b4 = new Bike(++bikeNumber, frame4, wheels4, bar4, fork4);
        allBikes.add(b4);

        Bike b5 = new Bike(++bikeNumber, frame4, wheels2, bar4, fork1);
        allBikes.add(b5);

        allParts.addAll(allFrames);
        allParts.addAll(allWheels);
        allParts.addAll(allForks);
        allParts.addAll(allBars);

    }

    public static Bike createCustomBike(BikePart frame, BikePart wheels, BikePart bar, BikePart fork) {
        Bike customBike = new Bike(++bikeNumber, frame, wheels, bar, fork);
        allBikes.add(customBike);
        return customBike;

    }

    //return allBikes
    public static List<Bike> getAllBikes() {
        return allBikes;
    }

    //return allFrames
    public static List<BikePart> getAllFrames() {
        return allFrames;
    }

    public int getFrameNumber() {
        return partNumber;
    }

    public static List<BikePart> getAllForks() {
        return allForks;
    }

    public int getForkNumber() {
        return partNumber;
    }

    public static List<BikePart> getAllWheels() {
        return allWheels;
    }

    public int getWheelsNumber() {
        return partNumber;
    }

    public static List<BikePart> getAllBars() {
        return allBars;
    }

    public int getBarsNumber() {
        return partNumber;
    }

    public static List<BikePart> getBikePartByBrand(String brand) {
        List<BikePart> partsByBrand = new ArrayList<>();
        for (BikePart bp : BikeFactory.getAllBikeParts()) {
            if (bp.getBrand().equals(brand)) {
                partsByBrand.add(bp);
            }
        }
        return partsByBrand;
    }

    public static List<BikePart> getAllBikeParts() {
        return allParts;

    }

    public static Object[] getAllBikesByPrice() {
        return bubbleSortBikesByPrice(allBikes);
    }

    //given a list of bikes, this method will return an array of sorted biked by price.
    private static Object[] bubbleSortBikesByPrice(List<Bike> bikes) {
        Object[] arrayBike = bikes.toArray();
        for (int i = 0; i < arrayBike.length - 2; i++) {
            for (int j = 0; j < arrayBike.length - 2 - i; j++) {
                //casting objects to bikes so we can get the price.
                Bike bikeJ = (Bike)arrayBike[j];
                Bike bikeJ1 = (Bike)arrayBike[j + 1];
                if (bikeJ.getPrice() < bikeJ1.getPrice()) {
                    Bike tmp = bikeJ;
                    arrayBike[j] = bikeJ1;
                    arrayBike[j + 1] = tmp;
                }
            }
        }
        return arrayBike;
    }
    //    private static Object[] bubbleSortBikePartsByYearModel(List<BikePart> bikeParts){
    //            	if(bikePArtJ.getYearModel() < bikePArtJ1.getYearModel() ){
}
