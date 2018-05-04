package room;

public enum RoomType {
    SINGLE(1),
    DOUBLE(2),
    SMALLFAMILY(3),
    MEDIUMFAMILY(4),
    LARGEFAMILY(6);

    private final int value;

    RoomType(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
