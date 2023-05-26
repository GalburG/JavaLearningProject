package com.galbur.methodstask;

import java.util.Random;
import java.util.UUID;

public class DataGeneratorUtil {
    //    importing an existing Random class that help us to use random generating function
    private static Random random = new Random();

    //     starting the method , for random number generation
    public static int getRandomInt(int min, int max) {
        if (min >= max) {   // giving condition for lower boundary not to be higher or equal to upper boundary
            System.out.println("Valoarea lui min trebuie sa fie mai mica ca cea a lui max");
            return -1;
        }
        int delta = max - min; // applying delta - differnce between the boundaries
        int delataRandomInt = random.nextInt(delta); // getting a random number as a value from that delta
        int randomNumber = delataRandomInt + min; // in order random number not to be lower than min from that delta
        // we just add the min value to that random delta
        return randomNumber; // returning the final random number here
    }

    public static int getRandomInt() {
        return random.nextInt();
    }

    public static int getRandomInt(int limita) {
        return random.nextInt(limita);
    }

    public static double getRandomDouble(double limita) {
        if (limita <= 0) {
            System.out.println("Limita trebuie sa fie pozitiva");
            return 0;
        }
        return random.nextDouble() * limita;
    }

    public static boolean getRandomBolean() {
        return random.nextBoolean();
    }

    // Creating now a method that will generate a random email address
    public static String getRandomEmail() {
        String uuid = UUID.randomUUID().toString();
        String domain = "@whatever_email.com";
        return uuid + domain;
    }

    // Creating now a method ro generate a random string
    public static String randomText(int length) {
        String acceptedChars = "ABCdef";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randomIndex = getRandomInt(acceptedChars.length());
            stringBuilder.append(acceptedChars.charAt(randomIndex));
            //  System.out.println("In iteratia i = " + i + " caracterul alipit este " + acceptedChars.charAt(randomIndex));
        }
        return stringBuilder.toString();
    }


    //  copying upper code part and just slightly modifying it for invalid data generator
    public static String randomTextInvalid(int length) {
        String acceptedChars = "0123";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randomIndex = getRandomInt(acceptedChars.length());
            stringBuilder.append(acceptedChars.charAt(randomIndex));
            // System.out.println("In iteratia i = " + i + " caracterul alipit este " + acceptedChars.charAt(randomIndex));
        }
        return stringBuilder.toString();
    }
}

