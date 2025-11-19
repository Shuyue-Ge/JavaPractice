/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter9Lab;

/**
 *
 * @author win
 */

abstract class Shape {
    public abstract double area();
    public abstract double perimeter();
}

class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }
}

class Triangle extends Shape {
    double a, b, c; // lengths of sides

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        // Heron's formula
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double perimeter() {
        return a + b + c;
    }
}

public class Lab3 {
    public static void main(String[] args) {

        Shape[] shapes = {
            new Circle(3),
            new Rectangle(4, 6),
            new Triangle(3, 4, 5)
        };

        double totalArea = 0;
        Shape largestPerimeterShape = shapes[0];

        for (Shape s : shapes) {
            totalArea += s.area();

            if (s.perimeter() > largestPerimeterShape.perimeter()) {
                largestPerimeterShape = s;
            }
        }

        System.out.println("Total Area of All Shapes: " + totalArea);
        System.out.println("Largest Perimeter: " + largestPerimeterShape.perimeter());
        System.out.println("Shape Type with Largest Perimeter: " 
                           + largestPerimeterShape.getClass().getSimpleName());
    }
}
