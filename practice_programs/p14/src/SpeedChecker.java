package Antrix;
import java.util.Scanner;
public class SpeedChecker {

    static class Speed {
        double distance, time;

        void input() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter distance (in km): ");
            distance = sc.nextDouble();
            System.out.print("Enter time (in hours): ");
            time = sc.nextDouble();
        }

        void calculate() {
            double speed = distance / time;
            System.out.println("Your speed is: " + speed + " km/h");

            if (speed < 20) {
                System.out.println("You are moving slowly.");
            } else if (speed <= 60) {
                System.out.println("You are moving at an average speed.");
            } else {
                System.out.println("You are moving fast.");
            }
        }
    }

    public static void main(String[] args) {
        Speed s = new Speed();
        s.input();
        s.calculate();
    }
}