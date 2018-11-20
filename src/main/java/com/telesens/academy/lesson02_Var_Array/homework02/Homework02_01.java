package com.telesens.academy.lesson02_Var_Array.homework02;

/*
1.
Написать программу ввода с клавиатуры последовательно 3 чисел.
Вывести минимальное максимальное и средние значения
*/

import java.util.Scanner;

public class Homework02_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number, please: a = ");
        double a = scanner.nextDouble();
        System.out.print("Enter the number, please: b = ");
        double b = scanner.nextDouble();
        System.out.print("Enter the number, please: c = ");
        double c = scanner.nextDouble();

        double sum, min, max, average;

        //sum
        sum = a + b + c;
        System.out.println(String.format("Sum = %f", sum));

        // max
        if (a >= b && a >= c){
            min = a;
        System.out.println(String.format("Max is = %f", min));
        }
        else if (b >= c && b >= a) {
            min = b;
            System.out.println(String.format("Max is = %f", min));
        }
        else if (c >= b && c >= a) {
            min = c;
        System.out.println(String.format("Max is = %f", min));
        }


        //min
        if (a <= b && a <= c){
            min = a;
        System.out.println(String.format("Min is = %f", min));
        }
        else if (b <= c && b <= a) {
            min = b;
            System.out.println(String.format("Min is = %f", min));
        }
        else if (c <= b && c <= a) {
            min = c;
        System.out.println(String.format("Min is = %f", min));
        }


        //average
        average = sum/(double)3;
        System.out.println(String.format("Average is = %f", average));



    }
}


