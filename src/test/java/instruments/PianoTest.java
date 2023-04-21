package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PianoTest {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano(800, 1799.99, "Roland", 88, "brown");
    }

    @Test
    public void hasType() {
        assertEquals(InstrumentType.KEYBOARD, piano.getType());
    }

    @Test
    public void hasManufacturer() {
        assertEquals("Roland", piano.getManufacturer());
    }

    @Test
    public void hasBoughtPrice() {
        assertEquals(800, piano.getPurchasePrice(), 1);
    }

    @Test
    public void hasSalePrice() {
        assertEquals(1799.99, piano.getSalePrice(), 0.01);
    }

    @Test
    public void canChangeSalePrice() {
        piano.setSalePrice(2000);
        assertEquals(2000, piano.getSalePrice(), 1);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(999.99, piano.calculateMarkup(), 0.01);
    }

    @Test
    public void hasNumberOfKeys() {
        assertEquals(88, piano.getNumberOfKeys());
    }

    @Test
    public void hasColour() {
        assertEquals("brown", piano.getColour());
    }

    @Test
    public void play() {
        assertEquals("think Elton John", piano.play());
    }
}