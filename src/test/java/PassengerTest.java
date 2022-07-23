import org.junit.Before;
import org.junit.Test;
import personelle.Passenger;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Simona", 2);
    }

    @Test
    public void canGetName(){
        assertEquals("Simona", passenger.getName());
    }

    @Test
    public void canGetNumberOfBags(){
        assertEquals(2, passenger.getNumOfBags());
    }

}
