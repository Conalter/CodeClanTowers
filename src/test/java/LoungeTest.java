import room.Lounge;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LoungeTest {

        Lounge lounge;

        @Before
        public void before(){
            lounge = new Lounge("RubyLounge", 30);
        }

        @Test
        public void getName(){
            assertEquals("RubyLounge", lounge.getName());
        }

        @Test
        public void getCapacity(){
            assertEquals(30, lounge.getCapacity());
        }
}
