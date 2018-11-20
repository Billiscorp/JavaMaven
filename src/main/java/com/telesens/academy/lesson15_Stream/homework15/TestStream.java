package com.telesens.academy.lesson15_Stream.homework15;

import java.util.*;
import java.util.stream.Collectors;

public class TestStream {

    public static void main(String[] args) {

            // For test
            System.out.println("***    Generate Subscibers   TEST !!!!! ***");
            System.out.println();
            Long id;
            String firstName;
            String lastName;
            int age;
            String phoneNumber;


            Subscriber[] tesrSubscibers  = new Subscriber [10];

            tesrSubscibers[0] = new Subscriber (1L,firstName="Вася", lastName="Половик", age=21, phoneNumber="9994068735"); // id
            tesrSubscibers[1] = new Subscriber (1L,firstName="Вася", lastName="Половик", age=21, phoneNumber="9994068735");

            tesrSubscibers[2] = new Subscriber (2L,firstName="Паша", lastName="Половик", age=31, phoneNumber="9993068735"); // firstName
            tesrSubscibers[3] = new Subscriber (2L,firstName="Паша", lastName="Половик", age=31, phoneNumber="9993068735");

            tesrSubscibers[4] = new Subscriber (3L,firstName="Вася", lastName="Михайленко", age=25, phoneNumber="9991068735"); //lastName
            tesrSubscibers[5] = new Subscriber (3L,firstName="Вася", lastName="Михайленко", age=25, phoneNumber="9991068735");

            tesrSubscibers[6] = new Subscriber (4L,firstName="Вася", lastName="Половик", age=40, phoneNumber="9992068735"); //age
            tesrSubscibers[7] = new Subscriber (4L,firstName="Вася", lastName="Половик", age=40, phoneNumber="9992068735");

            tesrSubscibers[8] = new Subscriber (5L,firstName="Вася", lastName="Половик", age=48, phoneNumber="9997929800"); //phoneNumber
            tesrSubscibers[9] = new Subscriber (5L,firstName="Вася", lastName="Половик", age=48, phoneNumber="9997929800");

            Arrays.stream(tesrSubscibers).forEach(System.out::println);

            System.out.println();
            System.out.println("***Finish***");
            System.out.println();


            System.out.println("3)  Из массива:\n" +
                    "                - исключить дубликаты\n" +
                    "                - отсортировать по id,\n" +
                    "                - сохранить в список (List)");

            List listSub3 = new ArrayList<>(Arrays.asList(tesrSubscibers)).stream()
                    .distinct()                                                 // исключить дубликаты
                    .sorted((Comparator.comparing(Subscriber::getId)))          // отсортировать по id
                    .peek(System.out::println)
                    .collect(Collectors.toList());                              // сохранить в список (List)
            System.out.println();


            System.out.println("4) Из списка абонентов:\n" +
                    "\t- отсортировать по телефонному номеру\n" +
                    "\t- отфильтровать по возрасту от 20 до 30\n" +
                    "\t- перевести первый символ имени и фамилии в верхний регистр\n" + // в нижний
                    "\t- перевести все символы кроме первого в нижний регистр\n" +      // в верхний
                    "\t- вывести на консоль");


            List listSub4 = new ArrayList<>(Arrays.asList(tesrSubscibers)).stream()
                    .sorted(Comparator.comparing(Subscriber::getPhoneNumber))   // отсортировать по телефонному номеру
                    .filter(a->a.getAge()>=20 && a.getAge()<=30)                // отфильтровать по возрасту от 20 до 30

   /*                 // 1 способ
                    // перевести первый символ имени и фамилии в верхний регистр\n" + // в нижний
                    .peek(f-> f.setFirstName(f.getFirstName()
                            .replace
                                    (f.getFirstName().substring(0, 1),
                                            f.getFirstName().substring(0, 1).toLowerCase())))
                    .peek(f-> f.setLastName(f.getLastName()
                            .replace
                                    (f.getLastName().substring(0, 1),
                                            f.getLastName().substring(0, 1).toLowerCase())))
                    // перевести все символы кроме первого в нижний регистр\n" +      // в верхний
                    .peek(f-> f.setFirstName(f.getFirstName()
                            .replace
                                    (f.getFirstName().substring(1),
                                            f.getFirstName().substring(1).toUpperCase())))
                    .peek(f-> f.setLastName(f.getLastName()
                            .replace
                                    (f.getLastName().substring(1),
                                            f.getLastName().substring(1).toUpperCase())))*/


                    // 2 способ
                    // перевести первый символ имени и фамилии в верхний регистр\n" + // в нижний
                    .peek(f-> f.setFirstName(replaceFirstChar(f.getFirstName())))
                    .peek(f-> f.setLastName(replaceFirstChar(f.getLastName())))
                    // перевести все символы кроме первого в нижний регистр\n" +      // в верхний
                    .peek(f-> f.setFirstName(replaceOtherChar(f.getFirstName())))
                    .peek(f-> f.setLastName(replaceOtherChar(f.getLastName())))
                    .peek(System.out::println)
                    .collect(Collectors.toList());
            System.out.println();


        System.out.println("5) Из списка абонентов:\n" +
                "\t- исключить дубликаты по телефонном номеру* (не обязательно)\n" +
                "\t- отфильтровать по последней цифре номера = 5\n" +
                "\t- посчитать средний возраст");


        List listSub5 = new ArrayList<>(Arrays.asList(tesrSubscibers)).stream()
//                .                                                                                     // исключить дубликаты по телефонном номеру* (не обязательно)
                .filter(p->p.getPhoneNumber().substring(p.getPhoneNumber().length()-1).equals("5"))     // отфильтровать по последней цифре номера = 5
                .peek(System.out::println)
                .collect(Collectors.toList());
            System.out.println();

        double listSub5_3 = new ArrayList<>(Arrays.asList(tesrSubscibers)).stream()                     // посчитать средний возраст
                .mapToInt(Subscriber::getAge)
                .peek(System.out::println)
                .average()
                .getAsDouble();
            System.out.println("Средний возраст = " + listSub5_3);
        System.out.println();




    }

    private static String replaceFirstChar (String str) {
        return str.replace(str.substring(0, 1), str.substring(0, 1).toLowerCase());
    }

    private static String replaceOtherChar (String str) {
        return str.replace(str.substring(1), str.substring(1).toUpperCase());
    }

}
