import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest
{
    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(InstrumentFamilyType.STRINGS, InstrumentColourType.BLUE, InstrumentMakeType.FENDER, InstrumentModelType.STRATOCASTER, 4, GuitarType.ELECTRIC);
    }

    @Test
    public void canGetFamily(){
        assertEquals("Strings", guitar.getFamily().value);
    }

    @Test
    public void canGetColourType(){
        assertEquals("#4156f4", guitar.getColour().colourCode);
    }

    @Test
    public void canGetModelType(){
        assertEquals("HA3455T", guitar.getModel().getModelNumber() );
    }

    @Test
    public void getMake(){
        assertEquals(InstrumentMakeType.FENDER, guitar.getMake());
    }

    @Test
    public void canGEtNumberOfStrings(){
        assertEquals(4, guitar.getNumberOfStrings());
    }

    @Test
    public void canGetGuitarType(){
        assertEquals(GuitarType.ELECTRIC, guitar.getType());
    }
}
