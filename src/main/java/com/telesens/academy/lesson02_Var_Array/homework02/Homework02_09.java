package com.telesens.academy.lesson02_Var_Array.homework02;


/*
9.
В переменной n хранится натуральное трёхзначное число.
Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.
*/

import java.util.Scanner;

public class Homework02_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an natural 3-digit number, please: n = ");
        int n = scanner.nextInt();

        if (n<1000) {
            int x = n / 100;
            int y = n % 10;
            int z = n / 10;
            int a = z % 10;
            int sum = x + y + a;

            System.out.println(String.format("Sum of digits of a = %d",sum));
        } else {
            System.out.print("Invalid number of digits !!!");
        }


    }

}
