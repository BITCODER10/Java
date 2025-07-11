package com.logicalnil;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    private int a ;
    private int b;
    ExceptionHandling(){

    }
    ExceptionHandling(int a, int b){
        this.a=a;
        this.b=b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void E1(){
        try {
            int c = a/b;
        }catch (ArithmeticException e){
            System.out.println("You cannot divide number by zero");
        }finally {
            System.out.println("Final block executed");
        }
    }
    public void E2(){
        try (Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter Integer Value");
            int a = scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("You should only enter integer value");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            System.out.println("Program ended");
        }
    }
}
