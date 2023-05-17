package homeworks.lesson34;

public enum Operation {
    END,
    UNDO,
    REDO,
    HOME,
    ENTER,
    RENAME,
    DELETE;


    public static Operation getRandom(){
        int random=(int)(Math.random()*Operation.values().length);
        return Operation.values()[random];
    }
}
