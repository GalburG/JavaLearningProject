package com.galbur.operationsandcyclicfunctions;

public class AssignmentOperationsExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

//        Atribuire simpla
        int result = a;
        System.out.println("Atribuire simpla, result = " + result);

//       Atribuire cu adunare
        result += b;
        System.out.println("Rezultat atribuire cu adunare = " + result);
        result = result + b;
        System.out.println("Rezultat atribuire cu adunare = " + result);

//        Atribuire cu scadere
        result -= b;
        System.out.println("Rezultat atribuire cu scadere = " + result);
        result = result - b;
        System.out.println("Rezultat atribuire cu scadere = " + result);

//        Atribuire cu inmultire
        result *= b;
        System.out.println("Rezultat atribuire cu inmultire = " + result);
        result = result * b;
        System.out.println("Rezultat atribuire cu inmultire = " + result);

//        Atribuire cu impartire
        result /= b;
        System.out.println("Rezultat atribuire cu impartire " + result);
        result = result / b;
        System.out.println("Rezultat atribuire cu impartire " + result);

//        Atribuire cu restul impartirii
        result %= b;
        System.out.println("Rezultat atribuire cu restul impartirei = " + result);
        result = 6;
        result = result % b;
        System.out.println("Rezultat atribuire cu restul impartirei = " + result);
    }
}
