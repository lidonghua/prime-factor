package com.lidonghua.tdd;

import org.testng.annotations.Test;

public class PrimeFactorTest
{
    private final PrimeFactor primeFactor = new PrimeFactor();

    @Test
    public void primeFactorOfZeroIsNothing()
    {
        primeFactor.factor();
    }
}
