package com.design_patterns.factoryMethod.bad;

public class BadCorreios {
    public void groundShipping(String destination) {
        System.out.println("Entregando pacote via terrestre para " + destination);
    }

    public void seaShipping(String destination) {
        System.out.println("Entregando pacote via maritima para " + destination);
    }
}
