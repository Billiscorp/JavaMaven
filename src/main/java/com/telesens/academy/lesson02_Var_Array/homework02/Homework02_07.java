package com.telesens.academy.lesson02_Var_Array.homework02;

/*
7.
В переменных q и w хранятся два натуральных числа.
Создайте программу, выводящую на экран результат деления q на w с остатком.
Пример вывода программы (для случая, когда в q хранится 21, а в w хранится 8):
	21 / 8 = 2 и 5 в остатке
*/

import java.util.Scanner;

public class Homework02_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer, please: q = ");
        int q = scanner.nextInt();
        System.out.print("Enter an integer, please: w = ");
        int w = scanner.nextInt();

        int x = q / w;
        int y = q % w;
        System.out.println(String.format("q / w = %d and remainder of the division = %d", x,y));

    }

}
