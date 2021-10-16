package cz.osu.student.r19584.kip7tetl.unitTests;

import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;

public class ArrayUtilsTest {
    ArrayUtils au;

    @Before
    public void setUp() {
        au = new ArrayUtils();
    }

    @Test
    public void testGetMeanDouble() {
        double[] data = new double[] { 1.0, 1.0, 2.0, 2.0, 3.0, 3.0, 4.0, 4.0, 5.0, 5.0, 6.0, 6.0 };
        double exp = 3.5;
        double act = au.getMean(data);

        Assert.assertEquals(exp, act, 0.0000);
    }

    @Test
    public void testGetMeanInt() {
        int[] data = new int[] { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6 };
        double exp = 3.5;
        double act = au.getMean(data);
        Assert.assertEquals(exp, act, 0.0000);
    }

    @Test
    public void testGetStandardDeviationDouble() {
        double[] data = new double[] { 1.0, 1.0, 2.0, 2.0, 3.0, 3.0, 4.0, 4.0, 5.0, 5.0, 6.0, 6.0 };
        double exp = 1.7837651700316894;
        double act = au.getStandardDeviation(data);
        Assert.assertEquals(exp, act, 0.0000);
    }

    @Test
    public void testGetStandardDeviationInt() {
        int[] data = new int[] { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6 };
        double exp = 1.7837651700316894;
        double act = au.getStandardDeviation(data);
        Assert.assertEquals(exp, act, 0.0000);
    }
}
