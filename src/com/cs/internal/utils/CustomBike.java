package com.cs.internal.utils;

import com.cs.internal.factory.Bike;
import com.cs.internal.factory.BikePart;
import com.cs.internal.factory.BikeFactory;
import com.cs.internal.store.BikeStore;

import java.util.Scanner;

public class CustomBike {


    public void customBike() {
        int totalcost = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Step 1/4 choose a frame");

        BikeStore.listAllFrames();


        String selection2 = scanner.nextLine();
        int frameNumber = Integer.parseInt(selection2);
        if (frameNumber == 0) {

            BikeStore.startUpScreen();


            return;
        }

        //------------------------ FRAME
        BikePart frameToBuy = BikeStore.getFrame(frameNumber);
        if (frameToBuy == null) {
            System.out.println("No frame under this selection");
            BikeStore.startUpScreen();
            return;
        } else {
            totalcost += frameToBuy.getPrice();
        }
        //-----------------------

        System.out.println("Step 2/4 choose a Wheel");
        BikeStore.listAllWheels();
        selection2 = scanner.nextLine();
        int WheelNumber = Integer.parseInt(selection2);
        if (WheelNumber == 0) {
            BikeStore.startUpScreen();
            return;
        }
        BikePart wheelToBuy = BikeStore.getWheel(WheelNumber);
        if (wheelToBuy == null) {
            System.out.println("No Wheel under this selection");
            BikeStore.startUpScreen();
            return;
        } else {
            totalcost = totalcost + wheelToBuy.getPrice();
        }

        System.out.println("Step 3/4 choose a Bar");
        BikeStore.listAllBars();
        selection2 = scanner.nextLine();
        int BarNumber = Integer.parseInt(selection2);
        if (BarNumber == 0) {
            BikeStore.startUpScreen();
            return;
        }
        BikePart barToBuy = BikeStore.getBars(BarNumber);
        if (barToBuy == null) {
            System.out.println("No Bar under this selection");
            BikeStore.startUpScreen();
            return;
        } else {
            totalcost += barToBuy.getPrice();
        }

        System.out.println("Step 4/4 choose a Fork");
        BikeStore.listAllForks();
        selection2 = scanner.nextLine();
        int ForkNumber = Integer.parseInt(selection2);
        if (ForkNumber == 0) {
            BikeStore.startUpScreen();
            return;
        }
        BikePart forkToBuy = BikeStore.getFork(ForkNumber);
        if (forkToBuy == null) {
            System.out.println("No Fork under this selection");
            BikeStore.startUpScreen();
            return;
        } else {
            totalcost += forkToBuy.getPrice();
        }

        //all 4 parts are selected. Time to create the new bike
        Bike customBike = BikeFactory.createCustomBike(frameToBuy, wheelToBuy, barToBuy, forkToBuy);
        System.out.println("Your new bike is ready");
        System.out.println(customBike);
        System.out.println("your total cost is: " + totalcost);
        System.out.println("purchase bike by entering payment");

        String payment = scanner.nextLine();
        int i = Integer.parseInt(payment);
        //double d = Double.parseDouble(payment);

        System.out.println("purchase bike by entering payment");
        if (i == totalcost) {
            System.out.println("Thank you for your purchase!");
            System.out.println("=============================");
        } else if (i < totalcost) {
            int dif = totalcost - i;
            System.out.println("Payment was not succesfull");
            System.out.println("you need to pay another " + dif + "dollars more in order to get the bike");
            System.out.println("===================================");
            System.out.println("Enter the rest of your payment");
            System.out.println("====================================");
            String restpayment = scanner.nextLine();
            int r = Integer.parseInt(restpayment);
            if (i == r) {
                System.out.println("thank you for your purchase");
            } else {
                System.out.println("payment unsuccesfull");
            }

        }
    }
}
