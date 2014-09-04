package com.company;

public class Main {

    public static void main(String[] args) {
        Printer printer=new Printer();
        printer.print();
        System.out.println("Done!");
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Griffins come");
            }
        });
        thread.start();
    }
}
