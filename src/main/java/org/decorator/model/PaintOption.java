package org.decorator.model;

import org.decorator.interfaces.ICarPainting;

public abstract class PaintOption implements ICarPainting {
    ICarPainting carPainting;

    public PaintOption(ICarPainting carPainting) {
        this.carPainting = carPainting;
    }

    @Override
    public String getDescription() {
        return this.carPainting.getDescription();
    }

    @Override
    public double getPrice() {
        return this.carPainting.getPrice();
    }
}
