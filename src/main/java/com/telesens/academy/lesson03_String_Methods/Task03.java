package com.telesens.academy.lesson03_String_Methods;

/*
    Напишите программу, которая:
	- считывает строку
	- считывает подстроку
	- выводит исходные строку и подстроку и выводит кол-во вхождений строки в подстроку


 */

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {

        String newString = inputString("string");
        System.out.println(String.format("You enter string: %s", newString));
        String subString = inputString("substring");
        System.out.println(String.format("You enter substring: %s", subString));

        containsSubString(newString, subString);

    }



    private static void containsSubString(String newString, String subString) {

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

    }


    private static String inputString(String text) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(String.format("Enter a %s, please: ", text));
        return scanner.nextLine();
    }






}



