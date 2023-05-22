package com.galbur.operationsandcyclicfunctions;

public class DayOfTheWeekService {
    public static void main(String[] args) {
        int dayNumber;
        String dayName = "joi";

        System.out.println();
        System.out.println(dayName);
        System.out.println();

        switch (dayName.toUpperCase()) {
            case "MONDAY":
                dayNumber = 1;
                System.out.println("Monday is day number " + dayNumber);
                break;
            case "TUESDAY":
                dayNumber = 2;
                System.out.println("Tuesday is day number " + dayNumber);
                break;
            case "WEDNESDAY":
                dayNumber = 3;
                System.out.println("Wednesday is day number " + dayNumber);
                break;
            case "THURSDAY":
                dayNumber = 4;
                System.out.println("Thursday is day number " + dayNumber);
                break;
            case "FRIDAY":
                dayNumber = 5;
                System.out.println("Friday is day number " + dayNumber);
                break;
            case "SATURDAY":
                dayNumber = 6;
                System.out.println("Saturday is day number " + dayNumber);
                break;
            case "SUNDAY":
                dayNumber = 7;
                System.out.println("Sunday is day number " + dayNumber);
                break;
            default:
                System.out.println("Incorrect day name inserted");
        }
// daca folosim dayNumber in afara swithc-uli unde dayNumber e ne initializat , avem eroare  prt screen-ul din prezentare
    }
}
