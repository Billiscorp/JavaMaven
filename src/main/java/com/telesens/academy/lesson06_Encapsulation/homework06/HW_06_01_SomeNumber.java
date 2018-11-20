package com.telesens.academy.lesson06_Encapsulation.homework06;

/*
1) Предположим, имеется следующий класс.
class SomeNumber {
    private int n; // единственное поле класса
    // ...
}

    a) Реализуйте конструктор без параметров (по умолчанию инициализируем 0)
	b) Конструктор, с одним параметром (int n)
	c) Метод int getN();
	d) Метод int setN();
	e) Метод print();
			который выводит строку, напр: "Число: 5"
	f) Метод boolean isPositive();
	которые возвращает true, если число положительное и false, если число отрицательное

*/

public class HW_06_01_SomeNumber {

    private int n;


    // a) Реализуйте конструктор без параметров (по умолчанию инициализируем 0)
    public HW_06_01_SomeNumber() {
    }

    // b) Конструктор, с одним параметром (int n)
    public HW_06_01_SomeNumber(int n) {
        this.n = n;
    }

    // c) Метод int getN();
    public int getN() {
        return n;
    }

    // d) Метод int setN();
    public void setN(int n) {
        this.n = n;
    }

    // e) Метод print(); который выводит строку, напр: "Число: 5"
    public void print () {
        System.out.println(String.format("Число: %d",n));
    }

    /*f) Метод boolean isPositive();
    которые возвращает true, если число положительное и false, если число отрицательное*/
    public boolean isPositive() {
        boolean res;

        if (n < 0) {
            res = false;
        } else {
            res = true;
        }

        return res;

    }
}

// TODO
// a) Реализуйте конструктор без параметров (по умолчанию инициализируем 0).
// что имели ввиду "по умолчанию инициализируем 0"
