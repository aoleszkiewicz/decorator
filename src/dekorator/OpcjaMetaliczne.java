package dekorator;

public class OpcjaMetaliczne extends OpcjaLakierowania {
    public OpcjaMetaliczne(LakierowanieSamochodu lakierowanie) {
        super(lakierowanie);
    }

    @Override
    public String getOpis() {
        return super.getOpis() + ", metaliczne";
    }

    @Override
    public double getCena() {
        return super.getCena() + 600.0;
    }
}
