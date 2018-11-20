package com.telesens.academy.lesson14_lambda.lambda;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaDemo {
    public static void main(String[] args) {
        String str = "Hello World";
        String res = doSomethingWithString(str, s->s.toUpperCase());
        String res2 = doSomethingWithString(str, String::toLowerCase);
        System.out.println(res);
        System.out.println(res2);



       /* 1) 	Составьте лямбда-выражение, которое возвращает значение true, если
        число принадлежит к диапазону чисел 10-20, включая граничные значения*/
//        boolean isInRange = checkNumber(9, (Integer n) -> {if (n >= 10 && n <=20) return true; else return false;});
        int num = 9;
        int startRange = 10;
        int endRange = 20;
        System.out.println("------------------------------------------------");
        boolean isInRange = checkNumber(num, (Integer n) -> n >= startRange && n <= endRange);
        System.out.println(String.format("Number %d is range (%d to %d) = %b", num, startRange, endRange,isInRange ));





//        LambdaDemo lambdaDemo = new LambdaDemo();
//        String resNext = lambdaDemo.doSomethingWithStringNoStatic(str);


/*        4) Заданную строку
        - разбить на слова
        - отсортировать слова по алфавиту не учитывая регистр первой буквы
        - отсортировать слова по длине
        - отсортировать слова по последней букв
                     */
        System.out.println("------------------------------------------------");
        System.out.println("Исходная строка: ");
        String newStr = "eeeeeeeeeeeeeeeeee qqq wwww eeeee rrrrrr ttttttt yyyyyyyyyy";
        String [] arrayStrs = newStr.split(" ");
        System.out.println("String to Array: ");
        System.out.println(Arrays.toString(arrayStrs));
        List<String> list = new ArrayList<>(Arrays.asList(arrayStrs));
        System.out.println("Array to List: ");
        System.out.println(list);

       /* System.out.println("List - alphabetical sorting");
        System.out.println(Collections.sort(list));*/

       list.sort(Comparator.comparingInt(String::length));
        System.out.println("Sort List by length");
        System.out.println(list);


/*
        5) Создайте лямбда-выражение, которое удаляет все пробелы из заданной строки и возвращает результат.
                Продемонстрируйте работу лямбда-выражения.
*/
    /*    String str5 = "М а м а - м ы л а - р а м у";
        str5*/


/*
        2)	Создайте блочное лямбда-выражение для вычисления факториала целого числа.
                Продемонстрируйте его использование.
*/

        System.out.println("------------------------------------------------");
        int numFact = 3;

        NumericFunc factorial = (n) ->  {
            int result = 1;

            for(int i=1; i <= n; i++)
                result = i * result;

            return result;
        };

        System.out.println("The factoral of 3 is " + factorial.func(3));


    }





    private static String doSomethingWithString(String str, Function<String, String> operation) {
        return operation.apply(str);
    }

    private static boolean checkNumber(int number, Predicate<Integer> checker) {
        return checker.test(number);

    }

    private String doSomethingWithStringNoStatic(String str) {
        return null;
    }
}

interface NumericFunc {
    int func(int n);
}
