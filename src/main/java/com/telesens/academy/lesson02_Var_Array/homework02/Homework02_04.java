package com.telesens.academy.lesson02_Var_Array.homework02;

/*
4.
Реализовать программу ввода числа x с клавиатуры и вывода значения: x - 5%
*/

import java.util.Scanner;

public class Homework02_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number, please: x = ");
        double x = scanner.nextDouble();

        double res;

        res = x - x*0.05;
        System.out.println(String.format("x - 5 %% = %.2f", res));

    }
}


