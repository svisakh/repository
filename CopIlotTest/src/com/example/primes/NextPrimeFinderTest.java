package com.example.primes;

public class NextPrimeFinderTest {
    public static void main(String[] args) {
        int[] tests = { -5, 0, 1, 2, 3, 14, 17, 100, 1000, 1000000, Integer.MAX_VALUE - 10 };
        for (int t : tests) {
            try {
                int p = NextPrimeFinder.nextPrime(t);
                System.out.printf("nextPrime(%d) = %d\n", t, p);
            } catch (IllegalArgumentException e) {
                System.out.printf("nextPrime(%d) -> error: %s\n", t, e.getMessage());
            }
        }

        // sanity check near Integer.MAX_VALUE
        int near = Integer.MAX_VALUE - 1000;
        try {
            int p = NextPrimeFinder.nextPrime(near);
            System.out.printf("nextPrime(%d) = %d\n", near, p);
        } catch (Exception e) {
            System.out.printf("nextPrime(%d) -> %s\n", near, e.toString());
        }
    }
}
