package com.example.primes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit 5 tests for NextPrimeFinder.
 * Place this file under your test source root (maven/gradle: src/test/java) and run with JUnit 5.
 */
public final class NextPrimeFinderJUnitTest {

    @Test
    public final void testSmallNumbers() {
        assertEquals(2, NextPrimeFinder.nextPrime(-10));
        assertEquals(2, NextPrimeFinder.nextPrime(0));
        assertEquals(2, NextPrimeFinder.nextPrime(1));
        assertEquals(3, NextPrimeFinder.nextPrime(2));
        assertEquals(5, NextPrimeFinder.nextPrime(3));
    }

    @Test
    public final void testTypicalCases() {
        assertEquals(17, NextPrimeFinder.nextPrime(14));
        assertEquals(19, NextPrimeFinder.nextPrime(17));
        assertEquals(101, NextPrimeFinder.nextPrime(100));
        assertEquals(1009, NextPrimeFinder.nextPrime(1000));
        assertEquals(1000003, NextPrimeFinder.nextPrime(1000000));
    }

    @Test
    public final void testEdgeNearIntegerMax() {
        // next prime after 2147483637 is 2147483647 (Integer.MAX_VALUE)
        assertEquals(2147483647, NextPrimeFinder.nextPrime(2147483637));
    }

    @Test
    public final void testThrowsWhenNoPrimeRemaining() {
        // If we pass Integer.MAX_VALUE the method searches > Integer.MAX_VALUE and should throw
        assertThrows(IllegalArgumentException.class, () -> NextPrimeFinder.nextPrime(Integer.MAX_VALUE));
    }
}
