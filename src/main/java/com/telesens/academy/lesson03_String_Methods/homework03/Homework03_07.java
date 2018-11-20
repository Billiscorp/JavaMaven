package com.telesens.academy.lesson03_String_Methods.homework03;

/*
    Реализовать программу, которая определяет, является ли строка палиндромом.
Палиндром - это строка, которая одинаково читается одинаково в обоих направлениях
(пример: "мадам" - палиндром, "адам" - не палиндром)

 */

import java.util.Scanner;

public class Homework03_07 {

    public static void main(String[] args) {

        String newString = inputString("string");
        System.out.println(String.format("You enter string: %s", newString));
//        checkPalindrome (newString);


    }

   /* private static void checkPalindrome(String newString) {

        if (!(newString.charAt(0) == a.charAt(4) && a.charAt(1) == a.charAt(3))) {
            System.out.println("Слово не палиндром");
        } else {
            System.out.println("Палиндром!!!");
    }*/






 /*    System.out.println("Введите слово:");
    Scanner sl = new Scanner(System.in);
    boolean flag = true;

        while (flag) {
        String a = sl.nextLine();
        System.out.println("Вы ввели:" + a);
        System.out.println("Длина слова:  " + a.length());

        if (a.length() != 5) {
            System.out.println("Вы ошиблись. Необходимо ввести слово из пяти букв!");
        } else {
            if (!(a.charAt(0) == a.charAt(4) && a.charAt(1) == a.charAt(3))) {
                System.out.println("Слово не палиндром");
            } else {
                System.out.println("Палиндром!!!");
                flag = false;
            }
        }
    }
}*/



    /*private static void replaceString(String newString) {

        int n = 0;

        String [] a = newString.split(" ");
        for (int i = 0; i < a.length; i++){
            if (a[i].contains(subString)){
                 n = n + 1;
                System.out.println(String.format("In your line there is a substring: \"%s\" ", subString));

            }
        }

        if (n > 0) {
            System.out.println(String.format("In your string the substring \"%s\" occurs \"%d\" times",subString, n));


        } else {
            System.out.println(String.format("Your string does not contain the substring: \"%s\"", subString));

        }

    }*/


    private static String inputString(String text) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(String.format("Enter a %s, please: ", text));
        return scanner.nextLine();
    }






}



