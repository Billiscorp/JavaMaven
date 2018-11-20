package com.telesens.academy.lesson02_Var_Array.homework02;

/*
10.
Заполнить одномерный целочисленный массив значениями от 1 до 10 включительно.
	Одномерный массив вывести в строку в виде:
	[3, 4, 9, 10, 1, 2, 8, 10, 3, 1, 7]
*/

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework02_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number (array size) , please: = ");
        int size = scanner.nextInt();

        int [] array = new int [size];

        Random rand = new Random(100);
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10); // случайные значения от 0 до 10
        }
        System.out.print(Arrays.toString(array));
    }

}
