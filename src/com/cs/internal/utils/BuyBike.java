package com.cs.internal.utils;

import com.cs.internal.factory.Bike;
import com.cs.internal.factory.BikeFactory;
import com.cs.internal.store.BikeStore;

import java.util.Scanner;

public class BuyBike {

    public void buyBike() {
        Scanner scanner = new Scanner(System.in);
        listAllBikes();
        String selection = scanner.nextLine();
        int bikeNumber = Integer.parseInt(selection);
        if (bikeNumber == 0) {
            BikeStore a = new BikeStore();
            a.startUpScreen();
            //(BikeStore.startUpScreen());
            return;
        }
        Bike toBuy = getBike(bikeNumber);
        if (toBuy == null) {
            System.out.println("No bike under this selection");
            BikeStore a = new BikeStore();
            a.startUpScreen();
            //startUpScreen();
        } else {
            System.out.println("Please pay " + toBuy.getPrice());
        }
    }

    private void listAllBikes() {
        System.out.println("==========================");
        System.out.println("Our Bikes:");
        System.out.println("==========================");
        System.out.println();
        Object[] bikesByPrice = BikeFactory.getAllBikesByPrice();
        for (int i = 0; i < bikesByPrice.length; i++) {
            System.out.println(bikesByPrice[i]);
        }
        System.out.println("==========================");
        System.out.println("Type in the bikeNumber to buy a bike or 0 to return to main menu.");
        System.out.println("==========================");
    }

    private Bike getBike(int number) {
        for (Bike b : BikeFactory.getAllBikes()) {
            if (b.getBikeNumber() == number) {
                return b;
            }
        }
        return null;
    }

}
