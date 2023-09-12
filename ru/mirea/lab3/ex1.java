package ru.mirea.lab3;

import java.util.Arrays;
import java.util.Random;

public class ex1 {
    public static void main(String[] args) {
        Random rand = new Random();
        double[] array;
        array = new double[5];

//        for (int i = 0; i < array.length; i++){
//            array[i] = Math.random();
//        };

        for (int i = 0; i < array.length; i++){
            array[i] = rand.nextInt(10000);
        };

        System.out.println("\n----Not Sorted Array----");

        for (double value : array) {
            System.out.println(value);
        }

        System.out.println("\n----Sorted Array----");

        Arrays.sort(array);

        for (double value : array) {
            System.out.println(value);
        }
    }
}