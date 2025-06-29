package com.logicalnil;

public class Rect implements Compare{
    double length, breadth;
    public Rect(){
        this(1.0,1.0);
    }
    public Rect(double b){
        this(1.0,b);
    }
    public Rect(double l , double b){
        this.length =l;
        this.breadth = b;
    }
    public double getArea(){
        return (length*breadth);
    }
    public double getLength(){
        return length;
    }
    public double getBreadth(){
        return breadth;
    }

    public double compareArea(Compare c){
        return this.getArea() - c.getArea();
    }
}
