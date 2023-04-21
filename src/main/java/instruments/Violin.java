package instruments;

public class Violin extends Instrument {

    private int strings;

    public Violin(double purchasePrice, double salePrice, String manufacturer, int strings) {
        super(purchasePrice, salePrice, InstrumentType.BOWED_STRING, manufacturer);
        this.strings = strings;
    }

    @Override
    public String play() {
        return "think Nicola Benedetti";
    }
}
