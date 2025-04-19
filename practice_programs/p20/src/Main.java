package Antrix;
import java.util.Scanner;

public class Main {

    interface Fare {
        void calculateFare();
    }
    static class Bus implements Fare {
        public void calculateFare() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter distance in km: ");
            double km = sc.nextDouble();
            double fare = km * 1.5;
            System.out.println("Bus fare for " + km + " km is ₹" + fare);
        }
    }
    static class Train implements Fare {
        public void calculateFare() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter distance in km: ");
            double km = sc.nextDouble();
            double fare = km * 1.0;
            System.out.println("Train fare for " + km + " km is ₹" + fare);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Transport Fare Calculator");
        System.out.println("1. Bus\n2. Train");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        Fare transport;
        if (choice == 1) {
            transport = new Bus();
        } else if (choice == 2) {
            transport = new Train();
        } else {
            System.out.println("Invalid choice.");
            return;
        }
        transport.calculateFare();
        sc.close();
    }
}