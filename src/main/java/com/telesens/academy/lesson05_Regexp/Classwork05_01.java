package com.telesens.academy.lesson05_Regexp;


/*
  8)* Выделить тегом <strong> повторяющиеся слова.

        Примеры:
        Тhis is a test=> this is a test
        Тhis is is a test => this is <strong>is</strong> a test

        (\s+)(\w+)(\s+)\2

        or

        (\b\w+\b)(\s)\1
*/

public class Classwork05_01 {

    public static void main(String[] args) {

        String str = "Тhis is is a test";

        String regex = "(\\b\\w+\\b)(\\s)(\\1)";

        String result = str.replaceAll(regex, "$1$2<strong>$1</strong>");
        System.out.println(str);
        System.out.println(result);
    }



}
