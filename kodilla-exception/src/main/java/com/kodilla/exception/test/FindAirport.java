package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindAirport {

    public boolean findFlight(Flight flight)throws RouteNotFoundException{

        HashMap<String, Boolean> findAirPort = new HashMap<>();

        findAirPort.put("London", Boolean.TRUE);
        findAirPort.put("Paris", Boolean.FALSE);
        findAirPort.put("Berlin", Boolean.TRUE);
        findAirPort.put("Warszawa", Boolean.TRUE);
        findAirPort.put("Munich", Boolean.FALSE);
        findAirPort.put("Frankfurt", Boolean.TRUE);
        findAirPort.put("Madrid", Boolean.TRUE);
        findAirPort.put("Roma", Boolean.FALSE);
        findAirPort.put("Edinburg", Boolean.TRUE);
        findAirPort.put("NewYork", Boolean.TRUE);
        findAirPort.put("Chicago", Boolean.FALSE);
        findAirPort.put("Tokyo", Boolean.TRUE);

        boolean available = false;

        if(findAirPort.containsKey(flight.getArrivalAirport())){

            for(Map.Entry<String, Boolean> entry: findAirPort.entrySet()){

                if (flight.getArrivalAirport().equals(entry.getKey())){
                    available = entry.getValue();
                }
            }
        }else throw new RouteNotFoundException("Airport not found in map");


        return available;

    }
}
