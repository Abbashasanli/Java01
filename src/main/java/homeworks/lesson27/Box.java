package homeworks.lesson27;

public class Box<T> {
    private boolean isEven;
    private T data;

    public Box(boolean isEven, T data) {
        this.isEven = isEven;
        this.data = data;
    }

    public boolean isEven() {
        return isEven;
    }

    public void setEven(boolean even) {
        isEven = even;
    }



    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
