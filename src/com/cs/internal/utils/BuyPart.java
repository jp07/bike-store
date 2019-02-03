package com.cs.internal.utils;

import com.cs.internal.factory.BikePart;
import com.cs.internal.factory.BikeFactory;
import com.cs.internal.store.BikeStore;

import java.util.Scanner;

public class BuyPart {

    public void buyPart() {
        Scanner scanner = new Scanner(System.in);
        listAllParts();
        String selection = scanner.nextLine();
        int partNumber = Integer.parseInt(selection);
        if (partNumber == 0) {
            BikeStore a = new BikeStore();
            a.startUpScreen();
            return;
        }
        BikePart toBuy = getPart(partNumber);
        if (toBuy == null) {
            System.out.println("No bike under this selection");
            BikeStore  a = new BikeStore();
            a.startUpScreen();
        } else {
            System.out.println("Please pay " + toBuy.getPrice());
            //scan input price
            //if equal thank you
        }
    }

    //buy(Part bike){.. please pay, new scanner, read in value, chekc value. if(input = totalpirce) then (thanks)  else (-)

    private void listAllParts() {
        System.out.println("==========================");
        System.out.println("Our PArts:");
        System.out.println("==========================");
        System.out.println("");
        for (BikePart bp : BikeFactory.getAllBikeParts()) {
            System.out.println(bp.toString());
        }
        System.out.println("==========================");
        System.out.println("Type in the partNumber to buy a part or 0 to return to main menu.");
        System.out.println("==========================");
    }

    private BikePart getPart(int number) {
        for (BikePart bp :  BikeFactory.getAllBikeParts()) {
            if (bp.getPartNumber() == number) {
                return bp;
            }
        }
        return null;
    }

}
