package homeworks.lesson27;

public class Result <T>{
    private T data;
    private String name;

    public Result(String salam) {}

    public Result(T data, String name) {
        this.data = data;
        this.name = name;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
