package com.lidonghua.tdd;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor
{
    public List<Integer> factor(int number)
    {
        ArrayList<Integer> primeFactors = new ArrayList<>();
        for (int factor = 2; number > 1; factor++)
            for ( ; number % factor == 0; number /= factor)
                primeFactors.add(factor);
        return primeFactors;
    }
}
