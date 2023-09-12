package ru.mirea.lab3;

import java.util.Scanner;
import java.util.Random;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int n;
        while (true) {
            System.out.print("Введите размер массива (натуральное число больше 0): ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n > 0) {
                    break;
                }
            }
            System.out.println("Некорректный ввод. Пожалуйста, введите натуральное число больше 0.");
            scanner.nextLine(); // Очистить буфер ввода
        }

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(n + 1);
        }

        System.out.println("\nСгенерированный массив:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("\nМассив из четных элементов:");
        for (int i : array) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
