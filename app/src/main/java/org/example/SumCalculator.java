package org.example;

public class SumCalculator {
    public static int sum(int n) {
        if (n<1){
            throw new IllegalArgumentException("The number must be greater than zero");
        }
        return (int) ((1 + n) * ((float)n / 2));
    }
}
