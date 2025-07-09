package com.logicalnil;

public interface Shape {
    double area();
    double volume();
    String getName();
    default Shape Compare(Shape s){
        if(this.area() < s.area()){
            return s;
        }else {
            return this;
        }
    }
}
