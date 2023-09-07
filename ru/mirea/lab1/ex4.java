package ru.mirea.lab1;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //ввод с клавиатуры...
        System.out.print("n = ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter numbers:");
        for (int i=0; i < n; i++) {  //записывание чисел в массив
            arr[i] = in.nextInt();
        }

        int sum = 0;
        int maxi = arr[0];
        int mini = arr[0];
        int c = 0;
        while (c < n) { //цикл while для поиска  нужных  нам значений
            sum += arr[c];
            if (arr[c] > maxi) {
                maxi = arr[c];
            }
            if (arr[c] < mini) {
                mini = arr[c];
            }
            c++;
        } //вывод полученных результатов
        System.out.println("while:");
        System.out.println("sum = " + sum);
        System.out.println("max = " + maxi);
        System.out.println("min = " + mini);

        maxi = arr[0];
        mini = arr[0];
        c = 0;
        sum = 0;
        do { //цикл do while для поиска  нужных нам значений
            sum += arr[c];
            if (arr[c] > maxi) {
                maxi = arr[c];
            }
            if (arr[c] < mini) {
                mini = arr[c];
            }
            c++;
        } while (c < n);
        System.out.println("do while:"); //вывод полученных результатов
        System.out.println("sum = " + sum);
        System.out.println("max = " + maxi);
        System.out.println("min = " + mini);

    }
}
