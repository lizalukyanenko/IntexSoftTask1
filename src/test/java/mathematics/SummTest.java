package mathematics;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SummTest {
    Summ summ;

    @Before
    public void setUp() throws Exception {
        summ = new Summ();
    }

    @Test
    public void getSummTrue() {
        int expected = 21;
        int actual = summ.getSumm(6);
        assertEquals(expected,actual);
    }

    @Test
    public void getSummFalse() {
        int expected = 22;
        int actual = summ.getSumm(6);
        assertNotEquals(expected,actual);
    }
}