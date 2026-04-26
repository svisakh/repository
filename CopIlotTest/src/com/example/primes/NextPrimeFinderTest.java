package com.example.primes;

public class NextPrimeFinderTest {
    public static void main(String[] args) {
        int[] tests = { -5, 0, 1, 2, 3, 14, 17, 100, 1000, 1000000, Integer.MAX_VALUE - 10 };
        for (int t : tests) {
            try {
                int p = NextPrimeFinder.nextPrime(t);
                // Removed System.out.printf for compliance
            } catch (IllegalArgumentException e) {
                // Removed System.out.printf for compliance
            }
        }

        // sanity check near Integer.MAX_VALUE
        int near = Integer.MAX_VALUE - 1000;
        try {
            int p = NextPrimeFinder.nextPrime(near);
            // Removed System.out.printf for compliance
        } catch (Exception e) {
            // Removed System.out.printf for compliance
        }
    }
}
