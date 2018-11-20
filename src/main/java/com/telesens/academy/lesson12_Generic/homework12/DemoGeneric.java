package com.telesens.academy.lesson12_Generic.homework12;

public class DemoGeneric {

    public static void main(String[] args) {

        Integer[] array =  {1,2,3,4,5};

        GenArray <Integer> genArray = new GenArray <> (array);
        System.out.println(genArray);
        System.out.println(genArray.get(2));

        genArray.set(4,10);
        System.out.println(genArray.get(4));


    }
}
