package ru.mirea.lab3;

import java.util.Random;

public class ex3 {
    public static void main(String[] args) {
        // Создаем массив из 4 случайных целых чисел в диапазоне [10, 99]
        int[] array = new int[4];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(90) + 10; // Генерируем число от 10 до 99
        }

        // Выводим массив на экран в строку
        System.out.print("\nМассив: ");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();

        // Проверяем, является ли массив строго возрастающей последовательностью
        boolean isIncreasing = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] >= array[i + 1]) {
                isIncreasing = false;
                break;
            }
        }

        // Выводим сообщение о результате
        if (isIncreasing) {
            System.out.println("Массив является строго возрастающей последовательностью.");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью.");
        }
    }
}



