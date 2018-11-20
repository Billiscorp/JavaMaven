package com.telesens.academy.lesson02_Var_Array;


/*
7.
Создать новый класс с методом main
Прочитать с консоли переменную целого типа n
Если переменная четная вывести на консоль “even”, если не четная “odd“
*/


import java.util.Scanner;

public class Classwork02_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number, please: n = ");
        int n = scanner.nextInt();

        if (n > 0){
            if (n %2 > 0) {
                System.out.println(String.format("n = %d is odd ", n)); // если не четная
            } else {
                System.out.println(String.format("n = %d is even ", n)); // если четная
            }
        } else {
            System.out.println("Incorrect data");
        }


        /*int res = n % 2;
        switch (res) {
            case 0:
                System.out.println("Even");
                break;
            case 1:
                System.out.println("Odd");
                break;
        }*/


    }
}
