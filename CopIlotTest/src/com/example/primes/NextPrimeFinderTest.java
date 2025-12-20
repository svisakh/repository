package com.example.primes;

public final class NextPrimeFinderTest {
    public static void main(final String[] args) {
        if (args == null) {
            throw new IllegalArgumentException("Arguments cannot be null");
        }
        final int[] tests = { -5, 0, 1, 2, 3, 14, 17, 100, 1000, 1000000, Integer.MAX_VALUE - 10 };
        for (final int t : tests) {
            try {
                final int p = NextPrimeFinder.nextPrime(t);
                System.out.printf("nextPrime(%d) = %d\n", t, p);
            } catch (final IllegalArgumentException e) {
                System.out.printf("nextPrime(%d) -> error: %s\n", t, e.getMessage());
            }
        }

        // sanity check near Integer.MAX_VALUE
        final int near = Integer.MAX_VALUE - 1000;
        try {
            final int p = NextPrimeFinder.nextPrime(near);
            System.out.printf("nextPrime(%d) = %d\n", near, p);
        } catch (final Exception e) {
            System.out.printf("nextPrime(%d) -> %s\n", near, e.toString());
        }
    }
}
