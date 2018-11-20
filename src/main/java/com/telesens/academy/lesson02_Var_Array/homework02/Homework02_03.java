package com.telesens.academy.lesson02_Var_Array.homework02;

/*
3.
a) Инициализировать две переменные. Поменять их значения местами
*/

import java.util.Scanner;

public class Homework02_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer, please: a = ");
        int a = scanner.nextInt();
        System.out.print("Enter an integer, please: b = ");
        int b = scanner.nextInt();

        int c;
        c=a;
        System.out.println(String.format("Now a = %d", a=b));
        System.out.println(String.format("Now b = %d", b=c));

    }

}
