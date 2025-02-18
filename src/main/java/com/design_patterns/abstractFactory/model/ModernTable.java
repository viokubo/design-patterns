package com.design_patterns.abstractFactory.model;

public class ModernTable implements Table{
    @Override
    public void craft() {
        System.out.println("Modern Table craft");
    }
}
