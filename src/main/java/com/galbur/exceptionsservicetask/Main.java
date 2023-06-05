package com.galbur.exceptionsservicetask;

import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        //  System.out.println(ArithmeticOperationService.devideIntNoExceptionHandling(5,0));
        try {
            ArithmeticOperationService.devideIntNoExceptionHandling(7, 0);
        } catch (Exception exception) {
            System.out.println("A new error/exception appeared, but no program stopping, error is: " + exception.getMessage());
        } finally {
            System.out.println("just a separation text of these 2 arithmetics methods read");
        }

        System.out.println(ArithmeticOperationService.devideIntWithExceptionHandling(5, 0));
        System.out.println("The program is still running");

        String textDeControl = null;
        String textDeControl1 = "hey you!";

        try {
            System.out.println(TextManager.getTheTextLength(textDeControl));
        } catch (Exception exception) {
            System.out.println("1st TextManager line null");
        } finally {
            System.out.println("Another finally separator");
        }

        System.out.println(TextManager.getTheTextLengthWithTryCatchFinally(textDeControl));
        System.out.println();
        System.out.println("separator between 2nd and 3rd text manager methods");
        System.out.println(TextManager.getTheTextLengthWithIfElseMethod(textDeControl1));

        System.out.println();
        System.out.println("getting to the reade data from file task now");
        String filePath = "src/main/java/com/galbur/exceptionsservicetask/test.file";
        System.out.println("Cathced in the Main execution class");
        try {
            ReadDataManager.readDataFromFileWithoutTryAndCatch(filePath);
        } catch (IOException exception) {
            System.out.println();
            System.out.println("An exception occurred, The file does not exist, but program run is not interrupted");
        } finally {
            System.out.println();
            System.out.println("this part of code block is always running   ( finally block 1) ");
        }
        System.out.println();
        String filePath2 = "src/main/java/com/galbur/exceptionsservicetask/testfile2";
        System.out.println("Catched in the ReadDataManafer class ( where initialized)");
        ReadDataManager.readDataFromFileWithTryAndCatch(filePath2);
    }
}
