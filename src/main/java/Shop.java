import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;
    private double till;

    public Shop(double till) {
        this.stock = new ArrayList<ISell>();
        this.till = till;
    }

    public ArrayList<ISell> getStock() {
        return this.stock;
    }

    public int getNumberOfItemsInStock() {
        return this.stock.size();
    }

    public double getTill() {
        return this.till;
    }

    public void addItemToStock(ISell item) {
        this.stock.add(item);
    }

    public void removeItemFromStock(ISell item) {
        this.stock.remove(item);
    }

    public double potentialProfit() {
        double totalProfit = 0;
        for (ISell item : this.stock) {
            double markup = item.calculateMarkup();
            totalProfit += markup;
        }
        return totalProfit;
    }

    public void sellItem(ISell item) {
        this.till += item.getSalePrice();
        removeItemFromStock(item);
    }

    public void purchaseItem(ISell item) {
        if (this.till >= item.getPurchasePrice()) {
            addItemToStock(item);
            this.till -= item.getSalePrice();
        }
    }
}
