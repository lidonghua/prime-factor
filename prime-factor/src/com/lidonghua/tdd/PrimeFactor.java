package com.lidonghua.tdd;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor
{
    public List<Integer> factor(int number)
    {
        ArrayList<Integer> primeFactors = new ArrayList<>();
        if (number == 2)
            primeFactors.add(2);
        return primeFactors;
    }
}
