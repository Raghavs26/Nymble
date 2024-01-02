import java.util.*;

class Activity {
    String name;
    String description;
    double cost;
    int capacity;
    Destination destination;
    List<Passenger> enrolledPassengers;

    public Activity(String name, String description, double cost, int capacity, Destination destination) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.capacity = capacity;
        this.destination = destination;
        this.enrolledPassengers = new ArrayList<>();
    }

    public boolean enrollPassenger(Passenger passenger) {
        if (enrolledPassengers.size() < capacity) {
            enrolledPassengers.add(passenger);
            return true;
        } else {
            return false;
        }
    }
}