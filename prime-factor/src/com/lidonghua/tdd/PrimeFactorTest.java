package com.lidonghua.tdd;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;

public class PrimeFactorTest
{
    private final PrimeFactor primeFactor = new PrimeFactor();

    @Test
    public void primeFactorOfZeroIsNothing()
    {
        assertEquals(Arrays.asList(), primeFactor.factor(0));
    }

    @Test
    public void primeFactorOfTwoIsTwo()
    {
        assertEquals(Arrays.asList(2), primeFactor.factor(2));
    }
}
