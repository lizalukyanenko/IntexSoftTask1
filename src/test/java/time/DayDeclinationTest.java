package time;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DayDeclinationTest {
DayDeclination declination;
    @Before
    public void setUp() throws Exception {
        declination = new DayDeclination();
    }

    @Test
    public void decllination1() {
        String expected = "День";
        String actual = declination.isDecllination(1);
        assertEquals(expected,actual);
    }

    public void decllination2To4() {
        String expected = "Дня";
        String actual = declination.isDecllination(3);
        assertEquals(expected,actual);
    }

    public void decllination0And5AndMore() {
        String expected = "Дней";
        String actual = declination.isDecllination(126);
        assertEquals(expected,actual);
    }

    public void decllinationNoOne() {
        String expected = "Дней";
        String actual = declination.isDecllination(126);
        assertNotEquals(expected,actual);
    }
}