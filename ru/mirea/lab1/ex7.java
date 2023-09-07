package ru.mirea.lab1;

import java.math.BigInteger;

public class ex7 {
    public static void fact(BigInteger num) { //метод подсчета факториала
        BigInteger res = BigInteger.valueOf(1);
        for (BigInteger i = BigInteger.valueOf(1); i.compareTo(num) <= 0; i = i.add(BigInteger.valueOf(1))) { //цикл для подсчета факториала
            res = res.multiply(i);
        }
        System.out.println(res); //вывод результата
    }
    public static void main(String[] args) { //вызов метода
        fact(BigInteger.valueOf(45500));
    }
}
