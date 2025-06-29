package com.logicalnil;

public class ValueChecker {
    private static double firstValue;
    private static double secondValue;

    public static boolean checkZero(double firstValue, double secondValue){
        if(firstValue==0 || secondValue==0){
//            System.out.print("False");
            return false;
        }else {
//            System.out.print("True");
            return true;
        }
    }
}
