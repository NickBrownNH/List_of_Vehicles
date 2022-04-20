package com.company;

import java.util.ArrayList;

/**
 * Driver for linked list of vehicles
 */
public class Main {

    public static void main(String[] args) {
        Vehicle[] v = new Vehicle[200];
        v[0] = new Vehicle();

        ArrayList<Vehicle> vList = new ArrayList<>();

    LinkedList<Submarine> subList = new LinkedList<>();
    subList.addFirst(new Submarine("Yellow",1968,420));
    subList.addLast(new Submarine("Rainbow",3000,999));
    subList.addFirst(new Submarine());
    System.out.println(subList);
    subList.removeLast();
    System.out.println(subList.isEmpty());
    System.out.println(subList);

    }
}
