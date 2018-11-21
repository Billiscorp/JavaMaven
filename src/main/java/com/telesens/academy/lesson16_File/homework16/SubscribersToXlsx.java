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



import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.Random;
import java.util.stream.Stream;

public class SubscribersToXlsx {

    public static void main(String[] args) {

        Random ran = new Random();
        Long initId = (long) ran.nextInt(100);
        SubscriberFile.setCurrentId(initId); // при вычитки из базы макисмального ID вставить сюда !!!!

        ReadProperty prop = new ReadProperty();
        String propFile = "hw.properties";
        String fileXLS = prop.readProperty(propFile, "subscriber.exc");
//        String fileTXT = prop.readProperty(propFile,"subscriber.txt");
        SubscriberFile subscriberFile = new SubscriberFile();


        System.out.println("***Generate***");
        int limit = 5;
//        int r = 0;
        final int[] count = {0};

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Subscribers");

        SubscriberFile[] array =
                Stream
                        .generate(subscriberFile::nextSubscriber)
                        .limit(limit)
                        .peek(System.out::println)
                        .peek(s -> {

                            count[0]++;
                            Row row = sheet.createRow(count[0]);
                                Cell cellID = row.createCell(0);
                                Cell cellLastName = row.createCell(1);
                                Cell cellFirstName = row.createCell(2);
                                Cell cellGender = row.createCell(3);
                                Cell cellAge = row.createCell(4);
                                Cell cellPhone = row.createCell(5);
                                Cell cellOperator = row.createCell(6);

                                cellID.setCellValue(s.getId());
                                cellLastName.setCellValue(s.getLastName());
                                cellFirstName.setCellValue(s.getFirstName());
                                cellGender.setCellValue(s.getGender());
                                cellAge.setCellValue(s.getAge());
                                cellPhone.setCellValue(s.getPhoneNumber());
                                cellOperator.setCellValue(s.getOperator());

//                            }

                            try(FileOutputStream out = new FileOutputStream(new File(fileXLS))) {
                                workbook.write(out);
                            }
                            catch (Exception e) {
                                e.printStackTrace();
                            }
                                })
                        .toArray(SubscriberFile[]::new);
        System.out.println("***Finish***");


    }






}






