package com.telesens.academy.lesson02_Var_Array;


/*
11.
Создать новый класс с методом main (ArrayDemo)
Прочитать с консоли переменную целого типа size
Объявить массив размером size целого типа
Наполнить элементы массива последовательно значениями от 1 до size
Вывести массив на консоль в обратном порядке
*/


import java.util.Scanner;

public class Classwork02_11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number (array size) , please: = ");
        int size = scanner.nextInt();

        if (size > 0) {


            int [] array1 = new int [size];
            for (int i = 0; i < size; i++){
                array1[i] = i+1;
                System.out.println("i  = " + array1[i]);
            }

            System.out.println("Revers array :");
            for (int i = size-1; i >=0; i--){
//                array1[i] = i;
                System.out.println("i  = " + array1[i]);
            }


        } else {
            System.out.print("Incorrect data");
        }

    }
}