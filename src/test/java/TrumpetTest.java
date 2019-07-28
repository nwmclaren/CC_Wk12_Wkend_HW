import Instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void setup() {
        trumpet = new Trumpet("Gold", "Brass", 4);
    }

    @Test
    public void canGetColour(){
        assertEquals("Gold",  trumpet.getColour());
    }

    @Test
    public void canGetType(){
        assertEquals("Brass", trumpet.getType());
    }

    @Test
    public void canGetNumberOfValves(){
        assertEquals(4, trumpet.getNumberOfValves());
    }
}
