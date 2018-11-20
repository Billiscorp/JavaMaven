package com.telesens.academy.lesson02_Var_Array;

import java.util.Scanner;

public class ScanerDemo {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input n1 = ");
            int n1 = scanner.nextInt();
            System.out.print("Input n2 = ");
            int n2 = scanner.nextInt();
            System.out.print("Input n3 = ");
            int n3 = scanner.nextInt();

            int sum = n1+n2+n3;
            System.out.println(String.format("Sum = 2%d", sum));
        }
}
