package room;

import people.Guest;
import java.util.ArrayList;


public abstract class Room {

    public int capacity;
    private ArrayList<Guest> guests;

    public Room(int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public void addGuest(Guest guests){
        this.guests.add(guests);
    }

    public void removeGuest(Guest guests){
        this.guests.remove(guests);
    }

}
