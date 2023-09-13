package com.Circle;

//Area class
class Area {
	
    static double calculateAreaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }
}

// Circle class
class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Area.calculateAreaOfCircle(radius);
    }
}

// Main class
public class ROUND {
    public static void main(String[] args) {
        Circle c = new Circle(25);
        double area = c.calculateArea();
        System.out.println("Area of the circle: " + area);
    }
}