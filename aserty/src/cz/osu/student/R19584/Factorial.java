package cz.osu.student.R19584;

public class Factorial {

    public static double factorial(int n) {

        // kontrola, že vstup je nula nebo kladné číslo
        assert n >= 0 : "Factorial input is less than ZERO";

        double ret = 1;
        if(n > 1) {
            ret = n * factorial(n - 1);

            // kontrola, že výsledek je kladné číslo
            assert ret > 0 : "Factorial output is less than ONE";

            // kontrola, že výsledek není nekonečno
            assert !Double.isInfinite(ret) : "Factorial is bigger than double max value";
        }

        return ret;
    }
}
