package com.telesens.academy.lesson02_Var_Array.homework02;

/*
15.
Нарисовать квадрат заданной размерности. Пример для размера 4:
****
*  *
*  *
****

*/

import java.util.Scanner;

public class Homework02_15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сторону - а");
        int a = sc.nextInt();
        System.out.println("Введите сторону - b");
        int b = sc.nextInt();

        String [][] sqr = new String[a][b];
        for (int i = 0; i < a; i++){
            for (int j = 0; j < b ; j++){
                sqr[i][j] = "*";
            }
        }
        for (int i = 1; i < a-1; i++){
            for (int j = 1; j < b-1 ; j++){
                sqr[i][j] = " ";
            }
        }
        for (int i = 0; i < a; i++){
            for (int j = 0; j < b ; j++){
                System.out.print(sqr[i][j]);
            }
            System.out.println();
        }
    }

     /*


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an natural number, please: n = ");
        int n = scanner.nextInt();
        System.out.print("Enter a character, please: m = ");
        String m = scanner.next();


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                for (int z=0; z<n-1; z++) {
                System.out.print(" ");}
                System.out.print(m);
            }
            System.out.print("\n");
        }


      *//*  for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(m);
            }
            System.out.print("\n");
        }*//*

    }*/



}
