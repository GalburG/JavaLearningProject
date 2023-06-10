package com.galbur.filemanagementservice;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class InputFileReadManager {
    public static void

    printDataFromAFile(File file) {
        try {
            System.out.println(Files.readString(Path.of(file.getPath())));
        } catch (IOException e) {
            System.out.println("There is an exception " + e.getMessage());
        }
    }

    //    printDataFromAFileUsingFileReader(File file).
    public static void printDataFromAFileUsingFileReader(File file) {
        try {
            FileReader fileReader = new FileReader(file);
            int charIntValue = 0;
            while ((charIntValue = fileReader.read()) != -1) {
                System.out.print((char) charIntValue);
            }
        } catch (IOException e) {
            System.out.println(" We caught an exception " + e.getMessage());
        }
    }


    //    printDataFromAFileUsingBufferReader(File file).
    public static void printDataFromAFileUsingBufferReader(File file) {
        BufferedReader bufferedReader = null;
        try {
             bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Another exception treated" + e.getMessage());
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }


}
