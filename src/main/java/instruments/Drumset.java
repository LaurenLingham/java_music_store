package instruments;

public class Drumset extends Instrument{

    private int numberOfDrums;
    private String colour;

    public Drumset(String manufacturer, double purchasePrice, double salePrice, int numberOfDrums, String colour) {
        super(purchasePrice, salePrice, InstrumentType.PERCUSSION, manufacturer);
        this.numberOfDrums = numberOfDrums;
        this.colour = colour;
    }

    public int getNumberOfDrums() {
        return numberOfDrums;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String play() {
        return "think Travis Barker";
    }
}
