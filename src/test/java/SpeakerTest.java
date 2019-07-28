import Accessories.Speaker;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpeakerTest {

    Speaker speaker;

    @Before
    public void setup(){
        speaker = new Speaker("SonyA321",50, 75);
    }

    @Test
    public void canGetItem(){
        assertEquals("SonyA321", speaker.getItem());
    }

    @Test
    public void canGetPurchasePrice(){
        assertEquals(50, speaker.getPurchasePrice(), 0.0);
    }

    @Test
    public void canGetSalePrice(){
        assertEquals(75, speaker.getSalePrice(), 0.0);
    }

    @Test
    public void canGetMarkup(){
        assertEquals(50, speaker.calculateMarkup(), 0.0);
    }

}
