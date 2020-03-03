package ru.geekbrains.lessons1.ChecingSum;
import java.util.Scanner;

public class ChecingSum {

    public static void main(String[] args) {
        System.out.println("Введите числа, чтобы их сумма была больше 10 и меньше 20");
        int firstnum;
        int secondnum;
        System.out.println("Введите первое число: ");
        Scanner scan = new Scanner(System.in);
        firstnum = scan.nextInt();
        System.out.println("Введите второе число: ");
        Scanner scanner = new Scanner(System.in);
        secondnum = scan.nextInt();
        int sum = firstnum + secondnum;
        if (sum >= 10 && sum <= 20) { // поставил скобки на 1 условие
            System.out.println("Верно! Сумма чисел = " + sum);
        }
        else // не поставил скобки на 1 условеие
            System.out.println("Не верно! Сумма чисел = " + sum);
    }
}
