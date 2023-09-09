package ru.mirea.lab2.ex6;

import static ru.mirea.lab2.ex6.Circle.Compare;

public class CircleTest {
    public static void main(String[] args) {
        Circle k1 = new Circle(0, "Circle 1");
        Circle k2 = new Circle(0, "Circle 2");
        Circle k3 = new Circle(0, "Circle 3");

        k1.setDiameter(10);
        k2.setDiameter(20);
        k3.setDiameter(30);

        System.out.println(k1.getName() + " diameter = " + k1.getDiameter());
        System.out.println(k2.getName() + " diameter = " + k2.getDiameter());
        System.out.println(k3.getName() + " diameter = " + k3.getDiameter() + "\n");
        
        System.out.println(k1.getName() + " square = " + k1.getSquare(k1.getDiameter()));
        System.out.println(k2.getName() + " square = " + k2.getSquare(k2.getDiameter()) + "\n");

        System.out.println(k1.getName() + " perimeter = " + k1.getPerimeter(k1.getDiameter()));
        System.out.println(k2.getName() + " perimeter = " + k2.getPerimeter(k2.getDiameter()) + "\n");


        Compare(k1, k2);
        Compare(k1, k3);
        Compare(k2, k3);

    }
}
