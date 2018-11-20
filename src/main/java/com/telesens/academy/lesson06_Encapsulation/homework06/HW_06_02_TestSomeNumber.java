package com.telesens.academy.lesson06_Encapsulation.homework06;

/*
2) Создайте класс TestSomeNumber, в котором продемонстрируйте работу класса SomeNumber
		на нескольких тестовых данных [-10, -1, 0, 1, 15]
	a) проверить работу конструкторов
	b) проверить работу метода setN();
	c) проверить работу метода isPositive();

*/

public class HW_06_02_TestSomeNumber {

    public static void main(String[] args) {


        int [] testArray = {-10, -1, 0, 1, 15};


        for (int i:testArray) {
            HW_06_01_SomeNumber someNumber = new HW_06_01_SomeNumber(i);
            someNumber.print();
            System.out.println(someNumber.isPositive());
        }



        System.out.println("*********************");
            for (int i:testArray) {
            HW_06_01_SomeNumber someNumber1 = new HW_06_01_SomeNumber();
            someNumber1.setN(i);
            System.out.println(someNumber1.getN());
            someNumber1.print();
            System.out.println(someNumber1.isPositive());
        }





    }

   
    
    

}
