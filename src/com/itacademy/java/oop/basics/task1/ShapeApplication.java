package com.itacademy.java.oop.basics.task1;

public class ShapeApplication {
    public static void main(String[] args) {

        Square square3 = new Square(3);
        System.out.println(square3.toString());

        Circle circle3 = new Circle(3);
        System.out.println(circle3.toString());

        Triangle triangle3 = new Triangle(3);
        System.out.println(triangle3.toString());

        Rectangle rec24 = new Rectangle(2, 4);
        System.out.println(rec24.toString());

    }
}
