import org.junit.Before;
import org.junit.Test;
import room.Dining;

import static org.junit.Assert.assertEquals;

public class DiningTest {

    Dining dining;

    @Before
    public void before(){
        dining = new Dining("Github Grill", 60);
    }

    @Test
    public void getName(){
        assertEquals("Github Grill", dining.getName());
    }

    @Test
    public void getCapacity(){
        assertEquals(60, dining.getCapacity());
    }
}
