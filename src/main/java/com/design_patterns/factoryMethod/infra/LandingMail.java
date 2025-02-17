package com.design_patterns.factoryMethod.infra;

import com.design_patterns.factoryMethod.model.Car;
import com.design_patterns.factoryMethod.model.Subway;
import com.design_patterns.factoryMethod.model.Transport;
import com.design_patterns.factoryMethod.model.TransportType;

import java.util.Map;

public class LandingMail extends Mail {

    private final String transportType;
    private final Map<String, Transport> transportTypes = Map.of(
            "subway", new Subway(),
            "car", new Car()
    );

    public LandingMail(TransportType transportType) {
        this.transportType = transportType.name().toLowerCase();
    }

    @Override
    protected Transport createTransport() {
        return transportTypes.get(transportType);
    }
}
