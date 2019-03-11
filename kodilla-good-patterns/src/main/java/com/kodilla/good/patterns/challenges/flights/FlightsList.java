package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;

public final class FlightsList {

    public static List<Flight> getTheFlightsList() {
        List<Flight> theFlightsList = new ArrayList<>();
        theFlightsList.add(new Flight("Warsaw", "London"));
        theFlightsList.add(new Flight("London", "New York"));
        theFlightsList.add(new Flight("Balhsen","Genewa"));
        theFlightsList.add(new Flight("Genewa", "Cracow"));
        theFlightsList.add(new Flight("London", "Cracow"));
        theFlightsList.add(new Flight("Cracow", "Paris"));
        return new ArrayList<>(theFlightsList);
    }
}