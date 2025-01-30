package dekorator;

public class OpcjaZPlomieniami extends OpcjaLakierowania {
    public OpcjaZPlomieniami(LakierowanieSamochodu lakierowanie) {
        super(lakierowanie);
    }

    @Override
    public String getOpis() {
        return super.getOpis() + ", ozdobione płomieniami";
    }

    @Override
    public double getCena() {
        return super.getCena() + 1300;
    }
}
