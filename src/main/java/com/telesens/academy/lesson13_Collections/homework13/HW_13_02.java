package com.telesens.academy.lesson13_Collections.homework13;

/*
2) List
        a) создать список целых чисел
        b) наполнить список случайными целыми числами от 1 до 100 (размер списка 20 элементов)
        c) вывести список на экран
        d) вывести минимальное, максимально значения
        e) вывести сумму чисел на экран
        f) найти наиболее часто встречающееся число, вывести это число и кол-во повторений на экран
        (если чисел несколько с одинаковой частотой повторений, то вывести минимальное из них)
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HW_13_02 {
    public static void main(String[] args) {

//        a) создать список целых чисел
        System.out.println("создать список целых чисел");
        List<Integer> integersList = new ArrayList<>();
        System.out.println(integersList);
        System.out.println("****************************************");
        System.out.println();

//        b) наполнить список случайными целыми числами от 1 до 100 (размер списка 20 элементов)
//        c) вывести список на экран
        System.out.println("наполнить список случайными целыми числами от 1 до 100 (размер списка 20 элементов)");
        System.out.println("вывести список на экран");
        for (int i = 0; i < 20; i++){
            integersList.add((int)(Math.random()*100));
        }
        System.out.println(integersList);
        System.out.println("****************************************");
        System.out.println();

//        d) вывести минимальное, максимально значения
        System.out.println("вывести минимальное, максимально значения");
        Collections.sort(integersList);
        System.out.println("минимальное значения = " + integersList.get(0));
        System.out.println("максимально значения = " + integersList.get(integersList.size()-1));
        System.out.println("****************************************");
        System.out.println();

//        e) вывести сумму чисел на экран
        System.out.println("вывести сумму чисел на экран");
        int sum = 0;
        for (int i : integersList) {
            sum = sum + i;
        }
        System.out.println(sum);
        System.out.println("****************************************");
        System.out.println();


        //TODO
  /*      f) найти наиболее часто встречающееся число, вывести это число и кол-во повторений на экран
                (если чисел несколько с одинаковой частотой повторений, то вывести минимальное из них)*/


    }
}
