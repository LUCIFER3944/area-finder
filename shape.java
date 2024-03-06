import java.lang.Math;

// Base class
abstract class Shape1 {
    abstract double area();
}

// Circle class
class Circle extends Shape1 {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

  
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}

// Square class
class Square extends Shape1 {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

  
    double area() {
        return Math.pow(sideLength, 2);
    }
}

// Rectangle class
class Rectangle extends Shape1 {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

  
    double area() {
        return length * width;
    }
}

// Cube class
class Cube extends Shape1 {
    private double sideLength;

    public Cube(double sideLength) {
        this.sideLength = sideLength;
    }

   
    double area() {
        return 6 * Math.pow(sideLength, 2);
    }
}

// Example usage
public class shape{
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(4);
        Rectangle rectangle = new Rectangle(6, 8);
        Cube cube = new Cube(3);

        System.out.println("Area of the circle: " + circle.area());
        System.out.println("Area of the square: " + square.area());
        System.out.println("Area of the rectangle: " + rectangle.area());
        System.out.println("Surface area of the cube: " + cube.area());
    }
}
