package com.telesens.academy.lesson15_Stream.homework15;


import java.util.*;
import java.util.stream.Stream;


public class SubsciberDemo {

    public static void main(String[] args) {

        Data newSubsciber = new Data();

//        Сгенерировать массив 100 абонентов:
        System.out.println("***    Generate Subscibers    ***");
        System.out.println();
        Subscriber[] arraySubscibers =
                Stream
                        .generate(newSubsciber::nextSubscriber)
//                .generate(()->SubscriberDemo.nextSubscriber()) // можно так
//                .generate(()->{
//                    return SubscriberDemo.nextSubscriber();
//                }) // можно и так
                        .limit(100)
//                            .filter(SubscriberDemo.distinctBy(com.telesens.academy.lesson15_Stream.homework15.Oleg.Subscriber::getPhoneNumber))
                        .peek(System.out::println)
                        .toArray(Subscriber[]::new);
        System.out.println();
        System.out.println("***Finish***");
        System.out.println();



        System.out.println("Из массива:\n" +
                "                - исключить дубликаты\n" +
                "                - отсортировать по id,\n" +
                "                - сохранить в список (List)");
        Set<Subscriber> setSubscibers = new HashSet(Arrays.asList(arraySubscibers));
        List<Subscriber> listSubscibers = new ArrayList<>(setSubscibers);
                listSubscibers.stream()
                        .sorted((Comparator.comparing(Subscriber::getId)));
        System.out.println(listSubscibers);
        System.out.println();

//        Если ID генерируется реально рандомно (по тому алгоритму что есть - дубликатов НЕ БУДЕТ)


    }
}

