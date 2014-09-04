package com.epam;

import com.epam.impl.DoubleCalculator;
import com.epam.impl.FloatCalculator;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Application run!");
        System.out.println("Divide 5/3:");
        System.out.println("Double calc:" + new DoubleCalculator().divide(5.0, 3.0));
        System.out.println("Float calc" + new FloatCalculator().divide(5.0, 3.0));
    }
}
