package com.design_patterns.factoryMethod.model;

public class Helicopter implements Transport {
    @Override
    public void send(String destination) {
        System.out.println("Helicopter sends to " + destination);
    }
}
