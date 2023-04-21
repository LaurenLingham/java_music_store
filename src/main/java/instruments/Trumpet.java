package instruments;

public class Trumpet extends Instrument {

    private String material;
    private int numberOfValves;

    public Trumpet(double purchasePrice, double salePrice, String manufacturer, String material, int numberOfValves) {
        super(purchasePrice, salePrice, InstrumentType.BRASS, manufacturer);
        this.material = material;
        this.numberOfValves = numberOfValves;
    }

    @Override
    public String play() {
        return "think Miles Davis";
    }
}
