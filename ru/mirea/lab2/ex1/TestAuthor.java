package ru.mirea.lab2.ex1;

public class TestAuthor {
    public static void main(String[] args) {
        Author k1 = new Author("Willy", "willy@mail.ru", 'M');
        Author k2 = new Author("Elisabeth", "elisabeth@mail.ru", 'F');

        System.out.println("----Author 1----");

        System.out.println("Имя: " + k1.getName());
        System.out.println("Почта: " + k1.getEmail());
        System.out.println("Пол: " + k1.getGender());

        System.out.println("\n----Author 2----");

        System.out.println("Имя: " + k2.getName());
        System.out.println("Почта: " + k2.getEmail());
        System.out.println("Пол: " + k2.getGender());


    }
}
