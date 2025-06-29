package com.logicalnil;

public class StarProgram {
    private int rows;
    StarProgram(int r){
        this.rows=r;
    }


    public int getRows() {
        return rows;
    }
    public void formLeftJustifiedStars(){
        for (int i = 1; i<=this.rows; i++){
            for(int j=1; j <=(this.rows-i); j++){
                System.out.print(" ");
            }
            for (int j=(this.rows-i)+1; j<=this.rows;j++){
                System.out.print(j);
            }
            System.out.print("\n");
        }

    }
}
