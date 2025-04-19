import java.util.Scanner;
public class TransportFare {

    interface Fare {
        void calculateFare();
    }
    static class BusFare implements Fare {
        public void calculateFare() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter distance traveled (in km): ");
            double distance = sc.nextDouble();
            double rate = 7.5; // per km
            double fare = distance * rate;
            System.out.println("Total bus fare: ₹" + fare);
        }
    }

    public static void main(String[] args) {
        Fare fareCalculator = new BusFare();
        fareCalculator.calculateFare();
    }
}