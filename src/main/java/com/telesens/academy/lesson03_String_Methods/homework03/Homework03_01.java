package com.telesens.academy.lesson03_String_Methods.homework03;

/*
    Напишите программу, которая:
        - считывает строку
        - выводит исходную строку
        - выводит количество и список слов, которые начинаются на букву 'd'

 */

import java.util.Scanner;

public class Homework03_01 {

    public static void main(String[] args) {

        String newString = inputString();
        System.out.println("You enter string: " + newString);
        qtiWord(newString);

    }



    private static void qtiWord(String newString) {

        int n = 0;

        String [] a = newString.split(" ");
        for (int i = 0; i < a.length; i++){
            if (a[i].startsWith("d")){
                 n = n + 1;
                System.out.println("Words beginning with the letter \"d\":" + a[i]);
            }
        }

        if (n > 0) {
            System.out.println(String.format("Your line has %d words beginning with the letter \"d\": ", n));


        } else {
            System.out.println("Your line does not contain words beginning with \"d\"");

        }

    }


    private static String inputString() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string, please: ");
        return scanner.nextLine();
    }






}



