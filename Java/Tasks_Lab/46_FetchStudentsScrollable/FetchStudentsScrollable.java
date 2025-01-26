import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchStudentsScrollable {

    public static void main(String[] args) {
        // JDBC URL, username, and password of PostgreSQL server
        String url = "jdbc:postgresql://localhost:5432/java_lab";
        String user = "postgres";
        String password = "password";

        // SQL query to fetch all student records
        String querySQL = "SELECT id, name, grade FROM Students";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)) {

            // Execute the query and get the scrollable result set
            ResultSet resultSet = statement.executeQuery(querySQL);

            // Fetch records in forward direction
            System.out.println("Fetching records in forward direction:");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String grade = resultSet.getString("grade");
                System.out.println("ID: " + id + ", Name: " + name + ", Grade: " + grade);
            }

            // Move the cursor to the last row to enable reverse fetching
            if (resultSet.last()) {
                System.out.println("\nFetching records in reverse direction:");
                do {
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    String grade = resultSet.getString("grade");
                    System.out.println("ID: " + id + ", Name: " + name + ", Grade: " + grade);
                } while (resultSet.previous()); // Move to the previous record
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
