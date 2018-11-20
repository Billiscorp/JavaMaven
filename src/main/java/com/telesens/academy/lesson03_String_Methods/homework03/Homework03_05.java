package com.telesens.academy.lesson03_String_Methods.homework03;

/*
    Реализовать программу, которая:
	- считывает строку
	- меняет местами порядок символов (напр. "abcd" => "dcba")
	- выводит исходную строку
	- выводит перевернутую строку

 */

import java.util.Scanner;

public class Homework03_05 {

    public static void main(String[] args) {

        String newString = inputString("string");
        System.out.println(String.format("You enter string: %s", newString));


    }



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



