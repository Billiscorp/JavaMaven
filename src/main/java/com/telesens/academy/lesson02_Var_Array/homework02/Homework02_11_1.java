package com.telesens.academy.lesson02_Var_Array.homework02;

/*
11_1.
Проинициализировать одномерный массив произвольными целыми числами
	Вывести массив в виде:
		[3, 4, 9, 10, 34, 239, 8, 0, -3, 19, 17]
		a) используя цикл for
		b) используя цикл while
*/

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework02_11_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number (array size) , please: = ");
        int size = scanner.nextInt();

        int [] array = new int [size];

        Random rand = new Random(100);

        System.out.println(String.format("Array size[%d]. Method FOR:",size));
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10); // случайные значения от 0 до 10
        }
        System.out.println(Arrays.toString(array));

        System.out.println(String.format("Array size[%d]. Method WHILE:",size));
        int i = 0;
        while (i < array.length) {
            array[i] = rand.nextInt(10); // случайные значения от 0 до 10
            i++;
        }
        System.out.println(Arrays.toString(array));
        // как задать дипазон - чисел ???

    }

}




