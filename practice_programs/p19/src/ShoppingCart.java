import java.util.Scanner;
public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;
        System.out.print("Enter the item you desire to buy: ");
        item = sc.next();
        System.out.print("Enter the quantity of the product: ");
        quantity = sc.nextInt();
        System.out.print("Enter the price of the product: ");
        price = sc.nextDouble();
        total = price*quantity;
        System.out.println("Your total of "+ item +"/s is: "+currency+""+total);
    }
}