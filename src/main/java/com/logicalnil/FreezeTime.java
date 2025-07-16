package com.logicalnil;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

public class FreezeTime {
    FreezeTime(){}

    LocalDate getDate(){
        LocalDate localDate = LocalDate.now();
        return localDate;
    }
    LocalTime getTime(){
        LocalTime localTime = LocalTime.now();
        return localTime;
    }
    LocalDateTime getLocalDateTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        return localDateTime;
    }

    String SpecifiFormat(){
        String wanted = "dd-MMM-uuuu QQ w W E c F a h k K z";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(wanted);
        return LocalDateTime.now().format(formatter);
    }

    boolean TimerStudy(){

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int counter = 20;
            @Override
            public void run() {
                counter --;
                System.out.println("Hello World");
                if(counter == 0){
                    timer.cancel();
                }
            }
        };

        timer.schedule(task, 0, 1000);
        return false;
    }
}
