package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ViolinTest {

    Violin violin;

    @Before
    public void before() {
        violin = new Violin(1500, 2340, "Holstein", 4);
    }

    @Test
    public void hasType() {
        assertEquals(InstrumentType.BOWED_STRING, violin.getType());
    }

    @Test
    public void hasManufacturer() {
        assertEquals("Holstein", violin.getManufacturer());
    }

    @Test
    public void hasBoughtPrice() {
        assertEquals(1500, violin.getPurchasePrice(), 1);
    }

    @Test
    public void hasSalePrice() {
        assertEquals(2340, violin.getSalePrice(), 1);
    }

    @Test
    public void canChangeSalePrice() {
        violin.setSalePrice(2249.99);
        assertEquals(2249.99, violin.getSalePrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(840, violin.calculateMarkup(), 1);
    }

    @Test
    public void canPlay() {
        assertEquals("think Nicola Benedetti", violin.play());
    }
}