package com.company;

public class SuperPrinter extends Printer {

    @Override
    public void print() {
        System.out.println("New Hello from FORK!");
    }
}
