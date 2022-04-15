package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку для подсчёта слов: ");
        String str = in.nextLine();
        String[] n = str.split(" ");
        System.out.println("Вы ввели " + n.length + " слов(-а)");

    }
}
