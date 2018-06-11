package com.kodilla.good.patterns.challenges.flights;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;


public class FlightsSearch {

    public  void search_1(HashSet<Flight> flights, String nameAirPort) {

        flights.stream()
                .filter(s->s.getDepartureAirport().equals(nameAirPort))
                .forEach(System.out::println);
    }

    public void search_2(HashSet<Flight> flights, String nameAirPort) {

        flights.stream()
                .filter(s->s.getArrivalAirport().equals(nameAirPort))
                .forEach(System.out::println);
    }

    public void search_3(HashSet<Flight> flights, String departureAirPort, String arrivalAirPort, String viaAirPorts) {

        List<Flight> temp = flights.stream()
                .filter(s->(s.getDepartureAirport().equals(departureAirPort) || s.getDepartureAirport().equals(viaAirPorts))
                        && (s.getArrivalAirport().equals(arrivalAirPort) || s.getArrivalAirport().equals(viaAirPorts)))
                .filter(s->!(s.getDepartureAirport().equals(departureAirPort) && s.getArrivalAirport().equals(arrivalAirPort)))
                .collect(Collectors.toList());

                if (temp.size() != 0){
                    System.out.println("Flight is available");

                }else System.out.println("Flight is not available");
    }
}