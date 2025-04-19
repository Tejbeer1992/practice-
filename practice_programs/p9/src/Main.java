package project_1;

import java.util.Scanner;

interface Area{
    void getArea();
}

class Rectangle implements Area{
    void getArea(double breadth, double length) {
        System.out.println("Area of Rectangle: "+length*breadth);
    }
}

class Circle implements Area{
    void getArea(double radius) {
        System.out.println("Area of Circle: "+3.14*radius*radius);
    }
}

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        double l, b;
        double r;

        Scanner scan = new Scanner(System.in);
        Rectangle m1 = new Rectangle();

        System.out.print("Enter Length: ");
        l=scan.nextDouble();
        System.out.print("Enter Breadth: ");
        b=scan.nextDouble();
        m1.getArea(l,b);

        Circle m2 = new Circle();
        System.out.print("Enter Radius: ");
        r=scan.nextDouble();
        m2.getArea(r);
    }
}
