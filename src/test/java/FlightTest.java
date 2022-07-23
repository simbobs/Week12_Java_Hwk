import airline.Flight;
import airline.Plane;
import org.junit.Before;
import org.junit.Test;
import personelle.CabinCrewMember;
import personelle.Passenger;
import personelle.Pilot;
import personelle.Rank;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Pilot pilot;
    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;
    ArrayList<CabinCrewMember> cabinCrew;
    ArrayList<Passenger> passengerList;
    Plane plane;
    Passenger passenger1;


    @Before
    public void before(){
        pilot = new Pilot("Bob", Rank.CAPTAIN, "2022G31");
        cabinCrewMember1 = new CabinCrewMember("Louise", Rank.FIRST_OFFICER);
        cabinCrewMember2 = new CabinCrewMember("Simona", Rank.FLIGHT_ATTENDANT);
        cabinCrew = new ArrayList<>();
        cabinCrew.add(cabinCrewMember1);
        cabinCrew.add(cabinCrewMember2);
        passengerList = new ArrayList<>();


        flight = new Flight(pilot, cabinCrew, passengerList, Plane.BOEING737, "FR737", "GLA", "NAP", "12.15");

    }

    @Test
    public void canGetPilot(){
        assertEquals("Bob", flight.getPilot().getName());
    }

    @Test
    public void canGetCabinCrew(){
        assertEquals(2, flight.getCabinCrew().size());
    }

    @Test
    public void canGetPassengerList(){
        assertEquals(passengerList, flight.getPassengerList());
    }

    @Test
    public void canGetPlaneType(){
        assertEquals(Plane.BOEING737, flight.getPlane());
    }

    @Test
    public void canGetFlightNum(){
        assertEquals("FR737", flight.getFlightNo());
    }

    @Test
    public void canGetFlightDestination(){
        assertEquals("GLA", flight.getDestinationAirport());
    }

    @Test
    public void canGetFlightDepartureAirport(){
        assertEquals("NAP", flight.getDepartureAirport());
    }

    @Test
    public void canGetFlightDepartureTime(){
        assertEquals("12.15", flight.getDepartureTime());
    }

    @Test
    public void canGetSeatsAvailable(){
        assertEquals(150, flight.getNumSeatsAvailable());
    }

    @Test
    public void canAddPassengerIfSeatsAvailable(){
        passenger1 = new Passenger("Lorena", 2);
        assertEquals(1, flight.AddPassengerToFlight(passenger1).size());
    }



}
