package com.galbur.bookcollectiontask;

public class Main {
    public static void main(String[] args) {
        int[] anArray = {3, 0, -1, 423, 3, 6, 2, 73};

        System.out.println(IntNumberArrayService.getTheMinValueOfTheArray(anArray));
        System.out.println();
        System.out.println("And the min value index position is: " + IntNumberArrayService.getTheMinValueOfTheArrayIndex(anArray));
        System.out.println();
        System.out.println("The average value of the given array is : " + IntNumberArrayService.getAverageOfTheArray(anArray));
        System.out.println();
        System.out.println("The Array list contains " + anArray.length + " elements");

        int a = 8;
        int b = 2;

        System.out.println("a = " + a + "b = " + b);

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("a = " + a + "b = " + b);

    }
}
