package cz.osu.student.r19584.kip7tetl.asserts;

public class Factorial {

    public static double factorial(int n) {
        assert n >= 0 : "Factorial input is less than ZERO";

        double ret = 1;
        if (n > 1) {
            ret = n * factorial(n - 1);
            assert ret > 0 : "Factorial output is less than ONE";
            assert !Double.isInfinite(ret) : "Factorial is bigger than double max value";
        }
        return ret;
    }
}
