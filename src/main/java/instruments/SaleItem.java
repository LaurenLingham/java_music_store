package instruments;

import behaviours.ISell;

public abstract class SaleItem implements ISell {

    private double purchasePrice;
    private double salePrice;

    public SaleItem(double purchasePrice, double salePrice) {
        this.purchasePrice = purchasePrice;
        this.salePrice = salePrice;
    }

    @Override
    public double getPurchasePrice() {
        return purchasePrice;
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
        return salePrice - purchasePrice;
    }
}
