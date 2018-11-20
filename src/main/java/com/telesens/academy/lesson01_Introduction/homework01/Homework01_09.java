package com.telesens.academy.lesson01_Introduction.homework01;

public class Homework01_09 {
    public static void main(String[] args) {

        int lengthArray = args.length; //Add verify args
        String preFix;
        String postFix;

//        System.out.println(args.length);

        switch (lengthArray) {
            case 1:
                preFix = args[0];
                postFix = "";
                break;
            case 2:
                preFix = args[0];
                postFix = args[1];
                break;
            default:
                preFix = "";
                postFix = "";
                break;
        }

        System.out.println(preFix + "Привет!" + postFix);
        System.out.println(preFix + "Это моя первая программа. Я уже пишу на Java." + postFix);
        System.out.println(preFix + "Программировать - это удовольствие." + postFix);
        System.out.println(preFix + "Моя цель - ..." + postFix);


    }
}
