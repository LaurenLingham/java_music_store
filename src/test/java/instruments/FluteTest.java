package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FluteTest {

    Flute flute;

    @Before
    public void before() {
        flute = new Flute(600, 999.99, "Yamaha", "silver");
    }

    @Test
    public void hasType() {
        assertEquals(InstrumentType.WOODWIND, flute.getType());
    }

    @Test
    public void hasManufacturer() {
        assertEquals("Yamaha", flute.getManufacturer());
    }

    @Test
    public void hasBoughtPrice() {
        assertEquals(600, flute.getPurchasePrice(), 1);
    }

    @Test
    public void hasSalePrice() {
        assertEquals(999.99, flute.getSalePrice(), 0.01);
    }

    @Test
    public void canChangeSalePrice() {
        flute.setSalePrice(1200);
        assertEquals(1200, flute.getSalePrice(), 1);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(399.99, flute.calculateMarkup(), 0.01);
    }

    @Test
    public void hasMaterial() {
        assertEquals("silver", flute.getMaterial());
    }

    @Test
    public void canPlay() {
        assertEquals("think James Galway", flute.play());
    }
}