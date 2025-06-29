package com.logicalnil;

import java.util.Random;

public class RandomNumGen {
    private final long firstNumber;
    private final long lastNumber;
    RandomNumGen(){
        this(1,6);
    }
    RandomNumGen(long firstNumber, long lastNumber){
        this.firstNumber = firstNumber;
        this.lastNumber = lastNumber;
    }
    public long getFirstNumber(){
        return firstNumber;
    }
    public long getLastNumber(){
        return lastNumber;
    }
    public long generateRandomNumber(){
        Random randomNumber = new Random();
        return randomNumber.nextLong(this.firstNumber, this.lastNumber);
    }
}
