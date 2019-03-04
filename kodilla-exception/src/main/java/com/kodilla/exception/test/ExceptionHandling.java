package com.kodilla.exception.test;
import java.io.IOException;

public class ExceptionHandling {
    public static void main(String args[]) {

        SecondChallenge secondChallenge = new SecondChallenge();

        double x = 4.5;
        double y = 2.1;

        try {
            System.out.println(secondChallenge.probablyIWillThrowException(x, y));

        } catch (Exception e) {

            System.out.println("If (x >= 2 || x < 1 || y == 1.5) I will throw an exception!");

        } finally {
            System.out.println("Task is finished");

        }
    }
}
