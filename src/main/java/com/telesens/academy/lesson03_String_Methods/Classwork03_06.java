package com.telesens.academy.lesson03_String_Methods;


/*
6.
        Инициализировать двумерный массив
        String[] testData
        в котором хранятся данные о пользователях id, name, age в строковом виде:
        "1", "Ivan", "23"
        “2", “Helen", “35“
        “3", “Peter", “19"
        Создать метод testUser(long id, String name, int age) который выполняет псевдо-тест пользователя:
        Создать метод provideTestData, который запускает тесты для каждого пользователя, используя testData
        На консоле должны увидеть следующее:
        Тест старт
        id: 1, имя: Ivan, возраст: 23
        Тест финиш
        Тест старт
        id: 2, имя: Helen, возраст: 35
        Тест финиш
        Тест старт
        id: 3, имя: Peter, возраст: 19
        Тест финиш
*/



public class Classwork03_06 {
    public static void main(String[] args) {


        String[][] testData = {
                {"1", "Ivan", "23"},
                {"2", "Helen", "35"},
                {"3", "Peter", "19"},
        };

        provideTestData(testData);
    }


    public static void testUser(long id, String name, int arg) {
        System.out.println("Test started");
        System.out.println("id = " + id);
        System.out.println("Test finished");
    }

    private static void provideTestData(String[][] testData) {
        for (int i = 1; i < testData.length; i++) {
                long id = Long.parseLong(testData[i][0]);
                String name = testData[i][1];
                int age = Integer.parseInt(testData[i][2]);
                testUser(id, name, age);
        }
    }
}
