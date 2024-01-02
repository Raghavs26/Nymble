public class Main {
    public static void main(String[] args) {

        TravelPackage travelPackage = new TravelPackage("Japan", 20);

        Destination destination1 = new Destination("Tokyo");
        Activity activity1 = new Activity("Sightseeing", "Visit tourist attractions", 30, 15, destination1);
        destination1.activities.add(activity1);

        Destination destination2 = new Destination("Mt. Fuji");
        Activity activity2 = new Activity("Hiking", "Enjoy a scenic hike", 70, 8, destination2);
        destination2.activities.add(activity2);

        Passenger passenger1 = new Passenger("John", 1, "standard", 100);
        Passenger passenger2 = new Passenger("Alice", 2, "gold", 150);
        Passenger passenger3 = new Passenger("Bob", 3, "premium", 0);

        travelPackage.addDestination(destination1);
        travelPackage.addDestination(destination2);
        travelPackage.addPassenger(passenger1);
        travelPackage.addPassenger(passenger2);
        travelPackage.addPassenger(passenger3);

        // Print Itinerary
        travelPackage.printItinerary();
        System.out.println();

        // Print Passenger List
        travelPackage.printPassengerList();
        System.out.println();

        passenger1.signUpForActivity(activity1);
        passenger2.signUpForActivity(activity2);
        passenger3.signUpForActivity(activity1);

        // Print Passenger Details
        travelPackage.printPassengerDetails(passenger1);
        System.out.println();
        travelPackage.printPassengerDetails(passenger2);
        System.out.println();
        travelPackage.printPassengerDetails(passenger3);
        System.out.println();

        // Print Available Activities
        travelPackage.printAvailableActivities();
        System.out.println();
        // Enroll passengers in activities
    }
}
