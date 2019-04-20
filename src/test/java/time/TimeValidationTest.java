package time;


import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class TimeValidationTest {
TimeValidation timeValid;

    @Before
    public void setUp() throws Exception {
        timeValid = new TimeValidation();
    }

    @Test
    public void isTimeValidTrue() {
        boolean actual = timeValid.isTimeValid(2,20);
        assertTrue(actual);
    }

    @Test
    public void isTimeValidFalse(){
        boolean actual = timeValid.isTimeValid(32,20);
        assertFalse(actual);
    }
}