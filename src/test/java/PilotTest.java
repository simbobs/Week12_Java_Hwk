import airline.Plane;
import org.junit.Before;
import org.junit.Test;
import personelle.Pilot;
import personelle.Rank;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;
    Plane plane;

    @Before
    public void before(){

        pilot = new Pilot("Dev", Rank.FIRST_OFFICER, "2022G31");
    }

    @Test
    public void canGetName(){
        assertEquals("Dev", pilot.getName());
    }

    @Test
    public void canGetLicense(){
        assertEquals("2022G31", pilot.getLicense());
    }

    @Test
    public void canFlyPlane(){
        plane = Plane.BOEING737;
        assertEquals("The capacity of this plane is 150", pilot.flyPlane(plane));
    }






}
