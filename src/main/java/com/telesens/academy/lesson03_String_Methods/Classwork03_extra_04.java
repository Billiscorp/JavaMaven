package com.telesens.academy.lesson03_String_Methods;

import java.util.Scanner;

public class Classwork03_extra_04 {

    public static void main(String[] args) {

        int max = inputNumber();
        System.out.print("Sum  = " + sum(max));
    }


    private static int sum(int max) {

            int sum = 0;
            for (int i = 1; i <= max; i++) {
                sum = sum + i;
           }
           return sum;
    }

    private static int inputNumber() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer, please: n = ");
        return scanner.nextInt(); // Add while for verifed correct data !!!!
    }
}



