package room;

import people.Guest;

import java.util.ArrayList;

public abstract class Room {

    int capacity;
    ArrayList<Guest> guests;

    public Room(int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList getGuests() {
        return guests;
    }

//    public int addGuest(int guest) {
//       return this.guests.add(people.guest);
//    }
}
