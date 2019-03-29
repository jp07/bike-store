package com.cs.internal.store;

import com.cs.internal.factory.BikeFactory;
import com.cs.internal.factory.BikePart;
import com.cs.internal.utils.BuyBike;
import com.cs.internal.utils.BuyPart;
import com.cs.internal.utils.CustomBike;
import com.cs.internal.utils.SearchByBrand;

import java.util.Scanner;

public class BikeStore {

    private static String bmxStoreName = "Soms Bike Store";
    //"C:\\Users\\philip\\Documents\\Notes\\storeBikes.txt"

    public static void main(String[] args) {
        // call BikeFactory to create Bikes and BikeParts
        // if a file is given we are going to create the bikes from the file
        //else we create the build-in bikes
        if (args.length > 0) {
            BikeFactory.createBikes(args[0]);
        } else {
            BikeFactory.createBikes();
        }

        new BikeStore();
    }

    public BikeStore() {
        startUpScreen();
    }

    public static void startUpScreen() {
        showMenu();
        Scanner scanner = new Scanner(System.in);
        //replace while loop with recursion
        //    	while (true) {
        String selection = scanner.nextLine();
        switch (selection) {
            case "a":
                buyBike();
                break;
            case "b":
                buyPart();
                break;
            case "c":
                customBike();
                break;
            case "d":
                searchByBrand();
                break;
            case "e":
                //exitStore();
                System.exit(0);
                break;
            case "f":
                //CreateAcount();
                break;
            // sort by price
            // search brand getBikePartByBrand(String brand)
            //      	}
        }
        //startUpScreen();
    }

    public static void showMenu() {
        System.out.println("==========================");
        System.out.println("Welcome to " + bmxStoreName);
        System.out.println("==========================");
        System.out.println("");
        System.out.println("select one of the following actions:");
        System.out.println(" a) Buy Bike");
        System.out.println(" b) Buy Parts");
        System.out.println(" c) Customize Bike");
        System.out.println(" d) search by brand");
        System.out.println(" e) Exit");

        // sort by price , choose by brannd
        System.out.println("");
        System.out.println("");
    }

    //========================================a) buy bikes=================================================//\

    public static void buyBike() {
        BuyBike a = new BuyBike();
        a.buyBike();

        // BuyBike.buyBike();

    }

    //========================================buy bikes=================================================//

    //========================================b) buy parts=================================================//
    public static void buyPart() {
        BuyPart a = new BuyPart();
        a.buyPart();


    }


    //========================================c) custom bikes=================================================//

    public static void customBike() {
        CustomBike a = new CustomBike();
        a.customBike();

    }

    // list all wheels


    public static void listAllWheels() {
        System.out.println("==========================");
        System.out.println("Our Wheels:");
        System.out.println("===========================");
        System.out.println("");
        for (BikePart W : BikeFactory.getAllWheels()) {
            System.out.println(W.toString());
        }
        System.out.println("==========================");
        System.out.println(
                "Type in the Frame number to buy a Wheel or 0 to cancel the bikebuild and return to main menu.");
        System.out.println("==========================");
    }

    public static BikePart getWheel(int number) {
        for (BikePart W : BikeFactory.getAllWheels()) {
            if (W.getPartNumber() == number) {
                return W;
            }
        }
        return null;
    }

    //==================================WHEELS================================
    //==================================FRAMES==================================
    public static void listAllFrames() {
        System.out.println("==========================");
        System.out.println("Our Frames:");
        System.out.println("===========================");
        System.out.println("");
        for (BikePart bp : BikeFactory.getAllFrames()) {
            System.out.println(bp.toString());
        }
        System.out.println("==========================");
        System.out.println(
                "Type in the Frame number to buy a frame or 0 to cancel the bikebuild and return to main menu.");
        System.out.println("==========================");
    }

    public static BikePart getFrame(int number) {
        for (BikePart f : BikeFactory.getAllFrames()) {
            if (f.getPartNumber() == number) {
                return f;
            }
        }
        return null;
    }

    //=============================================FRAMES==========================
    //==============================================BARS===============================
    public static void listAllBars() {
        System.out.println("==========================");
        System.out.println("Our Bars:");
        System.out.println("===========================");
        System.out.println("");
        for (BikePart B : BikeFactory.getAllBars()) {
            System.out.println(B.toString());
        }
        System.out.println("==========================");
        System.out.println("Type in the part number to buy a Bar or 0 to cancel the bikebuild and return to main menu.");
        System.out.println("==========================");
    }

    public static BikePart getBars(int number) {
        for (BikePart B : BikeFactory.getAllBars()) {
            if (B.getPartNumber() == number) {
                return B;
            }
        }
        return null;
    }

    //=====================================================BARS=========================
    //==============================================FORKS================================

    public static void listAllForks() {
        System.out.println("==========================");
        System.out.println("Our Forks:");
        System.out.println("===========================");
        System.out.println("");
        for (BikePart Q : BikeFactory.getAllForks()) {
            System.out.println(Q.toString());
        }
        System.out.println("==========================");
        System.out.println(
                "Type in the Fork number to buy a frame or 0 to cancel the bikebuild and return to main menu.");
        System.out.println("==========================");
    }

    public static BikePart getFork(int number) {
        for (BikePart Q : BikeFactory.getAllForks()) {
            if (Q.getPartNumber() == number) {
                return Q;
            }
        }
        return null;
    }


    //=============================================FORKS========================================
    //=======================================search by brand====================================
    public static void searchByBrand() {
        SearchByBrand.searchByBrand();
        return;
    }

}
