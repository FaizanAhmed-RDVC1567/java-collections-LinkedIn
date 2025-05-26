package com.linkedIn_learning.collections;

import java.util.Arrays;

public class FlexibleArrays {
    /*
    * The point of this class is to demonstrate how a developer could potentially develop their own
    * flexible array data structure, while also showing the possibility for bugs to present in code
    * as a result of coding mishaps. It also highlights the fact that while a developer may get some
    * flexibility with this approach, in the long run, this method is highly inefficient for productivity.
    * That is because an already established, performance-proven interface for dealing with groups of elements
    * exists that is devoid of performance issues and costly bugs, which gives developers peace of mind.
    * */

    Room[] roomsArray = new Room[2];

    public void add(Room newRoomObj) {
        Room[] newRoomsArray = Arrays.copyOf(this.roomsArray, this.roomsArray.length + 1);
        newRoomsArray[this.roomsArray.length] = newRoomObj; // This is a bug, as the old array's length is being used.
        this.roomsArray = newRoomsArray;
    }
}
