package com.itacademy.java.oop.basics.task1;

public class Triangle extends Shape {

    private double side;

    public Triangle(double side) {
        this.side = side;
    }

    @Override
    double calculateArea() {
        return 3 * side;
    }

    @Override
    double calculatePerimeter() {
        return  (side * Math.sqrt(Math.pow(side, 2)+Math.pow(side/2,2)))/2 ;
    }

    @Override
    public String toString() {
        return "Triangle Area: " + calculateArea() +", perimeter: " + calculatePerimeter();
    }
}
