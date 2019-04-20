package mathematics;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Point2GoalTest {

    Point2Goal point;

    @Before
    public void setUp() throws Exception {
        point = new Point2Goal();
    }

    @Test
    public void isHitCircle() {
        boolean actual = point.isHitCircle(2,4);
        assertTrue(actual);
    }

    /*@Test
    public void isHitRectangle() {
    }*/
}