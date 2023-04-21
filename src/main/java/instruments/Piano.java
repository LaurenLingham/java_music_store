package instruments;

public class Piano extends Instrument {

    private int numberOfKeys;
    private String colour;

    public Piano(double purchasePrice, double salePrice, String manufacturer, int numberOfKeys, String colour) {
        super(purchasePrice, salePrice, InstrumentType.KEYBOARD, manufacturer);
        this.numberOfKeys = numberOfKeys;
        this.colour = colour;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String play() {
        return "think Elton John";
    }
}
