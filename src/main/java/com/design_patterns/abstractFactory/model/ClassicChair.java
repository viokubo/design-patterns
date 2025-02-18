package com.design_patterns.abstractFactory.model;

public class ClassicChair implements Chair {
    @Override
    public void craft() {
        System.out.println("Classic Chair craft");
    }
}
