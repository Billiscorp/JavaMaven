package com.telesens.academy.lesson02_Var_Array;


/*
6.
Создать новый класс с методом main
Прочитать с консоли три переменные целого типа n1, n2 и n3
Вычислить сумму в переменную sum
Вывести n1, n2, n3 и sum на консоль.
*/


import java.util.Scanner;

public class Classwork02_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number, please: n1 = ");
        int n1 = scanner.nextInt();
        System.out.print("Enter the number, please: n2 = ");
        int n2 = scanner.nextInt();
        System.out.print("Enter the number, please: n3 = ");
        int n3 = scanner.nextInt();

        int sum = n1 + n2 +n3;

        System.out.println(String.format("n1 =  %d ", n1));
        System.out.println(String.format("n2 =  %d ", n2));
        System.out.println(String.format("n3 =  %d ", n3));
        System.out.println(String.format("Sum = n1 + n2 + n3 =  %d ", sum));
    }
}
