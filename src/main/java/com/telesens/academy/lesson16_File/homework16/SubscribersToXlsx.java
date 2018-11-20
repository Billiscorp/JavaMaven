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


import com.telesens.academy.lesson16_File.file.Subscriber;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Random;
import java.util.stream.Stream;

public class SubscribersToXlsx {

    ReadProperty prop = new ReadProperty();
    private String propFile = "hw.properties";
//    private String pathOut =  prop.readProperty(propFile,"pathOut");
    private String fileXLS = prop.readProperty(propFile, "subscriber.xlsx");


    public static void main(String[] args) {

        Random ran = new Random();
        Long initId = 0L + ran.nextInt(100);
        SubscriberFile.setCurrentId(initId); // при вычитки из базы макисмального ID вставить сюда !!!!

        ReadProperty prop = new ReadProperty();
        String propFile = "hw.properties";
        String fileXLS = prop.readProperty(propFile, "subscriber.exc");
        File file = new File("fileXLS");
        SubscriberFile subscriberFile = new SubscriberFile();


        System.out.println("***Generate***");
        int limit = 10;
        SubscriberFile [] array =
                Stream
                        .generate(subscriberFile::nextSubscriber)
                        .limit(limit)
                        .peek(System.out::println)
                        .peek(s -> {
                  prepareSubscriber(s);
                        })
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


     /*    *//*Результат subscribers.xlsx должен выглядеть так:
                            1 | Васильев  | Иван | м | 23 | 380630025465 | Life
                            2 | Петрова   | Катя | ж | 34 | 380670058694 | Kievstar
                            *//*
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Subscribers");
                            *//*Object[][] data = {
                                    {1, "text_1", 1.1},
                                    {3, "text_3", 1.3},
                                    {5, "text_5", 1.5},
                                    {7, "text_7", 1.7},
                                    {9, "text_9", 1.9}
                            };*//*
        for (int r = 0; r < limit; r++) {
            Row row = sheet.createRow(r);
            Cell cellID = row.createCell(0);
            Cell cellLastName = row.createCell(1);
            Cell cellFirstName = row.createCell(2);
            Cell cellGender = row.createCell(3);
            Cell cellAge = row.createCell(4);
            Cell cellPhone = row.createCell(5);
            Cell cellOperator = row.createCell(6);

            cellID.setCellValue(SubscriberFile.);

            cellText.setCellValue((String)data[r][1]);
            cellDouble.setCellValue((Double) data[r][2]);
        }
        try(FileOutputStream out = new FileOutputStream(new File("d:/temp/saved.xlsx"))) {
            workbook.write(out);
        }
        catch (Exception e) {
            e.printStackTrace();
        }*/
    }




    private static String prepareSubscriber (SubscriberFile subscriberFile) {
        return subscriberFile.getId() + "," + subscriberFile.getLastName() + "," + subscriberFile.getFirstName() + "," + subscriberFile.getGender() + "," + subscriberFile.getAge() + "," + subscriberFile.getPhoneNumber()+ "," +subscriberFile.getOperator();
    }











}






