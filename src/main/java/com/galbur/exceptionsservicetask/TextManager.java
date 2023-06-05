package com.galbur.exceptionsservicetask;

public class TextManager {
    public static int getTheTextLength(String inputString) {
        return inputString.length();
    }

    public static int getTheTextLengthWithTryCatchFinally(String inputString) {
        try {
            return inputString.length();
        } catch (NullPointerException capturedExceptionInTryBlock) {
            System.out.println("An exception has been captured with following message: " + capturedExceptionInTryBlock.getMessage());
           return 2;
        } finally {
            System.out.println("this block is executed no matter what");
        }
    }

    // adding an extra If Else method to prevent null value for a message string
    public static int getTheTextLengthWithIfElseMethod(String inputString) {
        if (inputString == null) {
            System.out.println("Input string is a null value, pls be careful");
        } else {
            return inputString.length();
        }
        return 3;
    }
}
