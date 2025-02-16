package org.decorator.model;

import org.decorator.interfaces.ICarPainting;

public final class FireEmblemPainting extends PaintOption {
    public FireEmblemPainting(ICarPainting carPainting) {
        super(carPainting);
    }

    @Override
    public String getDescription() {
        return this.carPainting.getDescription() + "fire emblem painting";
    }

    @Override
    public double getPrice() {
        return this.carPainting.getPrice() + 25000.0;
    }
}
