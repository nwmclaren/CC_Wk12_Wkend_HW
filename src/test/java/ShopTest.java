import Accessories.DrumStick;
import Accessories.Speaker;
import Instruments.Guitar;
import Instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop shop;
    private Guitar guitar;
    private Trumpet trumpet;
    private Speaker speaker;
    private DrumStick drumStick;

    @Before
    public void setup(){
        shop = new Shop("Biggars");
        guitar = new Guitar("Black", "Strings", 6);
        trumpet = new Trumpet("Gold", "Brass", 4);
        speaker = new Speaker("SonyA321", 50, 75);
        drumStick = new DrumStick("pro Mark", 10, 15);
    }

    @Test
    public void canGetName(){
        assertEquals("Biggars", shop.getName());
    }

    @Test
    public void canGetStockWhenEmpty(){
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void canGetStockWhenPopulated(){
//        shop.addItemToStock(guitar);
//        shop.addItemToStock(trumpet);
        shop.addItemToStock(speaker);
        shop.addItemToStock(drumStick);
        assertEquals(2, shop.getStock().size());
    }

    @Test
    public void canReduceStock(){
        shop.addItemToStock(speaker);
        shop.addItemToStock(drumStick);
        shop.removeItemFromStock(drumStick);
        assertEquals(1, shop.getStock().size());
    }

}
