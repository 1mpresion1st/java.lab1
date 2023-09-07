package ru.mirea.lab2.ex2;

public class TestBall {
    public static void main(String[] args) {
        Ball k1 = new Ball(0, 0);
        System.out.println("x = " + k1.getX());
        System.out.println("y = " + k1.getY());

        k1.setX(5);
        k1.setY(5);

        System.out.println("x = " + k1.getX());
        System.out.println("y = " + k1.getY());

        k1.move(5, 5);
        System.out.println("x = " + k1.getX());
        System.out.println("y = " + k1.getY());
    }
}
