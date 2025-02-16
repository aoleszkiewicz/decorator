package org.decorator;

import org.decorator.interfaces.ICarPainting;
import org.decorator.model.ChromaticPainting;
import org.decorator.model.FireEmblemPainting;
import org.decorator.model.MetallicPainting;
import org.decorator.model.PassengerCarPainting;

public class Main {
    public static void main(String[] args) {
        ICarPainting carPainting;

        // Create passenger car object
        carPainting = new PassengerCarPainting();

        // Pass current painting object as ref for various options
        carPainting = new MetallicPainting(carPainting);
        carPainting = new ChromaticPainting(carPainting);
        carPainting = new FireEmblemPainting(carPainting);

//        System.out.println(carPainting.getDescription() + " " + carPainting.getPrice());
    }
}
