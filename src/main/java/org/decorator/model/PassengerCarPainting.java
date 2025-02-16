package org.decorator.model;

import org.decorator.interfaces.ICarPainting;

public class PassengerCarPainting implements ICarPainting {
    @Override
    public String getDescription() {
        return "Painting a passenger car";
    }

    @Override
    public double getPrice() {
        return 2500.0;
    }
}
