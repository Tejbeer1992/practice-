class Shape {
    double getArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double getArea() {
        return length * width;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println("Shape area: " + shape.getArea());

        Shape rectangle = new Rectangle(5.0, 3.0);
        System.out.println("Rectangle area: " + rectangle.getArea());
    }
}