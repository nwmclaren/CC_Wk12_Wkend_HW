import Accessories.DrumStick;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumStickTest {

    DrumStick drumStick;

    @Before
    public void setup(){
        drumStick = new DrumStick("Pro Mark", 10, 15);
    }

    @Test
    public void canGetItem(){
        assertEquals("Pro Mark", drumStick.getItem());
    }

    @Test
    public void canGetPurchasePrice(){
        assertEquals(10, drumStick.getPurchasePrice(), 0.0);
    }

    @Test
    public void canGetSalePrice(){
        assertEquals(15, drumStick.getSalePrice(), 0.0);
    }

    @Test
    public void canGetMarkup(){
        assertEquals(50, drumStick.calculateMarkup(), 0.0);
    }


}
