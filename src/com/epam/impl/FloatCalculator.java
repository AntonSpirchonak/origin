package com.epam.impl;

import com.epam.Calculator;

/**
 * Created by Anton_Spirchonak on 9/3/2014.
 */
public class FloatCalculator implements Calculator<Double> {
    @Override
    public Long add(Long first, Long second) {
        return first + second;
    }

    @Override
    public Long diff(Long first, Long second) {
        return first + second;
    }

    @Override
    public Double multiple(Double first, Double second) {
        return first * second;
    }

    @Override
    public Double divide(Double first, Double second) {
        return first / second;
    }
}
