package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public abstract class Instrument extends SaleItem implements IPlay, ISell {
    private InstrumentType type;
    private String manufacturer;

    public Instrument(double purchasePrice, double salePrice, InstrumentType type, String manufacturer) {
        super(purchasePrice, salePrice);
        this.type = type;
        this.manufacturer = manufacturer;
    }

    public InstrumentType getType() {
        return type;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
