package com.itacademy.java.oop.basics.task1;

public class Rectangle extends Shape {
    private double side;
    private double side2;

    public Rectangle(double side, double side2) {
        this.side = side;
        this.side2 = side2;
    }

    @Override
    double calculateArea() {
        return side * side2;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (side + side2);
    }

    @Override
    public String toString() {
        return "Rectangle Area: " + calculateArea() + ", perimeter: " + calculatePerimeter();
    }
}
