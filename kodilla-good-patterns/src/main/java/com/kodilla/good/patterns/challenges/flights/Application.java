package com.kodilla.good.patterns.challenges.flights;

public class Application {
    public static void main(String[] args) {
        System.out.println(FlightFinder.searchByArrivalAirport("Cracow"));
        System.out.println(FlightFinder.searchByDepartureAirport("Warsaw"));
        System.out.println(FlightFinder.searchForConnectingFlights("Warsaw", "London",
                "New York"));

    }
}