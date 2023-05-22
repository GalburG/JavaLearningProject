package com.galbur.operationsandcyclicfunctions;

public class ComparisonOperationsExample {
    public static void main(String[] args) {
        int a = 8;
        int b = 8;

//        Egal cu
        boolean isEqual = a == b;
        System.out.println("a Egal cu b este: " + isEqual);

//        Diferit de
        boolean isDifferent = a != b;
        System.out.println("a Diferit de b este: " + isDifferent);

//        Mai mare decât
        boolean isGreaterThan = a > b;
        System.out.println("a Mai mare decât b este: " + isGreaterThan);

//        Mai mic decât
        boolean isLessThan = a < b;
        System.out.println("a Mai mic decât b este: " + isLessThan);

//        Mai mare sau egal cu
        boolean isGreaterThanOrEqual = a >= b;
        System.out.println("a Mai mare decât sau egal cu b este: " + isGreaterThanOrEqual);

//        Mai mic sau egal cu
        boolean isLessThanOrEqual = a <= b;
        System.out.println("a Mai mic decât sau egal cu b este: " + isLessThanOrEqual);
    }
}
