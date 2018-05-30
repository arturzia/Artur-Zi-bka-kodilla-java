package com.kodilla.exception.test;

import java.util.HashMap;

public class ArrivalAirport {

    HashMap<String, Boolean> findAirPort = new HashMap<>();

    public ArrivalAirport() {
        findAirPort.put("London", Boolean.TRUE);
        findAirPort.put("Paris", Boolean.FALSE);
        findAirPort.put("Berlin", Boolean.TRUE);
        findAirPort.put("Warszawa", Boolean.TRUE);
        findAirPort.put("Munich", Boolean.FALSE);
        findAirPort.put("Frankfurt", Boolean.TRUE);
        findAirPort.put("Madrid", Boolean.TRUE);
        findAirPort.put("Roma", Boolean.FALSE);
        findAirPort.put("Edinburgh", Boolean.TRUE);
        findAirPort.put("NewYork", Boolean.TRUE);
        findAirPort.put("Chicago", Boolean.FALSE);
        findAirPort.put("Tokyo", Boolean.TRUE);
    }

    public boolean findFlight(Flight flight)throws RouteNotFoundException {

        if (findAirPort.containsKey(flight.getArrivalAirport())) {
            return findAirPort.get(flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException("Airport not found in map");
        }
    }
}
