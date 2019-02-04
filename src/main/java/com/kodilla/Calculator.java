package com.kodilla;

public class Calculator {

    int a;
    int b;

public int addMethod(int a, int b){
    return a + b;
}
public int subMethod (int a, int b){
    return a - b;
}
public static void main(String args[]){
    Calculator calculator = new Calculator();
    calculator.addMethod(1,2);
    System.out.println ("it works");
}
}



