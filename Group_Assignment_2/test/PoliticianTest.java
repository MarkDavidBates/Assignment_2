import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PoliticianTest {

    private Politician poli1;

    @Before
    public void setUp() throws Exception {
        poli1 = new Politician("Mark", "03/02/01", "independent", "Tipperary");
    }

    @Test
    public void testConstructor(){
        assertEquals("Mark", poli1.getName());
        assertEquals("03/02/01", poli1.getDob());
        assertEquals("independent", poli1.getParty());
        assertEquals("Tipperary", poli1.getCounty());
    }

    @Test
    public void testSettersGetters(){
        assertEquals("Mark", poli1.getName());
        poli1.setName("David");
        assertEquals("David", poli1.getName());
        poli1.setName("AAAAAAAAAAAAAAAAAAAAAAAA");
        assertEquals("AAAAAAAAAAAAAAAAAAAAAAAA", poli1.getName());

        assertEquals("03/02/01", poli1.getDob());
        poli1.setDob("05/01/99");
        assertEquals("05/01/99", poli1.getDob());
        poli1.setDob("AAAAAAAAAAAAAAAAAAAAAAAA");
        assertEquals("AAAAAAAAAAAAAAAAAAAAAAAA", poli1.getDob());

        assertEquals("independent", poli1.getParty());
        poli1.setParty("Labour");
        assertEquals("Labour", poli1.getParty());
        poli1.setParty("AAAAAAAAAAAAAAAAAAAAAAAA");
        assertEquals("AAAAAAAAAAAAAAAAAAAAAAAA", poli1.getParty());

        assertEquals("Tipperary", poli1.getCounty());
        poli1.setCounty("Waterford");
        assertEquals("Waterford", poli1.getCounty());
        poli1.setCounty("AAAAAAAAAAAAAAAAAAAAAAAA");
        assertEquals("AAAAAAAAAAAAAAAAAAAAAAAA", poli1.getCounty());
    }

    @Test
    public void testToString(){
        assertTrue(poli1.toString().contains("Name: "));
        assertTrue(poli1.toString().contains(", Date of Birth: "));
        assertTrue(poli1.toString().contains(", Party: "));
        assertTrue(poli1.toString().contains(", County: "));
    }
}
