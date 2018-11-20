package com.telesens.academy.lesson03_String_Methods.homework03;

/*
Реализовать программу, которая:
        - в диалоговом режиме запрашивает размер массива
        - заполняет массив случайными числами (целые числа)
        - меняет порядок элементов массива
        - сортирует массив
        - выводит исходный массив
        - выводит перевернутый массив
        - выводит отсортированный массив
 */

import java.util.Arrays;
import java.util.Scanner;

public class Homework03_08 {
    public static void main(String[] args) {

        int arraySize = inputSize();
        System.out.println(String.format("Array size = %d",arraySize ));


        int [] arrayFill = fillArrayRandom (arraySize);
        printArray("Source array :", arrayFill );
        int [] arrayChenges = changesArray(arrayFill);
        printArray("Changed array :", arrayChenges);
        int [] arraySort = sortArray(arrayFill);
        printArray("Sorting array :", arraySort);

    }






    private static void printArray(String message, int [] array1) {


        System.out.println(String.format(message));
        for (int i = 0; i < array1.length; i++){
            System.out.println(String.format("%d = [%d]", i,array1[i] ));
        }
    }




    private static int [] sortArray(int [] array2) {

        Arrays.sort(array2);
        return array2;
    }





    private static int [] changesArray(int [] array3) {

        for (int i = 0; i < array3.length / 2; i++)
        {
            int tmp = array3[i];
            array3[i] = array3[array3.length - i - 1];
            array3[array3.length - i - 1] = tmp;
        }
        return array3;
    }





    private static int [] fillArrayRandom(int size) {

        int [] array1 = new int[size];
        if (size > 0) {

            for (int i = 0; i < size; i++){
                array1[i] = (int) ( Math.random() * size);

            }

        } else {
            System.out.print("Incorrect data");
        }

        return array1;

    }






    private static int inputSize() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size, please: size = ");
        return scanner.nextInt();
    }
}

