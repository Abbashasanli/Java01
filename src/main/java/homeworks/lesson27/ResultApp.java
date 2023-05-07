package homeworks.lesson27;


public class ResultApp {
    public static void main(String[] args) {
        Response<String, Integer> salam = new Response<>("salam ", 123);

    }

    public static <T> Result<T> validateAndGet(T t) {
        if (t == null) {
            return new Result<>("salam");
        }
        return new Result<>(t, t.getClass().getName());
    }

    public static <T, U> Response< T, U> validateAndGet(T t, U u) {
        return new Response<>(t, u);
    }
}

