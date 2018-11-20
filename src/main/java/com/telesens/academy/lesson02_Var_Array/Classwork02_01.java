package com.telesens.academy.lesson02_Var_Array;



/*
1.
        Создать новый проект.
        В функции main объявить три переменные x, y, z со значениями 1, 3, 5 соответственно.
        Вывести x, y и z на консоль.
        Объявить еще одну переменную result
        В переменную result записать результат вычисления z-y-x
        Вывести result на консоль.
*/


public class Classwork02_01 {
    public static void main(String[] args) {

        int x = 1, y = 3, z = 5;

        System.out.println("x = "+x);
        System.out.println("y = "+y);
        System.out.println("z = "+z);

        int result = z - y - x;

        System.out.println("Резултат z - y - x = "+result);

    }
}
