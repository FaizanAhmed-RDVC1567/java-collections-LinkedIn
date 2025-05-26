package com.linkedIn_learning.collections;

import java.util.Collection;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
        Room manchester = new Room("Manchester", "Suite", 5, 250.0);
        Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.0);
        Room oxford = new Room("Oxford", "Suite", 5, 225.0);

        // Here, we'll be improving the code from the previous code section (01_04b).
        // By using the Collections interface, we'll create a list of rooms that will contain the above rooms.
        // That way, we can simply iterate through the collection grabbing each room's individual rate.
        // Following which, we will just call the 'sum()' function to add all the room rates together.
        // This ensures we get the required result while keeping the code concise and easy to understand.
        Collection<Room> rooms = List.of(cambridge, manchester, piccadilly, oxford);
        double total = getPotentialRevenue(rooms);

        // After getting the total, we simply print out the result.
        System.out.println(total);

        // The 'mapToDouble' method, which is used in the above function call, is used to transform each
        // element of the stream into a 'double'-valued stream. This method is particularly useful when
        // you need to perform numerical operations or calculations on the elements of the stream.
        // Just like other similar methods, it is an intermediate operation. The function takes
        // 'ToDoubleFunction<? superT>' as a parameter, which is a functional interface that applies a function
        // to each element of the stream and produces 'double' value. The method returns a 'DoubleStream',
        // which is a specialized stream for handling primitive 'double' values. On this stream of sequential
        // double values, the terminating operation 'sum()' is called, which calculates the total which is returned
        // by the 'return' keyword to the main function.
    }

    private static double getPotentialRevenue(Collection<Room> rooms) {
        /*
         * The 'java.util.stream.Stream<E>' is a part of the Stream API, introduced in Java 8.
         * It's primary purpose is to process sequences of elements in a functional style.
         * This enables operations like filtering, mapping, and reducing on collections of objects.
         *
         * Key features and functionality:
         *
         * 1) Declarative processing:
         *   Streams allow developers to express complex data processing queries in a declarative manner, similar to SQL.
         *   For example, you can filter, map, and reduce collections of data without writing explicit loops.
         *
         * 2) Intermediate and Terminal Operations:
         *
         *   INTERMEDIATE OPERATIONS:
         *   Methods such as 'filter()', 'map()', 'sorted()', exist. These return a new stream and are lazily executed,
         *   which means they do not perform any processing until a terminal operation is invoked.
         *
         *   TERMINAL OPERATIONS:
         *   These include methods like 'forEach()', 'collect()' and 'reduce()'. They trigger the actual processing
         *   of the stream and produce a result or side effect.
         *
         * 3) Parallel processing:
         *   Streams can be processed in parallel, leveraging multicore architectures for better performance.
         *   This is achieved using the 'parallelStream()' method.
         *
         * 4) No storage:
         *   Streams do not store elements; they convey elements from a source (like a collection), through a
         *   pipeline of operations.
         *
         * 5) Functional programming:
         *   Streams support functional-style operations on streams of elements, such as 'sum()', 'map()', 'filter()',
         *   'reduce()', which can be chained together to form a pipeline.
         * */
        return rooms.stream()
                .mapToDouble(room -> room.getRate()) // This can be written as 'Room::getRate' instead.
                .sum();
    }
}
