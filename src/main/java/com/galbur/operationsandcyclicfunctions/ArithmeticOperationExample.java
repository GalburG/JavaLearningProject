package com.galbur.operationsandcyclicfunctions;

public class ArithmeticOperationExample {
    public static void main(String[] args) {
        int a = 7;
        int b = 3;

        // Sum
        int sum = a + b;
        System.out.println("Suma = " + sum);
        System.out.println("Suma = " + (a + b));

//       Deduction
        int sub = a - b;
        System.out.println("Deduction result = " + sub);

//        Multiplication
        int result = a * b;
        System.out.println("Multiplication result =" + result);

//        Dividing
        result = a / b;
        System.out.println("Dividing result = " + result);

//        Division with reminder
        result = a % b;
        System.out.println("Division with reminder result = " + result);
    }
}