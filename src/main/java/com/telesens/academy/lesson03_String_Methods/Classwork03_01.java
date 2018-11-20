package com.telesens.academy.lesson03_String_Methods;

/*
1.
        Создать новый проект/класс.
        Создать метод createArrayDialog, который в диалоговом режиме запрашивает размер массива, все его элементы и возвращает созданный числовой массив.
        Создать метод sum, который вычисляет сумму элементов массива.
        Создать метод max, который определяет максимальный элемент.
        Создать метод countEven, который вычисляет сумму четных элементов массива.
        Создать метод printArray, который выводит массив на консоль.
        Создать метод printReport, который принимает в качестве аргументов размер массива, сумму, макс, кол-во четных элементов и выводит отчет на консоль:
        - Размер: 3
        - Сумма: 18
        - Максимальный: 10
        - Кол-во четных: 2
        Продемонстрировать работу программы (в методe main не должно быть другого кода, кроме вызовов созданных методов)
*/


import java.util.Arrays;
import java.util.Scanner;

public class Classwork03_01 {
    public static void main(String[] args) {

        int[] arrayNumbers = createArrayDialog();
        System.out.println(Arrays.toString(arrayNumbers));

        int sumAllElem = sum(arrayNumbers);
        System.out.println(String.format("Sum of array elements = %d", sumAllElem));

        int maxArrayElem = max(arrayNumbers);
        System.out.println(String.format("Maximum array element = %d", maxArrayElem));

        int sumEven = sumtEvenElem(arrayNumbers);
        System.out.println(String.format("The sum of the even elements of the array = %d", sumEven));

        int countEvenElem = countEven(arrayNumbers);
        System.out.println(String.format("The number of even elements of the array = %d", countEvenElem));

        printArray(arrayNumbers);

        printReport(arrayNumbers.length, sumAllElem, maxArrayElem, countEvenElem);


    }


    // Создать метод createArrayDialog, который в диалоговом режиме запрашивает размер массива, все его элементы и возвращает созданный числовой массив.
    private static int[] createArrayDialog() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number (array size), please: size = ");
        int size = scanner.nextInt();
        int[] newArray = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println(String.format("Enter the %d-st element of the array (integer), please:", i + 1));
            int elem = scanner.nextInt();
            newArray[i] = elem;


        }


        return newArray;
    }

    // Создать метод sum, который вычисляет сумму элементов массива.
    private static int sum(int[] arrayForData) {

        int sumElem = 0;
        for (int i = 0; i < arrayForData.length; i++) {
            sumElem = sumElem + arrayForData[i];
        }

        return sumElem;
    }

    // Создать метод max, который определяет максимальный элемент.

    private static int max(int[] arrayForData) {


        int maxElem = arrayForData[0];


        for (int i = 0; i < arrayForData.length; i++) {
            if (arrayForData[i] > maxElem)
                maxElem = arrayForData[i];
        }
        return maxElem;
    }


    // Создать метод countEven, который вычисляет сумму четных элементов массива.

    private static int sumtEvenElem(int[] arrayForData) {


        int sumEven = 0;


        for (int i = 0; i < arrayForData.length; i++) {

            int verEven = arrayForData[i] % 2;
            if (verEven <= 0)
                sumEven = sumEven + arrayForData[i];
        }
        return sumEven;
    }


    // Создать метод countEven, который вычисляет кол-во четных элементов массива.

    private static int countEven(int[] arrayForData) {


        int countEvenElem = 0;


        for (int i = 0; i < arrayForData.length; i++) {

            int verEven = arrayForData[i] % 2;
            if (verEven <= 0)
                countEvenElem = countEvenElem + 1;
        }
        return countEvenElem;
    }

    // Создать метод printArray, который выводит массив на консоль.

    private static void printArray(int[] arrayForData) {

        System.out.println(Arrays.toString(arrayForData));

    }


    // Создать метод printReport, который принимает в качестве аргументов размер массива, сумму, макс, кол-во четных элементов и выводит отчет на консоль:
    //        - Размер: 3
    //        - Сумма: 18
    //        - Максимальный: 10
    //        - Кол-во четных: 2

    private static void printReport(int size, int sum, int max, int countEven) {

        System.out.println(String.format(" - Размер: %d", size));
        System.out.println(String.format(" - Сумма: %d", sum));
        System.out.println(String.format(" - Максимальный: %d", max));
        System.out.println(String.format(" - Кол-во четных: %d", countEven));

    }

}
