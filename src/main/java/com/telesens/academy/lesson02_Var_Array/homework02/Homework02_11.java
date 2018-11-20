package com.telesens.academy.lesson02_Var_Array.homework02;

/*
11.
В переменной n хранится вещественное число с ненулевой дробной частью.
Создайте программу, округляющую число n до ближайшего целого и выводящую результат на экран.
*/

import java.util.Scanner;

public class Homework02_11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a fractional number, please: a = ");
        double a = scanner.nextDouble();

        double n = a - (int) a;

        if (n >= 0.5) {

            a += 1;

        } else a = (int) a;
        System.out.println(String.format("Rounding a = %d",(int)a));

    }

}
