import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static String getName() {
        System.out.print("Enter the name: ");
        return sc.nextLine();
    }

    public static int getAge() {
        System.out.print("Enter the age: ");
        return sc.nextInt();
    }

    public static void birthdaySong(String name, int age) {
        System.out.println("\nHappy Birthday to youu");
        System.out.println("Happy Birthday to youuuu");
        System.out.println("Happy Birthday dear " + name);
        System.out.println("Happy Birthday to you!!!!");
        System.out.println("\nCongratulations you are now " + age + " years old!");
        System.out.println("Have a great day, " + name + "!");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Happy Birthday Song Program");
        String name = getName();
        int age = getAge();
        birthdaySong(name, age);
    }
}