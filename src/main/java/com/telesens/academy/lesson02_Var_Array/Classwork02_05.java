package com.telesens.academy.lesson02_Var_Array;


/*
5.
        Объявить переменную целого типа digits и проинициализировать трехзначным значением
        (напр. int digits = 365)

        Извлечь с помощью арифметических операций в переменные d1, d2 и d3 цифры трехзначного числа digits
        (в нашем случае d1=3, d2=6, d3=5)
        Вывести d1, d2, d3 и digits на консоль.
*/


public class Classwork02_05 {
    public static void main(String[] args) {

        int digits = 365;

        int d1 = 0, d2 = 0, d3 = 0;

        d1 = digits / 100;  // 365 / 100 = 3
        d2 = (digits / 10) % 10; // 365 / 10 = 36    36 % 10 = 6
        d3 = digits % 10; // 365 %10 = 5


        System.out.println(String.format("d1 =  %d ", d1));
        System.out.println(String.format("d2 =  %d ", d2));
        System.out.println(String.format("d3 =  %d ", d3));
    }
}
