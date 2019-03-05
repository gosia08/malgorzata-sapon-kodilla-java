package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public Map<String, Boolean> findFlight (String airport) throws RouteNotFoundException {

        HashMap<String, Boolean> flights = new HashMap<>();
        flights.put("Cracow", true);
        flights.put("Katowice", true);
        flights.put("Skawica", false);
        flights.put("Sucha", false);


        if (!flights.containsKey(airport)) {
            throw new RouteNotFoundException();
        }
        if (flights.containsKey(airport)) {
            boolean value = flights.get(airport);
            if (value == true) {
                System.out.println("Flight is possible");
            } else {
                System.out.println("Flight is impossible");
            }
        }
        return flights;
    }
}