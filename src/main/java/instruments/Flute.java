package instruments;

public class Flute extends Instrument {

    private String material;

    public Flute(double purchasePrice, double salePrice, String manufacturer, String material) {
        super(purchasePrice, salePrice, InstrumentType.WOODWIND, manufacturer);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String play() {
        return "think James Galway";
    }
}
