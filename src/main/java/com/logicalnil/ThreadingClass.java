package com.logicalnil;

public class ThreadingClass implements Runnable{

    private String text ;
    ThreadingClass(String text){
        this.text=text;
    }
    @Override
    public void run(){
        //Let's make main thread wait for 5 seconds
        for (int i = 0; i <= 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName()+" "+i+"th attemp"+" says "+text);

            }catch (InterruptedException e){
                System.out.println("\nMain Thread Interrupter"+e);
            }
        }
    }
}
