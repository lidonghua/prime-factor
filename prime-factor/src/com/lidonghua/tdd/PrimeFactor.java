package com.lidonghua.tdd;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor
{
    public List<Integer> factor(int number)
    {
        ArrayList<Integer> primeFactors = new ArrayList<>();
        if (number < 2)
            return primeFactors;
        int factor = 2;
        while (number > 1)
        {
            while (number % factor == 0)
            {
                primeFactors.add(factor);
                number /= factor;
            }
            factor++;
        }
        return primeFactors;
    }
}
