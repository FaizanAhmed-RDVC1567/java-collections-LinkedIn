package com.linkedIn_learning.collections;

import java.util.Arrays;

public class ApplicationWithArrays {

    public static void main(String[] args){

        Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
        Room manchester = new Room("Manchester", "Suite", 5, 250.0);
        Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
        Room oxford = new Room("Oxford", "Suite", 5, 225.0);

        // The code below demonstrates using the 'arraycopy' function from the System class,
        // to copy the contents of an old array into a new array, provided that the data type
        // of the two arrays matches. The length of the first array has been deliberately set
        // to a value of 3 to demonstrate the 'arraycopy' method, and also to show how arrays
        // in Java have to have a set number of elements upon initialization.
        // This is not the case when the 'Collection' interface is used to initialize an array.

        Room[] rooms = new Room[3];
        rooms[0] = cambridge;
        rooms[1] = manchester;
        rooms[2] = piccadilly;

        // Doing the 'arraycopy' bit
        Room[] moreRooms = new Room[4];
        System.arraycopy(rooms, 0, moreRooms, 0, rooms.length);
        moreRooms[moreRooms.length - 1] = oxford;

        // Finally, we do the calculation for potential revenue, by calling the function below
        double total = getPotentialRevenue(moreRooms);
        System.out.println(total);
    }

    private static double getPotentialRevenue(Room[] rooms) {
        return Arrays.stream(rooms)
                    .mapToDouble(r -> r.getRate())
                    .sum();
    }
}
