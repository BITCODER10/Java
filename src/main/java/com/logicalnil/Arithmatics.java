package com.logicalnil;

public class Arithmatics implements operations{

    private double numberOne;
    private double numberTwo;

    Arithmatics(){

    }
    Arithmatics(double a, double b){
        this.numberOne = a;
        this.numberTwo = b;
    }

    public double getNumberOne() {
        return numberOne;
    }

    public double getNumberTwo() {
        return numberTwo;
    }

    public void setNumberOne(double a) {
        this.numberOne = a;
    }

    public void setNumberTwo(double b) {
        this.numberTwo = b;
    }

    @Override
    public double addition(double a, double b) {
        return a + b;
    }

    @Override
    public double subtraction(double a, double b) {
        return a - b;
    }

    @Override
    public double multiplication(double a, double b) {
        return a * b;
    }

    @Override
    public String division(double a, double b) {
        if(ValueChecker.checkZero(a , b)){
            return String.valueOf(a/b);
        }else {
            return "Values cannot be zero";
        }
    }
}
