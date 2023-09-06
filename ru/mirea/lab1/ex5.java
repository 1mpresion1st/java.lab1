package ru.mirea.lab1;

public class ex5 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) { //цикл вывода аргументов командной строки
            System.out.println("args[" + i + "] = \"" + args[i] + "\"");
        }
    }
}
