/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.logic;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;

public class FlightControl {
    private HashMap<String, Airplane> airplanes;
    private HashMap<String, Flight> flights;
    private Map<String, Place> places;
    
    public FlightControl() {
        this.airplanes = new HashMap<>();
        this.flights = new HashMap<>();
        this.places = new HashMap<>();
    }
    
    public void addAirplane(String id, int capacity) {
        this.airplanes.put(id, new Airplane(id, capacity));
    }
    
    public void addFlight(Airplane plane, String departureID, String targetID) {
        this.places.putIfAbsent(departureID, new Place(departureID));
        this.places.putIfAbsent(targetID, new Place(targetID));
        
        Flight flight = new Flight(plane, this.places.get(departureID), this.places.get(targetID));
        this.flights.put(flight.toString(), flight);
    }
    
    public Collection<Airplane> getAirplanes() {
        return this.airplanes.values();
    }
    
    public Collection<Flight> getFlights() {
        return this.flights.values();
    }
    
    public Airplane getAirplane(String id) {
        return this.airplanes.get(id);
    }
}
