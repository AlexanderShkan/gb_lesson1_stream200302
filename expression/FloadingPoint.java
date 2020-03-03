package ru.geekbrains.lessons1.expression;
import java.util.Scanner;

public class FloadingPoint {
    public static void main (String[] args) {
        int a=10;
        int b=20;
        int c=30;
        int d=40;
        float result;
        double result1;
        result = a*(b+(c/d));
        System.out.println("Результат выражения по входным параметрам " + result);
        // Попробуем ручной ввод с клавиатура для получения результата
        System.out.println("Для получения результата выражения a*(b+(c/d) по введеным значениям сделайте следующее: ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число a: ");
        a = scan.nextInt();
        System.out.println("Введите число b: ");
        b = scan.nextInt();
        System.out.println("Введите число c: ");
        c = scan.nextInt();
        System.out.println("Введите число d: ");
        d = scan.nextInt();
        result1 = a*(b+(c/d));
        System.out.println("Результат выражения по введеным вами числам = " + result1);
    }
}
