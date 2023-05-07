package homeworks.lesson27;

import java.util.Objects;

public class Response<U,T>{
    private U data;
    private  T type;

    public Response() {

    }

    public Response(U data, T type) {
        this.data = data;
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Response<?, ?> response = (Response<?, ?>) o;
        return Objects.equals(data, response.data) && Objects.equals(type, response.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, type);
    }

    @Override
    public String toString() {
        return String.format("Response{data=%s, type=%s}", data, type);
    }
}
