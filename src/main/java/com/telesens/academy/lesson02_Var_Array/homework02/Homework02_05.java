package com.telesens.academy.lesson02_Var_Array.homework02;

/*
5.
Сила тяжести на Луне составляет около 17% земной.
Напишите программу, которая вычислила бы ваш вес на Луне.
*/

import java.util.Scanner;

public class Homework02_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your weight, please: ");
        System.out.println("Your weight on the moon = " + scanner.nextDouble()*0.17);


    }
}

