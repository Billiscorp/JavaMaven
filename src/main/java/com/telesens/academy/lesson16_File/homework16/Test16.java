package com.telesens.academy.lesson16_File.homework16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;
import java.util.Scanner;

public class Test16 {

    public static void main(String[] args) throws IOException {
        //TODO подвязать файл и через метод вычитать строку
       /* System.out.println(choose(new File("/home/billiscorp/Work/Telesens/QA-JA/Java-part-maven/data/Names_Male.txt")));
        // Edit configuration*/


          /* Телефонные номера для каждого оператора со следующими префиксами:
            - Life номера с префиксами: 38063*******, 38093*******, 38073*******
            - Kievstar номера с префиксами: 38097*******, 38067*******, 38098*******
            - Vodafone номера с префиксами: 38050*******, 38066*******, 38095********/
//        public  static  String generatePhoneNumber() {

            for (int i=0;i<20;i++) {
                String[] arrayPrefixLife = {"38063", "38093", "38073"};
                String[] arrayPrefixKievstar = {"38097", "38067", "38098"};
                String[] arrayPrefixVodafone = {"38050", "38066", "38095"};
                String prefixLife;
                String prefixKievstar;
                String prefixVodafone;


                int a = (int) (1 + Math.random() * 3);
                Random ran = new Random();
                System.out.println(a);

                switch(a) {
                    case 1:
                    {
                        prefixLife = arrayPrefixLife[(int) (Math.random() * 2)];
                        Integer middleDigits = ran.nextInt(10_000_000);

                        System.out.println(prefixLife+middleDigits.toString());
                    };
                        break;
                    case 2:
                    {
                        prefixKievstar = arrayPrefixKievstar[(int) (Math.random() * 2)];
                        Integer middleDigits = ran.nextInt(10_000_000);

                        System.out.println(prefixKievstar+middleDigits.toString());
                    };
                        break;
                    case 3:
                    {
                        prefixVodafone = arrayPrefixVodafone[(int) (Math.random() * 2)];
                        Integer middleDigits = ran.nextInt(10_000_000);

                        System.out.println(prefixVodafone+middleDigits.toString());
                    };
                        break;

                }


//        }

            }

           /* int firstThreeNumbers = 999;
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
        }*/

    }


   /* public static String getRandomLineFromTheFile(File file) throws IOException {
//        System.setProperty("file.encoding", "UTF-8");
        final RandomAccessFile f = new RandomAccessFile(file, "r");
        final long randomLocation = (long) (Math.random() * f.length());
        f.seek(randomLocation);
        f.readLine();
        return f.readLine();*/

 /*       public static String getRandomLineFromTheFile(File file) throws IOException {
//        System.setProperty("file.encoding", "UTF-8");
            final RandomAccessFile f = new RandomAccessFile(file, "r");
            final long randomLocation = (long) (Math.random() * f.length());
            f.seek(randomLocation);

            return new String(f.readLine().getBytes("ISO-8859-1"), "UTF-8");


    }*/

    /*public static String choose(File f) throws FileNotFoundException
    {
        String result = null;
        Random rand = new Random();
        int n = 0;
        for(Scanner sc = new Scanner(f); sc.hasNext(); )
        {
            ++n;
            String line = sc.nextLine();
            if(rand.nextInt(n) == 0)
                result = line;
        }

        return result;
    }*/


}


   /* RandomAccessFile raf = new RandomAccessFile(new File("MyFile.txt"), "r");
    String line = raf.readLine();
    String utf8 = new String(line.getBytes("ISO-8859-1"), "UTF-8");
    System.out.println("Line: " + line);
            System.out.println("UTF8: " + utf8); */
