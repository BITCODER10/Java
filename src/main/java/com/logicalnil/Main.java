package com.logicalnil;

import java.time.Duration;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("CAUTION : You have 5 seconds to enter your name");

        ThreadingClass threadingClassObject = new ThreadingClass();
        Thread thread = new Thread(threadingClassObject);
        thread.setDaemon(true); // this will finish another thread prematurely if main thread ends
        thread.start(); // starting another threads
        System.out.print("\nEnter your name");
        String name = scanner.nextLine().toUpperCase();

        System.out.println("\nHello : "+name);

        scanner.close();
  }
}