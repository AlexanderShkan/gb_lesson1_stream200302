package ru.geekbrains.lessons1.myname;

import java.util.Scanner;

public class myname {

    public static void main(String[] args) {
	 System.out.println("Здравствуйте. Как Ваше имя?");
	 String name;
        Scanner namescan = new Scanner(System.in);
        name = namescan.next();
        System.out.println ("Привет, " + name + " !");
    }
}
