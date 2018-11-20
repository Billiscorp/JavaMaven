package com.telesens.academy.lesson03_String_Methods;

/*
2.
Имеем исходную строку:
String testData = "petrov,Ivanov ,KiRill, Helen ";
Разбить по запятой и получить массив имен:
String[] rawNames= {"petrov", "Ivanov ", "KiRill", " Helen
Вывести rawNames на консоль
Создать массив formattedNames размер которого равен исходномy
Пройти циклом исходный массив и поправить имена:
Имя не должно содержать пробелов в начале и в конце
Имя начинается с большой буквы
Все символы, кроме первого в нижнем регистре
Сохранить исправленные имена в formattedNames
Вывести formattedNames на консоль
Исключить из массива formattedNames, имена начинающиеся на ‘K’ и склеить в одну строку filteredData
Вывести filteredData на консоль:
=> "Petrov,Kirill,Helen"
*/


import java.util.Arrays;

public class Classwork03_02 {
    public static void main(String[] args) {

        String testData = "petrov,Ivanov ,KiRill,    Helen    , IvaN";

        String[] rawNames =  splitDataToArray(testData);
        printArray(rawNames);
        String[] formattedNames = formatNames(rawNames);
        printArray(formattedNames);
        String filteredData = filterByFirstSymbol(formattedNames, 'K');
        System.out.println(filteredData);
    }

    private static String filterByFirstSymbol(String[] formattedNames, char symb) {
        StringBuilder sb = new StringBuilder();
        for (String name : formattedNames) {
            if (name.charAt(0) != symb)
                sb.append(name + " ");
        }

        return sb.toString();
    }

    private static String[] formatNames(String[] rawNames) {
        String[] formattedNames = new String[rawNames.length];

        for (int i = 0; i < rawNames.length; i++) {
            formattedNames[i] = formatName(rawNames[i]);
        }
        return formattedNames;
    }

    //    1 Имя не должно содержать пробелов в начале и в конце
//    2 Имя начинается с большой буквы
//    3 Все символы, кроме первого в нижнем регистре
    private static String formatName(String rawName) {
        // 1
        String nameWithoutSpace = rawName.trim();
        String lastPart=nameWithoutSpace.substring(1).toLowerCase();
        String firstSymb=nameWithoutSpace.substring(0, 1).toUpperCase();
        return firstSymb+lastPart;
    }

    private static void printArray(String[] rawNames) {
        // 1 попытка
//        System.out.println(rawNames.toString());
        // 2
//        for(int i = 0; i < rawNames.length; i++)
//            System.out.println(rawNames[i]);

        // 3
//        System.out.println("*******");
//        for (String element : rawNames) {
//            System.out.println(element);
//        }

        // 4
        System.out.println("*******");
        System.out.println(Arrays.toString(rawNames));
    }

    private static String[] splitDataToArray(String testData) {
        String[] words = testData.split(",");
        return words;
    }




}
