import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import sample.Election;

public class ElectionTest {

    private Election elec1;

    @Before
    public void setUp() throws Exception {
        elec1 = new Election("local", "waterford", 2000, 1);
    }

    @Test
    public void testConstructor(){
        assertEquals("local", elec1.getElectionType());
        assertEquals("waterford", elec1.getLocation());
        assertEquals(2000, elec1.getYear());
        assertEquals(1, elec1.getSeats());
    }

    @Test
    public void testSettersGetters(){
        assertEquals("local", elec1.getElectionType());
        elec1.setElectionType("general");
        assertEquals("general", elec1.getElectionType());
        elec1.setElectionType("");
        assertEquals("", elec1.getElectionType());

        assertEquals("waterford", elec1.getLocation());
        elec1.setElectionType("tipperary");
        assertEquals("tipperary", elec1.getLocation());
        elec1.setElectionType("");
        assertEquals("", elec1.getLocation());

        assertEquals(2000, elec1.getYear());
        elec1.setYear(2020);
        assertEquals(2020, elec1.getYear());
        elec1.setYear(2150);
        assertEquals(2150, elec1.getYear());

        assertEquals(1, elec1.getSeats());
        elec1.setSeats(5);
        assertEquals(5, elec1.getSeats());
        elec1.setSeats(0);
        assertEquals(0, elec1.getSeats());
    }

    @Test
    public void testToString(){
        assertTrue(elec1.toString().contains("Election Type: "));
        assertTrue(elec1.toString().contains("Location: "));
        assertTrue(elec1.toString().contains("Year: "));
        assertTrue(elec1.toString().contains("Number of Seats: "));
    }
}