package com.epam.impl;

import com.epam.Calculator;

import java.math.BigDecimal;

/**
 * Created by Anton_Spirchonak on 9/4/2014.
 */
public class BigDecimalCalculator implements Calculator<BigDecimal> {

    @Override
    public Long add(Long first, Long second) {
        return first + second;
    }

    @Override
    public Long diff(Long first, Long second) {
        return first - second;
    }

    @Override
    public BigDecimal multiple(BigDecimal first, BigDecimal second) {
        return first.multiply(second);
    }

    @Override
    public BigDecimal divide(BigDecimal first, BigDecimal second) {
        return first.divide(second);
    }
}
