package com.galbur.operationsandcyclicfunctions;

public class IncrementDecrementExample {
    public static void main(String[] args) {
        int a = 5;

//        Incrementare
        a++;
        System.out.println("Valoarea dupa incrementare este: " + a);

//        Pre-incrementare
        ++a;
        // a=7
        System.out.println(a);

        int b = ++a;
        System.out.println(b);
        // a = 8 , b = 8

        int a1 = a;
        int c = a++;
        // a1 = 8, c = 8, a = 9
        System.out.println("Afiseaza resultatele: a= " + a + ", b = " + b + ", c=" + c + ", a1 =" + a1);

//         Decrementare
        a--;
        System.out.println("Valoarea dupa decrementare a lui a este " + a);

// Pre-decrementare
        --a;
        System.out.println("Valoarea lui a dupa pre-decrementare este " + a);
    }
}
