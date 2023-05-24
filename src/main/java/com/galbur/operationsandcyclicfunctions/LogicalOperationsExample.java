package com.galbur.operationsandcyclicfunctions;

public class LogicalOperationsExample {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        boolean result = a && b;
        System.out.println("a=true, b=false, Result a && b = " + result);
// after this result = false

        a = result && b;
        System.out.println( "a = " + a);
        // dupa aceasta a raine false

        a = true;
        result = a || b;
        System.out.println("Result = " + result);
// dupa asta result = true

        System.out.println("Negarea variabilei Result este " + !result);
        //dupa asta result ca fi false

        System.out.println("Negarea variabilei Result este " + !!!result);
        // la ultima operatie resultatul iarasi va fi false , fiindca se ia valoarea initiala a resultuli care este true,
        // si se face negarea de 3 ori
    }
}
