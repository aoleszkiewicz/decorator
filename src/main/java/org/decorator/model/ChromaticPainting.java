package org.decorator.model;

import org.decorator.interfaces.ICarPainting;

public final class ChromaticPainting extends PaintOption {
    public ChromaticPainting(ICarPainting carPainting) {
        super(carPainting);
    }

    @Override
    public String getDescription() {
        return this.carPainting.getDescription() + "chromatic painting";
    }

    @Override
    public double getPrice() {
        return this.carPainting.getPrice() + 5000.0;
    }
}
