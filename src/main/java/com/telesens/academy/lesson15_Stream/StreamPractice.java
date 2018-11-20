package com.telesens.academy.lesson15_Stream;

import com.telesens.academy.automationpractice.model.EntityDress;
import com.telesens.academy.lesson11.CompareDresses;


import java.util.Arrays;

public class StreamPractice {
    public static void main(String[] args) {
        EntityDress[] array = CompareDresses.getExpectedDresses();

        Arrays.stream(array)
                .filter(s-> s.getColor().equals("Orange"))
                .reduce((StreamPractice::maxByPrice))
                .ifPresent(System.out::println);


        System.out.println("**************************");

        Double[] prices = Arrays.stream(array)
                .map(d -> d.getPrice())
                .sorted((n1, n2) -> n2.compareTo(n1))
                .peek(System.out::println)
                .toArray(Double []::new);
        System.out.println("Price Array: " + Arrays.toString(prices));
    }

    private static EntityDress maxByPrice (EntityDress e1, EntityDress e2) {
        if (e1.getPrice() > e2.getPrice())
        return  e1;
        else
            return e2;
    }
}


/*
 /home/billiscorp/Work/Telesens/QA-JA/Java-part-maven/src/main/java/com/telesens/academy/lesson13_Collections/Exercise_List_Stream.java
 доделать
реализовтьа черех стримы*/

