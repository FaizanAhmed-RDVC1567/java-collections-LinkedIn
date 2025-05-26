package com.linkedIn_learning.collections;

import java.util.Arrays;

public class ApplicationWithArrays {

    public static void main(String[] args){

        Room cambridge = new Room("Cambridge", "Premier Room", 4, 175.00);
        Room manchester = new Room("Manchester", "Suite", 5, 250.0);
        Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.0);
        Room oxford = new Room("Oxford", "Suite",5, 225.0);

        // Going to declare an array of Room objects, but initialize it to null to show a concept
        Room[] rooms = null;


        double total = getPotentialRevenue(rooms);
    }

    private static double getPotentialRevenue(Room[] rooms) {
        return Arrays.stream(rooms)
                .mapToDouble(r -> r.getRate())
                .sum();
    }
}
