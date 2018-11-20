package com.telesens.academy.lesson02_Var_Array;


/*
12.
Ввести с консоли целое число от 0 до 10
Вывести на консоль текстовое представления числа: (“zero”, “one”, “two”, ...)
*/


import java.util.Scanner;

public class Classwork02_12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integer number (from 0 to 10), please: = ");
        int n = scanner.nextInt();
        String res = null;

        switch(n) {
            case 0:
                res = "zero";
                break;
            case 1:
                res = "one";
                break;
            case 2:
                res = "two";
                break;
            case 3:
                res = "three";
                break;
            case 4:
                res = "four";
                break;
            case 5:
                res = "five";
                break;
            case 6:
                res = "six";
                break;
            case 7:
                res = "seven";
                break;
            case 8:
                res = "eight";
                break;
            case 9:
                res = "nine";
                break;
            case 10:
                res = "ten";
                break;
            default:
                System.out.println("Incorrect data");
                break;
        }
        System.out.println(String.format("You enter %d : %s ", n, res));


    }
}