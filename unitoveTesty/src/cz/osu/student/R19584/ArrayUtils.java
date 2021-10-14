package cz.osu.student.R19584;

import java.util.HashMap;

public class ArrayUtils {

    double getMean(double[] data) {
        assert data.length > 0 : "getMean: Input array empty";
        double sum = 0;
        for(double value : data) sum += value;
        return sum / data.length;
    }

    double getMean(int[] data) {
        assert data.length > 0 : "getMean: Input array empty";
        int sum = 0;
        for(int value : data) sum += value;
        return sum * 1.0 / data.length;
    }

    double getStandardDeviation(double[] data) {
        assert data.length > 0 : "getStandardDeviation: Input array empty";
        HashMap<Double, Integer> n = new HashMap<>();

        for(double value : data) {
            if(n.containsKey(value)) n.replace(value, n.get(value) + 1);
            else n.put(value, 1);
        }

        double mean = getMean(data);

        double num = 0;
        for(double value : n.keySet()) num += Math.pow(value - mean, 2) * n.get(value);
        return Math.sqrt(num / (data.length - 1));
    }

    double getStandardDeviation(int [] data) {
        assert data.length > 0 : "getStandardDeviation: Input array empty";
        HashMap<Integer, Integer> n = new HashMap<>();

        for(int value : data) {
            if(n.containsKey(value)) n.replace(value, n.get(value) + 1);
            else n.put(value, 1);
        }

        double mean = getMean(data);

        double num = 0;
        for(int value : n.keySet()) num += Math.pow(value - mean, 2) * n.get(value);
        return Math.sqrt(num / (data.length - 1));
    }
}
