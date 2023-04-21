package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar(450, 749.99, "Fender", 6, "electric", "sunburst");
    }

    @Test
    public void hasType() {
        assertEquals(InstrumentType.GUITAR, guitar.getType());
    }

    @Test
    public void hasManufacturer() {
        assertEquals("Fender", guitar.getManufacturer());
    }

    @Test
    public void hasBoughtPrice() {
        assertEquals(450, guitar.getPurchasePrice(), 1);
    }

    @Test
    public void hasSalePrice() {
        assertEquals(749.99, guitar.getSalePrice(), 0.01);
    }

    @Test
    public void canChangeSalePrice() {
        guitar.setSalePrice(800);
        assertEquals(800, guitar.getSalePrice(), 1);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(299.99, guitar.calculateMarkup(), 0.01);
    }

    @Test
    public void play() {
        assertEquals("think Jimi Hendrix", guitar.play());
    }
}