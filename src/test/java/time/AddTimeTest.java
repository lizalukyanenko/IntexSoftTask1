package time;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddTimeTest {
AddTime addTime;

    @Before
    public void setUp() throws Exception {
        addTime = new AddTime();
    }

    @Test
    public void addMinute() {
        String expected = "{"+3+":"+20+"}";
        String actual = addTime.addMinute(0,50,150);
        assertEquals(expected,actual);
    }
}