package room;

public class Conference extends Room {

    String name;
    int dailyRate;
    int capacity;


    public Conference(String name, int dailyRate, int capacity){
        super(capacity);
        this.name = name;
        this.dailyRate = dailyRate;
    }

    public String getName(){
        return name;
    }

    public int getDailyRate(){
        return dailyRate;
    }

    public int getCapacity(){
        return super.capacity;
    }

}
