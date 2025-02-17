package com.design_patterns.factoryMethod.model;

public class Subway implements Transport {
    @Override
    public void send(String destination) {
        System.out.println("Subway sends to " + destination);
    }
}
