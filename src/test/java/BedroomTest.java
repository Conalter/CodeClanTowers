import people.Guest;
import room.Bedroom;
import org.junit.Before;
import org.junit.Test;
import room.RoomType;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest;

    @Before
    public void before(){
     bedroom = new Bedroom(2, RoomType.DOUBLE, 247, 100);
    }


    @Test
    public void getRoomNumber(){
        assertEquals(247, bedroom.getRoomNumber());
    }

    @Test
    public void getRoomType(){
        assertEquals(RoomType.DOUBLE, bedroom.getRoomType());
    }

    @Test
    public void canSetRoomType(){
        bedroom.setRoomtype(RoomType.LARGEFAMILY);
        assertEquals(RoomType.LARGEFAMILY, bedroom.getRoomType());
    }

    @Test
    public void getRoomSize(){
        int value = bedroom.getRoomSize();
        assertEquals(2, bedroom.getRoomSize());
    }

    @Test
    public void bedroomStartsEmpty(){
        assertEquals(0, bedroom.getGuests().size());
    }

    @Test
    public void canAddGuestToBedroom(){
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.getGuests().size());
    }
    @Test
    public void canRemoveGuestFromBedroom(){
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.getGuests().size());
        bedroom.removeGuest(guest);
        assertEquals(0, bedroom.getGuests().size());
    }

}
