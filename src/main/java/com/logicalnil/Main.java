package com.logicalnil;

public class Main {

    public static void main(String[] args) {
        FreezeTime freezeTime = new FreezeTime();
        System.out.println(freezeTime.getTime());
        System.out.println(freezeTime.getDate());
        System.out.println(freezeTime.getLocalDateTime());
        System.out.println(freezeTime.SpecifiFormat());
        System.out.println(freezeTime.TimerStudy());

  }
}