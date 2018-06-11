package com.kodilla.good.patterns.challenges.flights;

public class Application {

    public static void main (String[] args){

        Flights flights = new Flights();
        FlightsSearch flightsSearch = new FlightsSearch();

        flightsSearch.search_1(flights.getFindFlights(), "Krakow");
        System.out.println();
        flightsSearch.search_2(flights.getFindFlights(), "Gdansk");
        System.out.println();
        flightsSearch.search_3(flights.getFindFlights(), "Krakow", "Warszawa", "Poznan");

    }
}
