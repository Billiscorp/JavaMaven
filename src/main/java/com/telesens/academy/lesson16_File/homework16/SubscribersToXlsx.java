package com.telesens.academy.lesson16_File.homework16;


/*
2) Написать Java приложение, которое наполнит файл subscribers.xlsx, случайными данными:
        (путь к файлу взять из 'java-part.properties')
        a) Наполнить таблицу абонентов excel(2000 строк):
        - имена фамилии взять в соответстсвующих файлах (см. 'java-part.properties') со списком имен/фамилий (женских/мужских);
        - возраст генерировать случайно от 5 до 90 (можно использовать Гауссово распределение для этого диапазона)
        (диапазон брать из файла 'java-part.properties')

        b)  Телефонные номера для каждого оператора со следующими префиксами:
        - Life номера с префиксами: 38063*******, 38093*******, 38073*******
        - Kievstar номера с префиксами: 38097*******, 38067*******, 38098*******
        - Vodafone номера с префиксами: 38050*******, 38066*******, 38095*******

        Результат subscribers.xlsx должен выглядеть так:
        1 | Васильев  | Иван | м | 23 | 380630025465 | Life
        2 | Петрова   | Катя | ж | 34 | 380670058694 | Kievstar
        ...
        2000 | Борисов   | Коля | м | 48 | 380500025465 | Vodafone
        Всего 2000 случайных строк

        !!!!!!
        За основу взять /home/billiscorp/Work/Telesens/QA-JA/Java-part-maven/src/main/java/com/telesens/academy/lesson18_File/file/SubscriberDemo.java
*/


import java.util.stream.Stream;

public class SubscribersToXlsx {

    private String propFile = "hw.properties";
    private String pathOut =  ReadProperty.readProperty(propFile,"pathOut");
    private String fileXLS = ReadProperty.readProperty(propFile, "subscriber.xlsx");


    public static void main(String[] args) {

        System.out.println("***Generate***");
        int limit = 5;
        SubscriberFile [] array =
                Stream
                        .generate(SubscriberFile::nextSubscriber)
                        .limit(limit)
                        .peek(System.out::println)
                       /* .peek(s -> {
                            try {
                                fw.write(s.toString() + "\n");
//                                        fw.write(prepareSubscriber(s)+"\n");    // меняем вывод  информации без "ключей"
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        })*/
                        .toArray(SubscriberFile[]::new);
        System.out.println("***Finish***");


    }











}
