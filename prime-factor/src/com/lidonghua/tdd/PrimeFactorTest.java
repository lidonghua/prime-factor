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

    @Test
    public void primeFactorOfThreeIsThree()
    {
        assertEquals(Arrays.asList(3), primeFactor.factor(3));
    }

    @Test
    public void primeFactorsOfFourIsTwoTwos()
    {
        assertEquals(Arrays.asList(2, 2), primeFactor.factor(4));
    }

    @Test
    public void primeFactorsOfALargerNumber()
    {
        assertEquals(Arrays.asList(2, 2, 2, 3, 5, 17, 17, 31), primeFactor.factor(1_075_080));
    }
}
