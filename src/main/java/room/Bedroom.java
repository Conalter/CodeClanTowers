package room;

public class Bedroom extends Room {

    private RoomType roomtype;
    private int roomNumber;
    private double nightlyRate;

    public Bedroom(int capacity, RoomType roomtype, int roomNumber, double nightlyRate){
        super(capacity);
        this.roomtype = roomtype;
        this.roomNumber = roomNumber;
        this.nightlyRate = nightlyRate;
    }

    public int getRoomNumber(){
        return roomNumber;
    }

    public RoomType getRoomType(){
        return roomtype;
    }

    public void setRoomtype(RoomType roomtype){
        this.roomtype = roomtype;
    }

    public int getRoomSize(){
        return this.roomtype.getValue();
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public double getNightlyRate() {
        return nightlyRate;
    }

    public void setNightlyRate(double nightlyRate) {
        this.nightlyRate = nightlyRate;
    }

    public int getCapacity() {
        return capacity;
    }
}
