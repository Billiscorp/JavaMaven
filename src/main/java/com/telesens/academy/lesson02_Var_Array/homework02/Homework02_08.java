package com.telesens.academy.lesson02_Var_Array.homework02;

/*
8.
В переменной n хранится натуральное двузначное число.
Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.
(Натуральными называются целые положительные числа: 0, 1, 2, 3,...)
*/

import java.util.Scanner;

public class Homework02_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an natural 2-digit number, please: n = ");
        int n = scanner.nextInt();

        if (n<100) {
            int x = n / 10;
            int y = n % 10;
            int sum = x + y;

            System.out.println(String.format("Sum of digits of a = %d",sum));

        } else {
            System.out.print("Invalid number of digits !!!");
        }



    }

}


