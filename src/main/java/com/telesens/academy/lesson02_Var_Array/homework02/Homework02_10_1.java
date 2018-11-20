package com.telesens.academy.lesson02_Var_Array.homework02;

/*
10.
В переменной n хранится натуральное число произвольной разрядности.
Создайте программу, вычисляющую и выводящую на экран кол-во цифр и сумму цифр числа n.
*/

import java.util.Scanner;


public class Homework02_10_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an natural number, please: n = ");
        int n = scanner.nextInt();

        int b=0;
        int x;
        int sum=0;
        while(0!=(int)n)
        {

            x= (int)n%10;
            n= (int)n/10;
            b++;
            sum=sum+x;

        }
        System.out.println(String.format("The quantity of digits in the number = %d",b));

        System.out.println(String.format("Sum of digits of a = %d",sum));


    }

}
