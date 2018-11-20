package com.telesens.academy.lesson02_Var_Array.homework02;

/*
16.
Палиндром - число, одинаково читающееся в обоих направлениях, напр. 5123215.
	Наибольший палиндром, который может быть получен произведением 2-ух двузначных чисел является:
		9009 = 91*99

	a) Реализовать алгоритм, который находит наибольший палиндром, являющийся произведением 2-ух трехзначных чисел.
	b) Обобщить алгоритм, который может находить наибольший палиндром, являющийся произведением двух n-значных чисел.

*/

import java.util.Scanner;

public class Homework02_16 {
    public static void main(String[] args) {

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


      /*  for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(m);
            }
            System.out.print("\n");
        }*/

    }



}
