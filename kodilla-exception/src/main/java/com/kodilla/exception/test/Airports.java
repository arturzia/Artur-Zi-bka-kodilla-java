package com.kodilla.exception.test;

public class Airports {


    public static void main(String[] args) {
        Flight flight = new Flight("Krakow", "Poznan");
        ArrivalAirport arrivalAirport = new ArrivalAirport();

        try{
            boolean findFlight = arrivalAirport.findFlight(flight);
            if(findFlight){
                System.out.println("We fly !!!");
            }else{
                System.out.println("We have to fly somewhere else");
            }
        }catch (RouteNotFoundException e){

            System.out.println("Exception: "+e);
        }
    }
}
