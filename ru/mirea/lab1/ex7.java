package ru.mirea.lab1;

public class ex7 {
    public static void fact(int num) { //метод подсчета факториала
        int res = 1;
        for (int i = 1; i <= num; i++) { //цикл для подсчета факториала
            res *= i;
        }
        System.out.println(res); //вывод результата
    }
    public static void main(String[] args) { //вызов метода
        fact(5);
    }
}
