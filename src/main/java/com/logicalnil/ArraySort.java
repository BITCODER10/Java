package com.logicalnil;

import java.util.Arrays;

public class ArraySort {
    private int[] numbers;
    public ArraySort(){

    }
    public ArraySort(int... numbers){
        this.numbers = numbers;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }
    void sortingArrayBuildin(){
        int[] clonedSorted = numbers.clone();
        Arrays.sort(clonedSorted);
        System.out.println("Builtin Sorted Method result : "+Arrays.toString(clonedSorted));
    }
}
