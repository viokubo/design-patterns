package com.design_patterns.factoryMethod;

import com.design_patterns.factoryMethod.infra.AirMail;
import com.design_patterns.factoryMethod.infra.LandingMail;
import com.design_patterns.factoryMethod.model.Ship;
import com.design_patterns.factoryMethod.model.TransportType;
import com.design_patterns.factoryMethod.model.Truck;

public class Main {
    public static void main(String[] args) {
        // Bad implementation
        Truck badTruck = new Truck("Rua Joao");
        Ship badShip = new Ship("Rua Gaspar");
        badTruck.delivery();
        badShip.delivery();

        // Good implementation
        AirMail airMail = new AirMail(TransportType.HELICOPTER);
        airMail.send("Rua Gaspar");
        LandingMail landingMail = new LandingMail(TransportType.SUBWAY);
        landingMail.send("Rua Joao");


    }
}
