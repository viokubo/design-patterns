package com.design_patterns.factoryMethod.model;

public class Car implements Transport {
    @Override
    public void send(String destination) {
        System.out.println("Car sends to " + destination);
    }
}
