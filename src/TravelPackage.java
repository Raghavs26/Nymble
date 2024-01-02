import java.util.*;

class TravelPackage {
    String name;
    int passengerCapacity;
    List<Destination> destinations;
    List<Passenger> passengers;

    public TravelPackage(String name, int passengerCapacity) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.destinations = new ArrayList<>();
        this.passengers = new ArrayList<>();
    }

    public void addDestination(Destination destination) {
        destinations.add(destination);
    }

    public void addPassenger(Passenger passenger) {
        if (passengers.size() < passengerCapacity) {
            passengers.add(passenger);
        } else {
            System.out.println("Travel package " + name + " is already at full capacity.");
        }
    }

    public void printItinerary() {
        System.out.println("Travel Package: " + name);
        for (Destination destination : destinations) {
            System.out.println("\nDestination: " + destination.name);
            for (Activity activity : destination.activities) {
                System.out.println("Activity: " + activity.name + ", Cost: " + activity.cost + ", Capacity: "
                        + activity.capacity + ", Description: " + activity.description);
            }
        }
    }

    public void printPassengerList() {
        System.out.println("Passenger List for Travel Package " + name);
        System.out.println("Capacity: " + passengerCapacity + ", Enrolled Passengers: " + passengers.size());
        for (Passenger passenger : passengers) {
            System.out
                    .println("Passenger Name: " + passenger.name + ", Passenger Number: " + passenger.passengerNumber);
        }
    }

    public void printPassengerDetails(Passenger passenger) {
        System.out.println("Passenger Details: " + passenger.name);
        System.out.println("Passenger Number: " + passenger.passengerNumber);
        if (passenger.balance > 0) {
            System.out.println("Balance: " + passenger.balance);
        }
        System.out.println("Enrolled Activities:");
        System.out.println("Number of Activities: " + passenger.enrolledActivities.size());
        for (Activity activity : passenger.enrolledActivities) {
            System.out.println("Activity: " + activity.name + ", Destination: " + activity.destination.name
                    + ", Price: " + activity.cost);
        }
    }

    public void printAvailableActivities() {
        System.out.println("Available Activities:");
        for (Destination destination : destinations) {
            for (Activity activity : destination.activities) {
                int availableSpaces = activity.capacity - activity.enrolledPassengers.size();
                System.out.println("Activity: " + activity.name + ", Destination: " + destination.name
                        + ", Available Spaces: " + availableSpaces);
            }
        }
    }
}
