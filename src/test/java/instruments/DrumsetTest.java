package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsetTest {

    Drumset drumset;

    @Before
    public void before() {
        drumset = new Drumset("Zildjian", 1300, 2249.99, 7, "black");
    }

    @Test
    public void hasType() {
        assertEquals(InstrumentType.PERCUSSION, drumset.getType());
    }

    @Test
    public void hasManufacturer() {
        assertEquals("Zildjian", drumset.getManufacturer());
    }

    @Test
    public void hasBoughtPrice() {
        assertEquals(1300, drumset.getPurchasePrice(), 1);
    }

    @Test
    public void hasSalePrice() {
        assertEquals(2249.99, drumset.getSalePrice(), 0.01);
    }

    @Test
    public void canChangeSalePrice() {
        drumset.setSalePrice(2500);
        assertEquals(2500, drumset.getSalePrice(), 1);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(949.99, drumset.calculateMarkup(), 0.01);

    }

    @Test
    public void hasNumberOfDrums() {
        assertEquals(7, drumset.getNumberOfDrums());
    }

    @Test
    public void hasColour() {
        assertEquals("black", drumset.getColour());
    }

    @Test
    public void canPlay() {
        assertEquals("think Travis Barker", drumset.play());
    }
}