package com.pluralsight;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Asset> assets = new ArrayList<>();
        Vehicle v1 = new Vehicle(2000, "Honda", LocalDate.of(2002, 3, 2));
        assets.add(v1);
        assets.add(new Vehicle(2000, "BMW", LocalDate.of(2002, 3, 2)));


        // Loop through and display details
        for (Asset asset : assets) {
            System.out.println("Description: " + asset.getDescription());
            System.out.println("Date Acquired: " + asset.getDateAquired());
            System.out.println("Original Cost: $" + asset.getOriginalCost());
            System.out.println("Current Value: $" + asset.getValue());

            // Use instanceof to determine if the asset is a Vehicle or House and display specific details
            if (asset instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) asset;
                System.out.println("Year: " + vehicle.getYear());
                System.out.println("Make/Model: " + vehicle.getMakeModel());
            } else if (asset instanceof House) {
                House house = (House) asset;
                System.out.println("Address: " + house.getAddress());
            }
            System.out.println("------------");
        }
    }
}




