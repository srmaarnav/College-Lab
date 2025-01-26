import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class CreateStudentsTable {

    public static void main(String[] args) {
        // JDBC URL, username, and password of PostgreSQL server
        String url = "jdbc:postgresql://localhost:5432/java_lab";
        String user = "postgres";
        String password = "password";

        // SQL query to create the Students table
        String createTableSQL = "CREATE TABLE IF NOT EXISTS Students ("
                + "id SERIAL PRIMARY KEY, "
                + "name VARCHAR(100), "
                + "grade CHAR(2)"
                + ");";

        // Establish the connection and execute the query
        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement()) {

            // Execute the create table SQL statement
            statement.executeUpdate(createTableSQL);
            System.out.println("Students table created successfully.");

        } catch (SQLException e) {
            // Handle SQL exceptions
            e.printStackTrace();
        }
    }
}
