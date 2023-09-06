package ru.mirea.lab1;

public class ex1_3 {
    public static void main(String[] args){
        int[] Array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}; //создание массива
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < Array.length; i++) {  //цикл для суммирования элементов массива
            sum = sum + Array[i];
        }
        avg = sum/Array.length; //поиск среднего арифм. в массиве

        System.out.println("Sum: " +sum); //вывод  суммы
        System.out.println("Avg: " +avg); // вывод  среднего  арифм.
    }
}
