package com.logicalnil;

import java.util.Arrays;
import java.util.Random;

public class TwoDimArray {
    private int[][] matrix;
    private int rows;
    private int column;
    TwoDimArray(){

    }
    TwoDimArray(int[][] matrix, int rows, int column){
        this.matrix = matrix;
        this.rows = rows;
        this.column = column;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public void setMatrix() {
        this.matrix = new int[rows][column];
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public int getRows() {
        return rows;
    }

    public int getColumn() {
        return column;
    }

    public void buildMatrix(){
        Random random = new Random();
        for(int i = 0; i< rows; i++){
            for (int j = 0; j< column; j++){
                this.matrix[i][j] = random.nextInt(1,101);
            }
        }
        System.out.println("Matrix Built Succssfully");
        System.out.println("Length of Matrix :"+ matrix.length);
        System.out.println("Actual Matrix address is   :"+ Arrays.toString(matrix));
        System.out.println("Actual Matrix is  :"+ Arrays.deepToString(matrix));


    }


    void displayMatrix(){
        System.out.println("Initiating........");
        for(int[] row : matrix){
            for(int i : row){
                System.out.printf("%5d\t",i);
            }
            System.out.println();
        }
    }
}
