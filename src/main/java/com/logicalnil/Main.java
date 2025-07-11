package com.logicalnil;

public class Main {

    public static void main(String[] args) {
        try {
            SimpleFileWriter f = new SimpleFileWriter();
            f.readFile();
        }catch (Exception e){
            System.out.println("Bla bla");
        }

  }
}