package com.logicalnil;


import java.time.Duration;

public class CountDown {
    private Duration miliSeconds;
    CountDown(){

    }
    CountDown(Duration miliSeconds){
        this.miliSeconds = miliSeconds;
    }

    public Duration getMiliSeconds() {
        return miliSeconds;
    }

    public void setMiliSeconds(Duration miliSeconds) {
        this.miliSeconds = miliSeconds;
    }
    public void runCountDown(Duration d) throws InterruptedException {
        int i = (int) d.toMillis();
        System.out.println("Value of i is : "+i);
        for (int j = i; j>=1; j--){
            System.out.printf("\r%d",j);

            long pid = ProcessHandle.current().pid();
            Thread currentThread = Thread.currentThread();

            System.out.printf("\rPID: %d, Thread: %s (ID: %d), Count: %d",
                    pid, currentThread.getName(), currentThread.getId(), j);

            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e);
            }

        }
    }
}
