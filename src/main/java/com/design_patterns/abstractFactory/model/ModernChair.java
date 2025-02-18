package com.design_patterns.abstractFactory.model;

public class ModernChair implements Chair {
    @Override
    public void craft() {
        System.out.println("Modern Chair craft");
    }
}
