package com.telesens.academy.lesson03_String_Methods.homework03;

/*
    Напишите программу, которая:
	- считывает строку
	- выводит исходную строку
	- выводит количество и список, которые заканчиваются буквами 'ED'

 */

import java.util.Scanner;

public class Homework03_02 {

    public static void main(String[] args) {

        String newString = inputString();
        System.out.println("You enter string: " + newString);
        qtiWord(newString);

    }



    private static void qtiWord(String newString) {

        int n = 0;

        String [] a = newString.split(" ");
        for (int i = 0; i < a.length; i++){
            if (a[i].endsWith("ED")){
                 n = n + 1;
                System.out.println("Words beginning with the letter \"ED\":" + a[i]);
            }
        }

        if (n > 0) {
            System.out.println(String.format("Your line has %d words beginning with the letter \"ED\": ", n));



        } else {
            System.out.println("Your line does not contain words beginning with \"ED\"");

        }

    }


    private static String inputString() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string, please: ");
        return scanner.nextLine();
    }






}



