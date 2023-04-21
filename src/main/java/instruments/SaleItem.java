package instruments;

import behaviours.ISell;

public abstract class SaleItem implements ISell {

    private double boughtPrice;
    private double salePrice;

    public SaleItem(double boughtPrice, double salePrice) {
        this.boughtPrice = boughtPrice;
        this.salePrice = salePrice;
    }

    @Override
    public double getBoughtPrice() {
        return boughtPrice;
    }

    @Override
    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    @Override
    public double calculateMarkup() {
        return salePrice - boughtPrice;
    }
}
