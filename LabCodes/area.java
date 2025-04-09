import java.text.DecimalFormat;
import java.util.Scanner;

abstract class Shape {
    abstract void rectangleArea(double length, double breadth);

    abstract void squareArea(double side);

    abstract void circleArea(double radius);
}

class area extends Shape {
    void rectangleArea(double length, double breadth) {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }

    void squareArea(double side) {
        System.out.println("Area of Square: " + (side * side));
    }

    void circleArea(double radius) {
        DecimalFormat d=new DecimalFormat("#.##");
        System.out.println("Area of Circle: " + d.format(Math.PI * radius * radius));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        area obj = new area();
        System.out.print("Enter length and breadth of rectangle: ");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        obj.rectangleArea(length, breadth);
        System.out.print("Enter side of square: ");
        double side = sc.nextDouble();
        obj.squareArea(side);
        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        obj.circleArea(radius);
        sc.close();
    }
}