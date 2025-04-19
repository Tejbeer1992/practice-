import java.util.Scanner;
public class ElectricityBill {
    static class Bill {
        double units;
        double total;
        void input() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter electricity units consumed: ");
            units = sc.nextDouble();
        }
        void calculate() {
            if (units <= 100) {
                total = units * 1.5;
            } else if (units <= 300) {
                total = 100 * 1.5 + (units - 100) * 2;
            } else {
                total = 100 * 1.5 + 200 * 2 + (units - 300) * 3;
            }
            System.out.println("Your total electricity bill is: ₹" + total);
        }
    }
    public static void main(String[] args) {
        Bill b = new Bill();
        b.input();
        b.calculate();
    }
}