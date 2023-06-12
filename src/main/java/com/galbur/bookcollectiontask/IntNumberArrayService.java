package com.galbur.bookcollectiontask;

public class IntNumberArrayService {
    public static int getTheMinValueOfTheArray(int[] array) {
        int minValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    public static int getTheMinValueOfTheArrayIndex(int[] array) {
        int minValue = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                index = i;
            }
        }
        return index;
    }


    public static int getAverageOfTheArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum =sum + array[i];
            }
        return sum / array.length;
    }

}
