package com.logicalnil;

import java.time.Duration;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banking banking = new Banking();
        banking.printOption();
        banking.performAction();
        scanner.close();
        banking.closeScanner();

  }
}