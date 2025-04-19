import java.util.Scanner;


class BelowAgeLimit extends Exception {
    public BelowAgeLimit(int age) {
        super("Error: Age " + age + " is below the required limit of 18.");
    }
}


class AgeValidator {
    public void validateAge(int age) throws BelowAgeLimit {
        if (age < 18) {
            throw new BelowAgeLimit(age);
        }
        System.out.println("Success: Age " + age + " is valid.");
    }
}

public class exception1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your age: ");
        int userAge = scanner.nextInt();

        AgeValidator validator = new AgeValidator();

        try {
            validator.validateAge(userAge);
        } catch (BelowAgeLimit exception) {
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("Age validation completed.");
        }

        scanner.close();
    }
}