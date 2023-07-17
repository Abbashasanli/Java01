package homeworks.lesson43;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JdbcApp {
    public static final String getAllBooksSql = "SELECT * FROM books;";
    public static void main(String[] args) {
        getBooks().stream().forEach(System.out::println);


}
    private static List<Books> getBooks() {

        try(Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/lesson27",
                "postgres",
                "mysecretpassword")) {
            PreparedStatement query = conn.prepareStatement(getAllBooksSql);
            ResultSet resultSet = query.executeQuery();
            List<Books> books = new ArrayList<>();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("author");
                String title = resultSet.getString("title");
                books.add(new Books(id,name,title));
            }
            return books;
        } catch (SQLException e) {
                e.printStackTrace();
            }
            return Collections.emptyList();
        }
}
