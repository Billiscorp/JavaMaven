package com.telesens.academy.lesson02_Var_Array;


/*
9.
Создать новый класс с методом main
Прочитать с консоли переменную целого типа n
Убедиться, что переменная n больше 0
Посчитать и вывести на консоль сумму ряда от 1 до n.
(1+2+3+..+n)
Решить с помощью цикла for и while
*/


import java.util.Scanner;

public class Classwork02_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number, please: n = ");
        int n = scanner.nextInt();

        int sum = 0, sum1 = 0;

        System.out.println(String.format("Sum number from 1 to n = %d : ", n));

        if (n > 0) {

            System.out.println("Method FOR.");
            for (int i = 1; i < n + 1; i++) {
                System.out.println(String.format("n = %d", i));
                sum = sum + i;
            }

            System.out.println(String.format("Sum = %d", sum));

            System.out.println("Method WHILE.");
            int i = 1;
            while (i < n + 1) {
                System.out.println(String.format("n = %d", i));
                sum1 = sum1 + i;
                i++;
            }
            System.out.println(String.format("Sum = %d", sum));
        } else {
            System.out.print("Incorrect data");
        }
    }
}