import java.util.*;

public class Passenger {
    String name;
    int passengerNumber;
    String passengerType;
    double balance;
    List<Activity> enrolledActivities;

    public Passenger(String name, int passengerNumber, String passengerType, double balance) {
        this.name = name;
        this.passengerNumber = passengerNumber;
        this.passengerType = passengerType;
        this.balance = balance;
        this.enrolledActivities = new ArrayList<>();
    }

    public void signUpForActivity(Activity activity) {
        String CurrentPassengerType = passengerType.toUpperCase();
        boolean isEnrolled = false;
        if (CurrentPassengerType.equals(PassengerType.STANDARD.toString())) {
            if (balance >= activity.cost) {
                isEnrolled = activity.enrollPassenger(this);
                if (isEnrolled) {
                    System.out.println("Enrollment completed for " + name);
                    balance -= activity.cost;
                    enrolledActivities.add(activity);
                } else {
                    System.out.println("Enrollment failed for " + name + " due to capacity constraints.");
                }
            } else {
                System.out.println("Insufficient balance for " + name + " to enroll in " + activity.name + ".");
            }
        } else if (CurrentPassengerType.equals(PassengerType.GOLD.toString())) {
            double discountedCost = 0.9 * activity.cost;
            if (balance >= discountedCost) {
                isEnrolled = activity.enrollPassenger(this);
                if (isEnrolled) {
                    System.out.println("Enrollment completed for " + name);
                    balance -= activity.cost;
                    enrolledActivities.add(activity);
                } else {
                    System.out.println("Enrollment failed for " + name + " due to capacity constraints.");
                }
            } else {
                System.out.println("Insufficient balance for " + name + " to enroll in " + activity.name + ".");
            }
        } else if (CurrentPassengerType.equals(PassengerType.PREMIUM.toString())) {
            isEnrolled = activity.enrollPassenger(this);
            if (isEnrolled) {
                System.out.println("Enrollment completed for " + name);
                enrolledActivities.add(activity);
            } else {
                System.out.println("Enrollment failed for " + name + " due to capacity constraints.");
            }
        }
    }
}
