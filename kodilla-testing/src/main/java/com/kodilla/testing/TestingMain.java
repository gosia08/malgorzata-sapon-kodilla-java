package com.kodilla.testing;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        Calculator calculator= new Calculator();

       int addResult = calculator.addMethod(3,3);
       int subResult = calculator.subMethod(7,2);
        if(addResult == 6)
            if(subResult==5){
            System.out.println("Test OK");

        }else{
            System.out.println("calculator has error!");
        }
    }
}
