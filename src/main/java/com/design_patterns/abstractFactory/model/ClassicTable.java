package com.design_patterns.abstractFactory.model;

public class ClassicTable implements Table {
    @Override
    public void craft() {
        System.out.println("Classic Table craft");
    }
}
