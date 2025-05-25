package com.linkedIn_learning.collections;

public class Room {
    /*
     * This class is used to show a demo about modeling the type of accommodation provided by hotels,
     * to show what can be achieved using data structures in conjunction with Java's 'collections' framework,
     * to achieve advanced functionality and solve real-world problems efficiently.
     * */

    private String name;
    private String type;
    private int capacity;
    private double rate;

    // constructor for the class
    public Room(String name, String type, int capacity, double rate) {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
        this.rate = rate;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getType() {
        return type;
    }

    public void setType(String newType) {
        this.type = newType;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int newCapacity) {
        this.capacity = newCapacity;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double newRate) {
        this.rate = newRate;
    }

    // No idea what this method from the GitHub files for section 1, video 4, part b is about
    public Room(String name, String type) {
        super();
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Room [name=" + name + ", type=" + type + ", capacity=" + capacity + ", rate=" + rate + "]";
    }
}
