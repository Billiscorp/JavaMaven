package com.telesens.academy.lesson15_Stream.homework15;

import com.telesens.academy.automationpractice.model.EntityDress;
import com.telesens.academy.lesson11.CompareDresses;

import java.util.*;
import java.util.stream.Collectors;

public class Exercise_List_Stream {

    public static void main(String[] args) {

        EntityDress[] array = CompareDresses.getExpectedDresses();

        System.out.println("конвертировать массив в List (Stream)");
        System.out.println("Array: ");
        System.out.println(Arrays.toString(array));
        System.out.println("List: ");
        List<EntityDress> list = Arrays.stream(array)
                .collect(Collectors.toList());
//                .forEach(System.out::println);
        System.out.println(list);
        System.out.println("***********************************");
        System.out.println();


        System.out.println("конвертировать List в массив (Stream)");
        List<EntityDress> list1;
        list1 = list;
        EntityDress[] arrayFromList = list1.stream()
                .peek(System.out::println)
                .toArray(EntityDress[]::new);
        System.out.println(Arrays.toString(arrayFromList));
        System.out.println("***********************************");
        System.out.println();



        System.out.println("конвертировать массив в Map в качестве ключа взять поле model (Stream)");
        System.out.println("Array to map: ");
        Map<String, EntityDress> mapFromArray = Arrays.stream(array)
                .collect(Collectors.toMap(p->p.getModel(), t->t));
        System.out.println(mapFromArray);
        System.out.println("***********************************");
        System.out.println();


        System.out.println("конвертировать отфильтровать List, оставив только позиции по заданному цвету (Stream)");
        System.out.println("Filter list by orange: ");
        List<EntityDress> list2;
        list2 = list;
        list2.stream()
                .filter(s-> s.getColor().equals("Orange"))
                .forEach(System.out::println);
        System.out.println("***********************************");
        System.out.println();



        System.out.println("конвертировать Map в List (Stream)");
        System.out.println("Map to List");
        System.out.println("Map: ");
        System.out.println(mapFromArray);
        List<EntityDress> entityDressList = mapFromArray.values().stream()
                .collect(Collectors.toList());
        System.out.println("List: ");
        System.out.println(entityDressList);
        System.out.println("***********************************");
        System.out.println();


        System.out.println("конвертировать List в Массив (массив содержит только String - значения поля model) (Stream)");
        System.out.println("List to Array (String model)");
        System.out.println("List: ");
        List<EntityDress> list3;
        list3 = list;
        System.out.println(list3);
        System.out.println("Array: ");
        String [] entityDressesModel = list3.stream()
                .map(d -> d.getModel())
                .peek(System.out::println)
                .toArray(String[]::new);
        System.out.println("Array entityDressesModel: " + Arrays.toString(entityDressesModel));




    }
}
