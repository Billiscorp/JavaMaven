package com.telesens.academy.lesson15_Stream.homework15;


/*
2) Сгенерировать массив 100 абонентов:
        - id возрастает для каждого следующего абонента (необязательно последовательно)
        - со случайными именами и фамилиями (брать из подготовленного массива данных)
        - возраст от 18 до 60 лет
        - телефонный номер заполнить по следующему правилу (задача была на предыдущих занятиях):
        - 10 цифр
        - первый три цифры 999,
        - последняя 0 или 5
        - остальные цифры - любые
*/


import java.util.Random;

public class Data {
    private static String [] firstNames = {"Maша", "Петя", "Вася", "Миша", "Даша", "Катя", "Саша", "Паша"};
    private static String [] lastNames = {"Корженко", "Михайленко", "Кузьменко", "Клопотенко", "Половик"};
    private static Random rand =  new Random();
    private static long id = 1L;

    public static String generateFirstName(){
        int randomNumber = rand.nextInt(firstNames.length);
        return firstNames [randomNumber];
    }

    public static String generateLastName(){
        int randomNumber = rand.nextInt(lastNames.length);
        return lastNames[randomNumber];
    }

    public static int generateAge(){
        int lowerLimit = 18;
        int upperLimit = 60;
        return rand.nextInt(upperLimit-lowerLimit)+lowerLimit;
    }

    public static String generatePhoneNumber() {
        int firstThreeNumbers = 999;
        int middleDigits = rand.nextInt(1_000_000);
        // 1 способ
        int lastDigit = rand.nextBoolean() ? 0 : 5;
        // 2 способ
//        if (rand.nextBoolean())
//            last = 0;
//        else
//            last = 5;
        long phoneNumber =
                firstThreeNumbers*1_000_0000L + // двигаем влево на 7 разрядов
                        middleDigits*10 + // умножаем на 10, чтобы сдвинуть влево на один разряд
                        lastDigit; // 0 или 5
        return Long.toString(phoneNumber);
    }


    /*private static <T> Predicate<T> distinctBy(Function<? super T, ?> keyExtractor) {
        final Set<Object> set = new HashSet<>();
        return t -> set.add(keyExtractor.apply(t));
    }*/


      public Subscriber nextSubscriber() {
        long nextId = id;
//        id = id + rand.nextInt(100);
        id++;
        String firstName = generateFirstName();
        String lastName = generateLastName();
        int age = generateAge();
        String phoneNumber = generatePhoneNumber();
        return new Subscriber(nextId, firstName, lastName, age, phoneNumber);
    }

}


