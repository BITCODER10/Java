package com.logicalnil;

public class rect_Cube implements Shape{

    private double length;
    private double breadth;
    private double height;
    private String name;

    rect_Cube(String name){
        this(1,1,1, name);
    }
    rect_Cube(double length, double breadth, String name){
        this(length,breadth,1, name);
    }

    rect_Cube(double length, double breadth, double height, String name){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
        this.name = name;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
//        System.out.println("Area of square: "+ this.length*this.breadth);
        System.out.println();
        return this.length*this.breadth;
    }

    @Override
    public double volume() {
//        System.out.println("Volume of cube : "+this.length*this.breadth*this.height);
        System.out.println();
        return this.length*this.breadth*this.height;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString(){
        System.out.println("Max Area Belongs to : \t "+ this.name);
        return "";
    }
}
