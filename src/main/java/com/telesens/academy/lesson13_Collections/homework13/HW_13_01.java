package com.telesens.academy.lesson13_Collections.homework13;
/*
1) Дан массив имен: {"Peter", "Helen", "Andry", "Abdel", "Kate", "Veronica", "Leonid", "Alex", "max}
        a) Создать список List из элементов массива и вывести на экран
        b) Добавить 3 новых имени в список (Philip, Joseph, Leon) и вывести весь список на экран
        c) Удалить из списка все имена: Veronica, Leonid и вывести на экран
        d) Поменять имя Helen на Elizabet
        e) Отсортировать имена по алфавиту и вывести на экран
        f) Отсортировать имена в обратном порядке и вывести имена на экран
        g) Перевести все первые символы в верхний регистр
        h) Вывести все имена, начинающиеся на букву A
        i) Проверить, содержит ли список имя Andry
        j) Удалить из списка все имена кроме Kate и Helen
*/

import java.util.*;

public class HW_13_01 {

    public static void main(String[] args) {

        // TODO - new List for new exercise !!!!!!

        String [] arrayNames = {"Peter", "Helen", "Andry", "Abdel", "Kate", "Veronica", "Leonid", "Alex","max"};

        System.out.println("Исходный массив: ");
        System.out.println(Arrays.toString(arrayNames));

//        a) Создать список List из элементов массива и вывести на экран
        System.out.println();
        System.out.println("****************************************");
        System.out.println("Создать список List из элементов массива и вывести на экран");
        List<String> listNames = new ArrayList<>(Arrays.asList(arrayNames));
        System.out.println(listNames);

//        b) Добавить 3 новых имени в список (Philip, Joseph, Leon) и вывести весь список на экран
        System.out.println();
        System.out.println("****************************************");
        System.out.println("Добавить 3 новых имени в список (Philip, Joseph, Leon) и вывести весь список на экран");
        listNames.add("Philip");
        listNames.add("Joseph");
        listNames.add("Leon");
        System.out.println(listNames);

//        c) Удалить из списка все имена: Veronica, Leonid и вывести на экран
        System.out.println();
        System.out.println("****************************************");
        System.out.println("Удалить из списка все имена: Veronica, Leonid и вывести на экран");
        listNames.remove("Veronica");
        listNames.remove("Leonid");
        System.out.println(listNames);

//        d) Поменять имя Helen на Elizabet
        System.out.println();
        System.out.println("****************************************");
        System.out.println("Поменять имя Helen на Elizabet");
        Collections.replaceAll(listNames, "Helen", "Elizabet");
        System.out.println(listNames);

//       e) Отсортировать имена по алфавиту и вывести на экран
        System.out.println();
        System.out.println("****************************************");
        System.out.println("Отсортировать имена по алфавиту и вывести на экран");
        Collections.sort(listNames);
        System.out.println(listNames);

//        f) Отсортировать имена в обратном порядке и вывести имена на экран
        System.out.println();
        System.out.println("****************************************");
        System.out.println("Отсортировать имена в обратном порядке и вывести имена на экран");
        Collections.reverse(listNames);
        System.out.println(listNames);

        // TODO
//        g) Перевести все первые символы в верхний регистр
        System.out.println();
        System.out.println("****************************************");
        System.out.println("Перевести все первые символы в верхний регистр");
        System.out.println("TODO");

       // TODO
       //        h) Вывести все имена, начинающиеся на букву A
        System.out.println();
        System.out.println("****************************************");
        System.out.println("Вывести все имена, начинающиеся на букву A");
        System.out.println("TODO");

//        i) Проверить, содержит ли список имя Andry
        System.out.println();
        System.out.println("****************************************");
        System.out.println("Проверить, содержит ли список имя Andry");
        System.out.println(listNames.contains("Andry"));

//        j) Удалить из списка все имена кроме Kate и Helen Elizabet ???
        System.out.println();
        System.out.println("****************************************");
        System.out.println("Удалить из списка все имена кроме Kate и Helen");
        System.out.println(listNames);

        for (int  i = listNames.size()-1; i >= 0; i--){
            if (!listNames.get(i).equals("Kate") && !listNames.get(i).equals("Elizabet")) {
//                System.out.println(listNames.get(i));
                listNames.remove(i);
//                System.out.println(listNames);
            }
        }
        System.out.println(listNames);
//        Iterator<E> iterator ?????

//        System.out.println(listNames.removeIf(s -> !s.contains("Kate") && !s.contains("Helen"))); ????






    }
}
