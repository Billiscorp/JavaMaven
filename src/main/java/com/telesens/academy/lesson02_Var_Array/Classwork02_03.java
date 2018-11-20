package com.telesens.academy.lesson02_Var_Array;


/*
3.
        Изменить тип переменные x, y, z и rеsult на double
        Задать значения: x=1.1,y= 3, z=5 соответственно.
        Вывести x, y и z на консоль.
        В переменную result записать результат вычисления z-y-x
        Вывести result на консоль.
*/




public class Classwork02_03 {
    public static void main(String[] args) {

        double x1 = 1.1, y1 = 3, z1 = 5;

        System.out.println("x = "+x1);
        System.out.println("y = "+y1);
        System.out.println("z = "+z1);

        double result1 = z1 - y1 - x1;

        System.out.println("Резултат z - y - x = " + result1);


    }
}
