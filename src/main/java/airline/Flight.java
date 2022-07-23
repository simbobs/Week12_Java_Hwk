package airline;

import personelle.CabinCrewMember;
import personelle.Passenger;
import personelle.Person;
import personelle.Pilot;


import java.lang.reflect.Array;
import java.util.ArrayList;

public class Flight {

    private final Plane plane;
    private Pilot pilot;
    private ArrayList<CabinCrewMember> cabinCrew;
    private ArrayList<Passenger> passengerList;
    private String flightNo;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Pilot pilot, ArrayList<CabinCrewMember> cabinCrew, ArrayList<Passenger> passengerList, Plane plane, String flightNo, String destination, String deptAirport, String deptTime){
        this.pilot = pilot;
        this.cabinCrew = cabinCrew;
        this.passengerList = passengerList;
        this.plane = plane;
        this.flightNo = flightNo;
        this.destination = destination;
        this.departureAirport = deptAirport;
        this.departureTime = deptTime;


    }


    public Person getPilot() {
        return this.pilot;
    }

    public ArrayList<CabinCrewMember> getCabinCrew() {
        return this.cabinCrew;
    }

    public ArrayList<Passenger> getPassengerList() {
        return this.passengerList;
    }

    public Plane getPlane() {
        return this.plane;
    }

    public String getFlightNo() {
        return this.flightNo;
    }

    public String getDestinationAirport() {
        return this.destination;
    }

    public String getDepartureAirport() {
        return this.departureAirport;
    }

    public String getDepartureTime() {
        return this.departureTime;
    }

    public int getNumSeatsAvailable() {
        return this.plane.getCapacity() - this.passengerList.size();
    }

    public ArrayList<Passenger> AddPassengerToFlight(Passenger passenger) {
        if (this.passengerList.size() < this.plane.getCapacity()) {
            this.passengerList.add(passenger);
        } return this.passengerList;
    }
}
