package ru.geekbrains.lessons1.plusminus0;

import java.util.Scanner;

public class plusminus0 {

    public static void main(String[] args) {
        System.out.println("Программа проверяет число на положительность и отрицательность.\nВведите любое целове число: ");
        Scanner scanner = new Scanner(System.in);
        int a;
        a = scanner.nextInt();
        if (a >=0) {
            System.out.println("Вы ввесли число: " + a + "\nЧисло положительное.");
        }
        else
            System.out.println ("Вы ввесли число: " + a + "\nЧисло отрицательное.");
    }
}
