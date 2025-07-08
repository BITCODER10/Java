package com.logicalnil;

import java.time.Duration;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        slf4j_logback slf4jLogback = new slf4j_logback();
        slf4jLogback.printLoggers();
        slf4jLogback.actualLogging();
  }
}