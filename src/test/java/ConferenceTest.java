import room.Conference;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceTest {

    Conference conference;

   @Before
    public void before(){
       conference = new Conference("JavaRoom", 500, 50);
   }

   @Test
    public void getName() {
       assertEquals("JavaRoom", conference.getName());
   }

   @Test
    public void getDailyRate(){
       assertEquals(500, conference.getDailyRate());
   }

   @Test
    public void getCapacity(){
       assertEquals(50, conference.getCapacity());
   }

//   @Test
//    public int canAddGuests(){
//       conference.addGuest(1);
//       assertEquals(1, conference.getGuests());
//   }

}
