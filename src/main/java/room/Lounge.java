package room;

public class Lounge extends Room{

    String name;
    int capacity;

    public Lounge(String name, int capacity){
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
