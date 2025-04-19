class Calculator {
    double calculate(double num1, double num2) {
        return 0; // Default behavior
    }
}

class Addition extends Calculator {
    double calculate(double num1, double num2) {
        return num1 + num2;
    }
}

class Subtraction extends Calculator {
    double calculate(double num1, double num2) {
        return num1 - num2;
    }
}

class Multiplication extends Calculator {
    double calculate(double num1, double num2) {
        return num1 * num2;
    }
}

class Division extends Calculator {
    double calculate(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new ArithmeticException("Division by zero is not allowed");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        double num1 = 10.0, num2 = 5.0;

        Calculator add = new Addition();
        System.out.println("Addition: " + add.calculate(num1, num2));

        Calculator subtract = new Subtraction();
        System.out.println("Subtraction: " + subtract.calculate(num1, num2));

        Calculator multiply = new Multiplication();
        System.out.println("Multiplication: " + multiply.calculate(num1, num2));

        Calculator divide = new Division();
        try {
            System.out.println("Division: " + divide.calculate(num1, num2));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}