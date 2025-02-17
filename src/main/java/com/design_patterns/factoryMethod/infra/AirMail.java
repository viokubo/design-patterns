package com.design_patterns.factoryMethod.infra;

import com.design_patterns.factoryMethod.model.Helicopter;
import com.design_patterns.factoryMethod.model.Plane;
import com.design_patterns.factoryMethod.model.Transport;
import com.design_patterns.factoryMethod.model.TransportType;

import java.util.Map;

public class AirMail extends Mail {

    private final String transportType;
    private final Map<String, Transport> transportTypes = Map.of(
            "plane", new Plane(),
            "helicopter", new Helicopter()
    );

    public AirMail(TransportType transportType) {
        this.transportType = transportType.name().toLowerCase();
    }

    @Override
    protected Transport createTransport() {
        return transportTypes.get(transportType);
    }
}
