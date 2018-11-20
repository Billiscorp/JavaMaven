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
        System.out.println(choose(new File("/home/billiscorp/Work/Telesens/QA-JA/Java-part-maven/data/Names_Male.txt")));
        // Edit configuration

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

    public static String choose(File f) throws FileNotFoundException
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
    }


}

   /* RandomAccessFile raf = new RandomAccessFile(new File("MyFile.txt"), "r");
    String line = raf.readLine();
    String utf8 = new String(line.getBytes("ISO-8859-1"), "UTF-8");
    System.out.println("Line: " + line);
            System.out.println("UTF8: " + utf8); */
