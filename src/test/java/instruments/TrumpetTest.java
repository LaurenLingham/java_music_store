package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before() {
        trumpet = new Trumpet(2200, 3099.99, "Bach", "brass", 3);
    }

    @Test
    public void hasType() {
        assertEquals(InstrumentType.BRASS, trumpet.getType());
    }

    @Test
    public void hasManufacturer() {
        assertEquals("Bach", trumpet.getManufacturer());
    }

    @Test
    public void hasBoughtPrice() {
        assertEquals(2200, trumpet.getPurchasePrice(), 1);
    }

    @Test
    public void hasSalePrice() {
        assertEquals(3099.99, trumpet.getSalePrice(), 0.01);
    }

    @Test
    public void canChangeSalePrice() {
        trumpet.setSalePrice(3000);
        assertEquals(3000, trumpet.getSalePrice(), 1);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(899.99, trumpet.calculateMarkup(), 0.01);
    }

    @Test
    public void canPlay() {
        assertEquals("think Miles Davis", trumpet.play());
    }
}