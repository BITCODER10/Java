package com.logicalnil;

public class ArrayProgram {
    private int sum;
    private int[] numbers;
    ArrayProgram(){

    }
    ArrayProgram(int... numbers){
        this.numbers =numbers;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }
    int getSum(){
        for(int num : numbers){
            sum += num;
        }
        return sum;
    }
    void printArray(){

        System.out.println("["+numbers[0]+","+numbers[1]+","+numbers[2]+","+numbers[3]+","+numbers[4]+"]");
    }
}
