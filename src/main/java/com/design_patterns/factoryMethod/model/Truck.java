package com.design_patterns.factoryMethod.model;

import com.design_patterns.factoryMethod.bad.BadCorreios;

public class Truck {

    private final String destination;

    public Truck(String destination) {
        this.destination = destination;
    }

    public void delivery() {
        BadCorreios correios = new BadCorreios();
        correios.groundShipping(this.destination);
    }
}
