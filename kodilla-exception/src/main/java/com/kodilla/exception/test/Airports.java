package com.kodilla.exception.test;

public class Airports {


    public static void main(String[] args) {
        Flight flight = new Flight("Krakow", "Poznan");
        FindAirport findAirport = new FindAirport();

        try{
            boolean findFlight = findAirport.findFlight(flight);
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
