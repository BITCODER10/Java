package com.logicalnil;

import java.time.Duration;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        TwoDimArray TDArray = new TwoDimArray();
        Random random = new Random();
        TDArray.setColumn(random.nextInt(1,4));
        TDArray.setRows(random.nextInt(1,4));
        TDArray.setMatrix();
        System.out.println("Rows : "+TDArray.getRows());
        System.out.println("Columns : "+TDArray.getColumn());
        TDArray.buildMatrix();
        TDArray.displayMatrix();
    }
  }
