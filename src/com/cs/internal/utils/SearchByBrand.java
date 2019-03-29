package com.cs.internal.utils;

import com.cs.internal.factory.BikePart;
import com.cs.internal.factory.BikeFactory;

import java.util.List;
import java.util.Scanner;

public class SearchByBrand {

    public static void searchByBrand() {
        Scanner brandSelection = new Scanner(System.in);
        System.out.println("choose a bmx brand from the following : ");
        System.out.println("Cult , Merritt , BSD , colony ");
        String brand = brandSelection.nextLine();
        System.out.println("band = " + brand);
        List<BikePart> parts = BikeFactory.getBikePartByBrand(brand);
        if (parts.isEmpty()) {
            System.out.println("Not a valid BMX brand");
        } else {
            for (BikePart bp : parts) {
                System.out.println(bp);
            }
        }
    }

}
