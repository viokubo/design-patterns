package com.design_patterns.factoryMethod.model;

import com.design_patterns.factoryMethod.bad.BadCorreios;

public class Ship {

    private final String destination;

    public Ship(String destination) {
        this.destination = destination;
    }

    public void delivery() {
        BadCorreios correios = new BadCorreios();
        correios.seaShipping(destination);
    }
}

