package com.design_patterns.factoryMethod.model;

public class Plane implements Transport {
    @Override
    public void send(String destination) {
        System.out.println("Plane send to " + destination);
    }
}
