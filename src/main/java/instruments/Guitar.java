package instruments;

public class Guitar extends Instrument {

    private int strings;
    private String guitarType;
    private String colour;

    public Guitar(double purchasePrice, double salePrice, String manufacturer, int strings, String guitarType, String colour) {
        super(purchasePrice, salePrice, InstrumentType.GUITAR, manufacturer);
        this.strings = strings;
        this.guitarType = guitarType;
        this.colour = colour;
    }

    @Override
    public String play() {
        return "think Jimi Hendrix";
    }
}
