package com.lidonghua.tdd;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor
{
    public List<Integer> factor(int number)
    {
        ArrayList<Integer> primeFactors = new ArrayList<>();
        if (number > 1)
            primeFactors.add(number);
        return primeFactors;
    }
}
