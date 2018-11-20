package com.telesens.academy.lesson02_Var_Array.homework02;

/*
12.
Вывести ромб заданной размерности. Пример для размера 3:
  1
 121
12321
 121
  1
*/

public class Homework02_12 {
    public static void main(String[] args) {

        Homework02_12 romb = new Homework02_12();
        romb.start(5);
    }


    String star = "*";
    String space = " ";

    public void string(int x, int spaces) {
        for (int i = 0; i < spaces; i++) {
            System.out.print(space);
        }
        for (int i = 1; i <= x; i++) {
            System.out.print(star);
        }
        System.out.println();
    }

    public void start(int x) {
        int spaces = (x - 1) / 2;

        for (int i = 1; i <= x; i += 2) {
            string(i, spaces);
            if (spaces != 0) spaces--;
        }
        for (int i = x - 2; i >= 0; i -= 2) {
            string(i, spaces + 1);
            spaces++;
        }
    }
}