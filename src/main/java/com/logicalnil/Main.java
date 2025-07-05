package com.logicalnil;

import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        questionsList questionsList = new questionsList();
        questionsList.BeginGame();
        MyData[] n = questionsList.getData();

//        System.out.println("Something : "+ Arrays.deepToString(n));
//        for(MyData s : n){
//            System.out.println(s.question);
//        }

  }
}