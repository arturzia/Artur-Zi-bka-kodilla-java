package com.kodilla.good.patterns.challenges.flights;

import java.util.HashSet;

public final class Flights {

    public HashSet<Flight> getFindFlights(){

        HashSet<Flight> findFlights = new HashSet<>();

        findFlights.add(new Flight("Krakow", "Warszawa"));
        findFlights.add(new Flight("Warszawa", "Krakow"));
        findFlights.add(new Flight("Krakow", "Poznan"));
        findFlights.add(new Flight("Poznan", "Krakow"));
        findFlights.add(new Flight("Poznan", "Warszawa"));
        findFlights.add(new Flight("Warszawa", "Poznan"));
        findFlights.add(new Flight("Krakow", "Gdansk"));
        findFlights.add(new Flight("Gdansk", "Krakow"));
        findFlights.add(new Flight("Gdansk", "Warszawa"));

        return new HashSet<>(findFlights);
    }

}
