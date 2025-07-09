package com.logicalnil;

public class Circle_Sphere implements Shape {
    private final double PI = Math.PI;
    private double radius;
    private String name;

    Circle_Sphere(String name){
        this(1, name);
    }
    Circle_Sphere(double radius, String name){
        this.radius = radius;
        this.name = name;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public double area() {
//        System.out.println("Area. of circle : "+PI*Math.pow(radius,2));
        System.out.println();
        return PI*Math.pow(radius,2);
    }

    @Override
    public double volume(){
//        System.out.println("Volume of circle: "+(double) 4 /3*PI*Math.pow(radius,3));
        System.out.println();
        return (double) 4 /3*PI*Math.pow(radius,3);
    }

    @Override
    public String toString(){
        System.out.println("Max Volume Belongs to : \t "+ this.name);
        return "";
    }
}
