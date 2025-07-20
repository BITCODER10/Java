package com.logicalnil;

public class ThreadingClass implements Runnable{

    @Override
    public void run(){
        //Let's make main thread wait for 5 seconds
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
                if (i==4){
                    System.out.print("\nTimes up");
                    System.exit(0); // if user does not provide input before 5 seconds then main thread should also close
                }
            }catch (InterruptedException e){
                System.out.println("\nMain Thread Interrupter"+e);
            }
        }
    }
}
