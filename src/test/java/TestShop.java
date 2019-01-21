import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestShop {

    Shop shop;
    Guitar guitar;
    Keyboard keyboard;

    @Before
    public void before(){
        shop = new Shop("Record Shop");
        guitar = new Guitar(InstrumentFamilyType.STRINGS, InstrumentColourType.BLUE, InstrumentMakeType.FENDER, InstrumentModelType.STRATOCASTER, 500, 4, GuitarType.ELECTRIC);
        keyboard = new Keyboard(InstrumentFamilyType.KEYBOARD, InstrumentColourType.BLUE, InstrumentMakeType.YAMAHA, InstrumentModelType.SELMERPARISMARKIV, 500);
    }

    @Test
    public void hasName(){
        assertEquals("Record Shop", shop.getShopName());
    }

    @Test
    public void stockIsZero(){
        assertEquals(0, shop.getStockAmount());
    }

    @Test
    public void canAddItemToStock(){
        shop.addToStock(guitar);
        shop.addToStock(keyboard);
        assertEquals(2, shop.getStockAmount());
    }

}
