package time;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TimeOfTheYearTest {
    TimeOfTheYear timeOfTheYear;

    @Before
    public void setUp() throws Exception {
        timeOfTheYear = new TimeOfTheYear();
    }

    @Test
    public void isWinter() {
        String expected = "Winter";
        String actual = timeOfTheYear.isTimeOfTheYear(1);
        assertEquals(expected,actual);
    }

    @Test
    public void isSpring(){
        String expected = "Spring";
        String actual = timeOfTheYear.isTimeOfTheYear(4);
        assertEquals(expected,actual);
    }

    @Test
    public void isSummer(){
        String expected = "Summer";
        String actual = timeOfTheYear.isTimeOfTheYear(8);
        assertEquals(expected,actual);
    }

    @Test
    public void isFall(){
        String expected = "Fall";
        String actual = timeOfTheYear.isTimeOfTheYear(9);
        assertEquals(expected,actual);
    }

    @Test
    public void isNotExist(){
        String expected = "Winter";
        String actual = timeOfTheYear.isTimeOfTheYear(467);
        assertNotEquals(expected,actual);
    }
}