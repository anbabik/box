package point;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {

    @Test
    public void testDistance() {
        Point pointA = new Point(0.0, 0.0);
        Point pointB = new Point(0.0, 0.0);

        Assert.assertEquals(pointA.distance(pointB), 0.0);

    }
}
