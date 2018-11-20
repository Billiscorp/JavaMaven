package com.telesens.academy.lesson16_File.homework16;

import java.util.Arrays;

public class TestFile {

    public static void main(String[] args) {

        String pathProp = "/home/billiscorp/Work/Telesens/QA-JA/Java-part-maven/properties/";
        String pathData = "/home/billiscorp/Work/Telesens/QA-JA/Java-part-maven/data/";

        /*Properties prop = new Properties();
        File fileProp = new File(pathProp + "hw.properties");
        try (FileInputStream fisProp = new FileInputStream(fileProp)) {
            prop.load(fisProp);*/



        /*ReaderFile readerFile = new ReaderFile();
        String [] 	maleFirstNames = readerFile.readFromFile("/home/billiscorp/Work/Telesens/QA-JA/Java-part-maven/data/Names_Male.txt");
        Arrays.stream(maleFirstNames)
                .forEach(System.out::println);*/
    }

    /*2) Написать Java приложение, которое наполнит файл subscribers.xlsx, случайными данными:
            (путь к файлу взять из 'hw.properties')
    a) Наполнить таблицу абонентов excel(2000 строк):
            - имена фамилии взять в соответстсвующих файлах (см. 'hw.properties') со списком имен/фамилий (женских/мужских);
		- возраст генерировать случайно от 5 до 90 (можно использовать Гауссово распределение для этого диапазона)
            (диапазон брать из файла 'hw.properties')
*/

/*//    private static final int COUNT_COLUMNS = 6;
    private static String pathProp = "/home/billiscorp/Work/Telesens/QA-JA/Java-part-maven/properties/";
    private static String pathData = "/home/billiscorp/Work/Telesens/QA-JA/Java-part-maven/data/";

    public static void main(String[] args) {


        // Read Properties and save to var
        Properties prop = new Properties();
        File fileProp = new File(pathProp + "hw.properties");
        try (FileInputStream fisProp = new FileInputStream(fileProp)) {
            prop.load(fisProp);

            String maleFirstName = prop.getProperty("")


            male.firstnames=d:/myprojects/java-part/data/мужские имена.txt
            male.lastnames=d:/myprojects/java-part/data/мужские фамилии.txt
            female.firstnames=d:/myprojects/java-part/data/женские имена.txt
            female.lastnames=d:/myprojects/java-part/data/женские фамилии.txt

		# Диапазон возрастов
            age.from=5
            age.to=90

		# Использовать ли Гауссово распределение (true/false)
            age.gaussian=true

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/


       /* File file = new File("d:/demo.xlsx");

        try(
                XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(file))) {
            XSSFSheet sheet = workbook.getSheet("Sheet1");
            for (int r = 0; r <= sheet.getLastRowNum(); r++) {
                XSSFRow row = sheet.getRow(r);
                int number = (int)row.getCell(0).getNumericCellValue();
                String text = row.getCell(1).getStringCellValue();
                double dNumber = row.getCell(2).getNumericCellValue();
                Date date = row.getCell(3).getDateCellValue();
                Time time = new Time(row.getCell(4).getDateCellValue().getTime());
                int formula = (int)row.getCell(5).getNumericCellValue();
                System.out.println(String.format("%3d| %9s|%7.2f| %s|%s| %d",
                        number, text, dNumber, date, time, formula));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }*/






}
