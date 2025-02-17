package com.design_patterns.factoryMethod.infra;

import com.design_patterns.factoryMethod.model.Transport;

public abstract class Mail {

    public void send(String destination) {
        Transport transport = createTransport();
        transport.send(destination);
    }

    protected abstract Transport createTransport();
}
