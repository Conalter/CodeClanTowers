package room;

public class Dining extends Room{

    Dining dining;

    String name;
    int capacity;

    public Dining(String name, int capacity) {
        super(capacity);
        this.name = name;
    }
        public String getName(){
        return name;
        }

        public int getCapacity(){
        return super.capacity;
        }


}
