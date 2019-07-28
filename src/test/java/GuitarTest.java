import Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setup() {
        guitar = new Guitar ("Black", "Strings", 6);
    }

    @Test
    public void canGetColour(){
        assertEquals("Black", guitar.getColour());
    }

    @Test
    public void canGetType(){
        assertEquals("Strings", guitar.getType());
    }

    @Test
    public void canGetNumberOfStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }

}
