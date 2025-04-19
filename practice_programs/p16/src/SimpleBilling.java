package Antrix;
import java.util.Scanner;

public class SimpleBilling{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        double total = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("\nItem " + i + " details:");
            System.out.print("Enter item name: ");
            String name = sc.next();
            System.out.print("Enter item price: ₹");
            double price = sc.nextDouble();
            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            double itemTotal = price * quantity;
            total += itemTotal;

            System.out.println("Subtotal for " + name + ": ₹" + itemTotal);
        }
        System.out.println("Total Bill Amount: ₹" + total);
        sc.close();
    }
}