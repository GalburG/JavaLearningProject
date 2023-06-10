package com.galbur.filemanagementservice;

import java.io.File;

public class FileTaskExecution {
    public static void main(String[] args) {
        File demoFile = new File("src/main/java/com/galbur/filemanagementservice/demofile2.txt");

//        FileManager.createTheFileIfItDoesNotExist(demoFile);
//        FileManager.informIfTheFileExists(demoFile);
//        FileManager.printTheFileName(demoFile);
//        FileManager.printIfTheFileIsADirectory(demoFile);
//        FileManager.printTheFileAbsolutePath(demoFile);
//        FileManager.deleteTheFileIfExists(demoFile);

//        InputFileReadManager.printDataFromAFile(demoFile);
//        InputFileReadManager.printDataFromAFileUsingFileReader(demoFile);
        System.out.println("Basic content");
        InputFileReadManager.printDataFromAFileUsingBufferReader(demoFile);

//        String newContentForNewFile = "wel done man ! \n new line to test \n once again";
//        OutputFileWriterManager.writeDataIntoFileWithFileWriter(demoFile, newContentForNewFile);

        OutputFileWriterManager.writeDataIntoFileWithBufferedWriter(demoFile, "Homework done! Yey");
        System.out.println("New content of the file is ");
        InputFileReadManager.printDataFromAFileUsingBufferReader(demoFile);

    }
}
