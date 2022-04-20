package com.company;

public class Sportscar extends Vehicle {

    private boolean aspirated;

    public Sportscar() {
        super();
        aspirated = false;
    }

    public Sportscar(String color, int year, boolean aspiration) {
        super(color, year);
        this.aspirated = aspiration;
    }

    @Override
    public String toString() {

        return super.toString() + ", Aspiration = " + aspirated;
    }

    public void move() {
        System.out.println("VROOOM");
    }
}
