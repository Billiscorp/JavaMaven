package com.telesens.academy.lesson02_Var_Array.homework02;

/*
13.
Нарисовать треугольник заданной размерности. Пример для размера 6:
        *
        **
        ***
        ****
        *****
        ******

*/

import java.util.Scanner;

public class Homework02_13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an natural number, please: n = ");
        int n = scanner.nextInt();
        System.out.print("Enter a character, please: m = ");
        String m = scanner.next();


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(m);
            }
            System.out.print("\n");
        }


      /*  for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(m);
            }
            System.out.print("\n");
        }*/

    }



}
