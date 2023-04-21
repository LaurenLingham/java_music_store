import instruments.Drumset;
import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {

    Shop shop;
    Shop shop2;
    Guitar guitar;
    Drumset drumset;

    @Before
    public void before() {

        shop = new Shop(5000);
        shop2 = new Shop(1000);
        guitar = new Guitar(450, 749.99, "Fender", 6, "electric", "sunburst");
        drumset = new Drumset("Zildjian", 1300, 2249.99, 7, "black");
        }

    @Test
    public void startsWithNoStock() {
        assertEquals(0, shop.getNumberOfItemsInStock());
    }

    @Test
    public void hasATill() {
        assertEquals(5000, shop.getTill(), 1);
    }

    @Test
    public void canAddItemToStock() {
        shop.addItemToStock(guitar);
        assertEquals(1, shop.getNumberOfItemsInStock());
    }

    @Test
    public void canRemoveItemFromStock() {
        shop.addItemToStock(guitar);
        shop.removeItemFromStock(guitar);
        assertEquals(0, shop.getNumberOfItemsInStock());
    }

    @Test
    public void canCalculatePotentialProfit() {
        shop.addItemToStock(guitar);
        shop.addItemToStock(drumset);
        assertEquals(1249.98, shop.potentialProfit(), 0.01);
    }

    @Test
    public void canSellItem() {
        shop.addItemToStock(guitar);
        shop.sellItem(guitar);
        assertEquals(5749.99, shop.getTill(), 0.01);
    }

    @Test
    public void canPurchaseItem() {
        shop.purchaseItem(drumset);
        assertEquals(2750.01, shop.getTill(), 0.01);
    }

    @Test
    public void cannotPurchaseItemWithInsufficientTillBalance() {
        shop2.purchaseItem(drumset);
        assertEquals(0, shop2.getNumberOfItemsInStock());
    }
}