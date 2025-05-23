public class Application {

    public static void main(String[] args) {

        Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
        Room manchester = new Room("Manchester", "Suite", 5, 250.0);

        double total = getTotalRevenue(cambridge, manchester);
        System.out.println(total);
    }

    private static double getTotalRevenue(Room room1, Room room2) {
        return room1.getRate() + room2.getRate();
    }

    // It is quite easy to see a potential problem in the above function.
    // If we wanted to calculate the total revenue for 5 rooms, we'd have to refactor the function.
    // This is largely inefficient, as it leads to having to refactor the same code too many times.
    // There is obviously a better way to use the above function when many rooms are used in the calculation.
}
