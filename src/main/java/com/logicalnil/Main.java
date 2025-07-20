package com.logicalnil;

import java.time.Duration;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Days day = Days.MONDAY;
        switch (day){
            case FRIDAY,
                 THURSDAY,
                 WEDNESDAY-> System.out.println("Work from office");
            case MONDAY,
                 TUESDAY-> System.out.println("Work from Home");
            case SATURDAY,
                 SUNDAY-> System.out.println("Weekend !");
        }
  }
}