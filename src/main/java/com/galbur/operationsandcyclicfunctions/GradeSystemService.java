package com.galbur.operationsandcyclicfunctions;

public class GradeSystemService {
    public static void main(String[] args) {
        int testResult = -34;

        System.out.println();
        System.out.println("Test result is " + testResult);
        System.out.println();

        if (testResult > 100) {
            System.out.println("Such a result is not possible");
        } else if (testResult >= 90) {
            System.out.println("Received Grade A");
        } else if (testResult >= 80) {
            System.out.println("Received Garde B");
        } else if (testResult >= 70) {
            System.out.println("Received Grade C");
        } else if (testResult >= 60) {
            System.out.println("Received Grade D");
        } else if (testResult < 0) {
            System.out.println("Such a result is also not possible");
        } else {
            System.out.println("Still a bad mark received");
        }
        System.out.println();
        System.out.println("The program is over");
    }
}
