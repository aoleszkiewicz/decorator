package dekorator;

public class OpcjaZChromowaniem extends OpcjaLakierowania {
    public OpcjaZChromowaniem(LakierowanieSamochodu lakierowanie) {
        super(lakierowanie);
    }

    @Override
    public String getOpis() {
        return super.getOpis() + ", z chromowaniem";
    }

    @Override
    public double getCena() {
        return super.getCena() + 2500.0;
    }
}
