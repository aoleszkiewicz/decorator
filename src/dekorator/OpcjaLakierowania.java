package dekorator;

public abstract class OpcjaLakierowania implements LakierowanieSamochodu {
    protected LakierowanieSamochodu lakierowanieSamochodu;

    public OpcjaLakierowania(LakierowanieSamochodu lakierowanieSamochodu) {
        this.lakierowanieSamochodu = lakierowanieSamochodu;
    }

    @Override
    public String getOpis() {
        return lakierowanieSamochodu.getOpis();
    }

    @Override
    public double getCena() {
        return lakierowanieSamochodu.getCena();
    }
}

