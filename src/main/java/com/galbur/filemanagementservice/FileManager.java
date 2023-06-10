package com.galbur.filemanagementservice;

import java.io.File;
import java.io.IOException;

public class FileManager {

    //    createTheFileIdItDoesNotExist(File file).
    public static void createTheFileIfItDoesNotExist(File inputFile) {
        if (inputFile.exists()) {
            System.out.println("The file already exists");
        } else {
            System.out.println("The file does not exists, need to be created");
            try {
                inputFile.createNewFile();
                System.out.println("File created " + inputFile);
            } catch (IOException e) {
                System.out.println("There is and exception" + e.getMessage());
            }
        }
    }

    //    informIfTheTheFileExists(File file).
    public static void informIfTheFileExists(File file) {
        if (file.exists()) {
            System.out.println("The file already exists");
        } else {
            System.out.println("The file does not exists");
        }
    }

    //    printTheFileName(File file).
    public static void printTheFileName(File file) {
        System.out.println("The File name is: " + file.getName());
    }

    //    printTheFileAbsolutePath(File file).
    public static void printTheFileAbsolutePath(File file) {
        System.out.println("The File's absolute path is: " + file.getAbsolutePath());
    }

    //    printIfTheFileIsADirectory(File file).
    public static void printIfTheFileIsADirectory(File inputFile) {
        if (inputFile.isDirectory()) {
            System.out.println("The input file is actually a diretory");
        } else {
            System.out.println("The input file is not a directory");
        }
    }

    //    deleteTheFileIfExists(File file).
    public static void deleteTheFileIfExists(File inputFile) {
        if (inputFile.exists()) {
            System.out.println("The file does exist and needs to be deleted");
            inputFile.delete();
            System.out.println("The file was deleted successfully ");
            if (inputFile.exists()) {
                System.out.println("The file could not be deleted and it exists");
            } else {
                System.out.println("file deleted");
            }
        } else {
            System.out.println("File does not exist, so there is nothing to be deleted");
        }
    }
}
