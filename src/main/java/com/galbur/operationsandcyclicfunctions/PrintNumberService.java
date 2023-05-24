package com.galbur.operationsandcyclicfunctions;

public class PrintNumberService {
    public static void main(String[] args) {
        int a = 7;
        int limit = 9;

        System.out.println();
        System.out.println("a = " + a);
        System.out.println();
        System.out.println("limit = " + limit);
        System.out.println();

        while (a > 0) {
            System.out.println(a + ", ");
            a = a - 2;
        }

        System.out.println();

        a = 3;
        do {
            System.out.print(a + ", ");
            a = a + 3;
        } while (a <= limit);

        System.out.println();
        System.out.println();

        for (int i = 1; i <= a; i++) {
            System.out.print(i + ",");
        }

        System.out.println();
        System.out.println();

        for (int i = 1; i <= a; i++) {
            if ((i % 2)==0) {
                System.out.print(i + ", ");
            }
            else {
                System.out.print("[], ");
            }
        }
    }
}
