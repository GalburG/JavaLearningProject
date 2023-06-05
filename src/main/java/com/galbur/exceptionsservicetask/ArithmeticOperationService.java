package com.galbur.exceptionsservicetask;

public class ArithmeticOperationService {
    public static int devideIntNoExceptionHandling(int a, int b) {
        return a / b;
    }

    public static int devideIntWithExceptionHandling(int a, int b) {
        try {
            return a / b;
        } catch (Throwable capturedException) {
            System.out.println("An exception has occured: " + capturedException.getMessage());
           // capturedException.printStackTrace();
            return 0;
        }
    }

}
