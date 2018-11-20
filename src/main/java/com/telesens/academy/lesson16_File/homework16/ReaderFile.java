package com.telesens.academy.lesson16_File.homework16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;

public class ReaderFile {

        public static String randomStringFromFile(File fileName) throws FileNotFoundException {
            {
                String result = null;
                Random rand = new Random();
                int n = 0;
                for (Scanner sc = new Scanner(fileName); sc.hasNext(); ) {
                    ++n;
                    String line = sc.nextLine();
                    if (rand.nextInt(n) == 0)
                        result = line;
                }

                return result;
            }
        }

}
