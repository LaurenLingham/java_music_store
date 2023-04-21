package instruments;

public class Guitar extends Instrument {

    private int strings;
    private String guitarType;
    private String colour;

    public Guitar(double boughtPrice, double salePrice, String manufacturer, int strings, String guitarType, String colour) {
        super(boughtPrice, salePrice, InstrumentType.GUITAR, manufacturer);
        this.strings = strings;
        this.guitarType = guitarType;
        this.colour = colour;
    }

    @Override
    public String play() {
        return "think Jimi Hendrix";
    }
}
