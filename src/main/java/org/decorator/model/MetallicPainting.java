package org.decorator.model;

import org.decorator.interfaces.ICarPainting;

public final class MetallicPainting extends PaintOption {
    public MetallicPainting(ICarPainting carPainting) {
        super(carPainting);
    }

    @Override
    public String getDescription() {
        return this.carPainting.getDescription() + "metallic painting";
    }

    @Override
    public double getPrice() {
        return this.carPainting.getPrice() + 500.0;
    }
}
