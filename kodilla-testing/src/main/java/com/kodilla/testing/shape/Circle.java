package com.kodilla.testing.shape;

public class Circle implements Shape {

    String shapeName;
    double field;


    public Circle(double radius){
        this.shapeName="circle";
        this.field=3.14*radius*radius;

    }
    public String getShapeName(){
        return this.shapeName;
    }

    public double getField(){
        return this.field;
    }


}