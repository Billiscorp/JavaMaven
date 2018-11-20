package com.telesens.academy.lesson02_Var_Array;


/*
8.
Вывести на консоль нечетные числа от 1 до 9 включительно
циклом for и циклом while
*/


public class Classwork02_08 {
    public static void main(String[] args) {

        int res;

        System.out.println("odd number from 1 to 9. Method FOR");

        for (int i = 1; i < 10; i++) {
            res = i % 2;
            if (res > 0) {
                System.out.println(String.format("n = %d is odd ", i)); // если не четная
            }
        }

        System.out.println("odd number from 1 to 9. Method WHILE");

        int i = 1;
        while (i < 10) {
            res = i % 2;
            if (res > 0) {
                System.out.println(String.format("n = %d is odd ", i)); // если не четная
            }
            i++;
        }
    }
}
