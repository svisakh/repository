package com.example.primes;

/**
 * Utility to find the next prime number after a given integer.
 *
 * Contract:
 * - Input: any 32-bit signed int
 * - Output: the smallest prime strictly greater than the input, as an int
 * - Error modes: throws IllegalArgumentException if there is no next prime within int range
 */
public final class NextPrimeFinder {

    private NextPrimeFinder() { }

    /**
     * Return the smallest prime strictly greater than {@code n}.
     * If n &lt; 2 the method returns 2. If no prime exists within the int range
     * (very large inputs near Integer.MAX_VALUE) an IllegalArgumentException is thrown.
     *
     * @param n input integer
     * @return next prime strictly greater than n
     */
    public static int nextPrime(final int n) {
        long candidate = (long) n + 1L;
        if (candidate <= 2) {
            return 2;
        }
        // ensure candidate is odd if >2
        if (candidate % 2 == 0) {
            if (candidate == 2) return 2; // rare
            candidate++;
        }

        while (candidate <= Integer.MAX_VALUE) {
            if (isPrime(candidate)) {
                return (int) candidate;
            }
            candidate += 2; // skip even numbers
        }
        throw new IllegalArgumentException("No next prime within int range for input: " + n);
    }

    // simple deterministic primality test for positive numbers
    private static boolean isPrime(long x) {
        if (x < 2) return false;
        if (x == 2 || x == 3) return true;
        if (x % 2 == 0) return false;
        final long r = (long) Math.sqrt(x);
        for (long i = 3; i <= r; i += 2) {
            if (x % i == 0) return false;
        }
        return true;
    }
}
