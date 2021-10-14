package cz.osu.student.R19584;

import static org.junit.jupiter.api.Assertions.*;

class ArrayUtilsTest {

    ArrayUtils au = new ArrayUtils();

    @org.junit.jupiter.api.Test
    void testGetMeanDouble() {
        //double[] data = new double[] { };
        double[] data = new double[] {1.0, 1.0, 2.0, 2.0, 3.0, 3.0, 4.0, 4.0, 5.0, 5.0, 6.0, 6.0};
        double exp = 3.5;
        double act = au.getMean(data);
        assertEquals(exp, act);
    }

    @org.junit.jupiter.api.Test
    void testGetMeanInt() {
        //int[] data = new int[] { };
        int[] data = new int[] {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6};
        double exp = 3.5;
        double act = au.getMean(data);
        assertEquals(exp, act);
    }

    @org.junit.jupiter.api.Test
    void testGetStandardDeviationDouble() {
        //double[] data = new double[] { };
        double[] data = new double[] {1.0, 1.0, 2.0, 2.0, 3.0, 3.0, 4.0, 4.0, 5.0, 5.0, 6.0, 6.0};
        double exp = 1.7837651700316894;
        double act = au.getStandardDeviation(data);
        assertEquals(exp, act);
    }

    @org.junit.jupiter.api.Test
    void testGetStandardDeviationInt() {
        //int[] data = new int[] { };
        int[] data = new int[] {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6};
        double exp = 1.7837651700316894;
        double act = au.getStandardDeviation(data);
        assertEquals(exp, act);
    }
}