package com.telesens.academy.lesson06_Encapsulation.homework06;

/*
3а) Класс Currency для работы с денежными суммами.
        - Класс должен быть представлен двумя private полями:
        double value; для хранения значания суммы
        String name; для хранения названия валюты ("грн", "руб", "$")

        Реализовать 2 конструктора:
        - без параметров
        - и с двумя параметрами, которые принимает (double value, String name);
        - конструктор копирования: (Currency currency)

        - Реализовать метод отображения суммы на экран print();
        Напр. в виде: 154.65руб // отображать не более 2 знаков после запятой

        - Реализовать операцию сравнения:
        boolean isEqual(Currency currency); // вернет true, если и значение и строка - совпадают

        - Реализовать методы:
        void add(double value, String name); // метод сложения
        (если name отличается от текущего поля 'name', то сложение не производить,
        а вывести сообщение об ошибке ("Error: currency names are differ 'грн' - 'руб')
        void add(Currency currency); // метод сложения

        void substract(double value, String name); // метод вычитания ...
        void substract(Currency currency);

        void divide(double factor); // деление суммы на число
        void multiply(double factor); // умножение суммы на число
*/

public class HW_06_03a_Currency {

    private double value; // для хранения значания суммы
    private String name;  // для хранения названия валюты ("грн", "руб", "$")

    // конструктор без параметров
    public HW_06_03a_Currency() {
    }

    // конструктор c параметрами
    public HW_06_03a_Currency(double value, String name) {
        this.value = value;
        this.name = name;
    }


    public double getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*
//    конструктор копирования: (Currency currency)
    public HW_06_03a_Currency(HW_06_03a_Currency currency) {
        this(currency.getValue(), currency.getName());
    }*/

    //    конструктор копирования: (Currency currency)
    public HW_06_03a_Currency(HW_06_03a_Currency currency) {
        this.value = currency.value;
        this.name = currency.name;
    }

    /*метод отображения суммы на экран print();
    Напр. в виде: 154.65руб // отображать не более 2 знаков после запятой */
    public void print() {
        System.out.println(String.format("%.2f %s\n",value,name));
    }

    /*операция сравнения:
    boolean isEqual(Currency currency);
    вернет true, если и значение и строка - совпадают*/
    public boolean isEqual(HW_06_03a_Currency currency) {

        return false;
    }

}
