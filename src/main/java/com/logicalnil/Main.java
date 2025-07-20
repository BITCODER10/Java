package com.logicalnil;

import java.time.Duration;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("GAME BEGINS");

        ThreadingClass threadingClassObjectPing = new ThreadingClass("Ping");
        ThreadingClass threadingClassObjectPong = new ThreadingClass("Pong");

        Thread thread = new Thread(threadingClassObjectPing);
        Thread anotherThread = new Thread(threadingClassObjectPong);

        try {
            thread.start();
            anotherThread.start();
        }catch (Exception e){
            System.out.println("Exception occured"+e);
        }


        try {
            thread.join();
            anotherThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("GAME OVER");

        scanner.close();
  }
}