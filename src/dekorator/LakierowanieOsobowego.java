package dekorator;

public class LakierowanieOsobowego implements LakierowanieSamochodu {
    @Override
    public String getOpis() {
        return "Lakierowanie samochodu osobowego";
    }

    @Override
    public double getCena() {
        return 3750.0;
    }
}

