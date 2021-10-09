package point;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {

    @Test
    public void testDistanceDoubleResult() {
        Point pointA = new Point(3.4, 8.0);
        Point pointB = new Point(20.0, 16.7);
        Assert.assertEquals(pointA.distance(pointB), 18.741664813991314);
    }

    // сравнить длину отрезков AB и BA
    @Test
    public void testDistanceMirrorComparison() {
        Point pointA = new Point(3.4, 8.0);
        Point pointB = new Point(20.0, 16.7);

        Double pointAtoB = pointA.distance(pointB);
        Double pointBtoA = pointB.distance(pointA);

        Assert.assertTrue(pointAtoB.equals(pointBtoA));
    }

    @Test
    public void testDistanceZeroXY() {
        Point pointA = new Point(0.0, 0.0);
        Point pointB = new Point(0.0, 0.0);
        Assert.assertEquals(pointA.distance(pointB), 0.0);
    }

    @Test
    public void testDistanceNegativeX() {
        Point pointA = new Point(-10.0, 0.0);
        Point pointB = new Point(5.0, 0.0);
        Assert.assertEquals(pointA.distance(pointB), 15.0);
    }

    @Test
    public void testDistanceNegativeY() {
        Point pointA = new Point(10.0, 4.25);
        Point pointB = new Point(10.0, -4.25);
        Assert.assertEquals(pointA.distance(pointB), 4.25*2);
    }

    @Test
    public void testDistanceSamePoint() {
        Point pointA = new Point(5.0, 3.0);
        Assert.assertEquals(pointA.distance(pointA), 0.0);
    }

}
