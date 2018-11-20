package com.telesens.academy.lesson01_Introduction.homework01;

public class Homework01_10 {
    public static void main (String[] args) {


        int qti = Integer.parseInt(args[1]); // Add vefiy


        for (int i = 0; i < qti; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(args[0]);
            }
            System.out.print("\n");
        }


        for (int i = 0; i < qti; i++) {
            for (int j = i; j < qti; j++) {
                System.out.print(args[0]);
            }
            System.out.print("\n");
        }

    }
}
