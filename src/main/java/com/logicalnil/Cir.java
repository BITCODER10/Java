package com.logicalnil;

import static java.lang.Math.pow;

public class Cir implements Compare {
    double radius;
    final static double  PI =3.14;
    public  Cir(){
        this(1.0);
    }
    public Cir(double r){
        this.radius = r;
    }

    public double getRadius(){
        return radius;
    }
    public double getPi(){
        return PI;
    }
    public double getArea(){
        return (PI*pow(radius,2));
    }
    public double compareArea(Compare r){
        return this.getArea() - r.getArea();
    }
}
