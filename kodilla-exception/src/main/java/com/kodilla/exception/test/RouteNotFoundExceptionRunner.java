package com.kodilla.exception.test;

public class RouteNotFoundExceptionRunner {
    public static void main(String[] args) {

        FlightFinder flightsFinder = new FlightFinder();

        try {
            flightsFinder.findFlight("Sucha");

        } catch (RouteNotFoundException e) {
            System.out.println("Flight not found");

        } finally {

            System.out.println("End of process");


        }
    }
}