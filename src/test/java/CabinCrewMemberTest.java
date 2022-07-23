import org.junit.Before;
import org.junit.Test;
import personelle.CabinCrewMember;
import personelle.Rank;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrew;

    @Before
    public void before(){
        cabinCrew = new CabinCrewMember("Louise", Rank.FLIGHT_ATTENDANT);
    }

    @Test
    public void canGetName() {
        assertEquals("Louise", cabinCrew.getName());
    }

    @Test
    public void canGetRank(){
        assertEquals(Rank.FLIGHT_ATTENDANT, cabinCrew.getRank());
    }

    @Test
    public void canRelayMessageToPassengers(){
        assertEquals("The pilot has switched on the fasten seatbelt sign", cabinCrew.talkToPassengers());
    }






}
