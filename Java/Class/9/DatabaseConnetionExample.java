import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class DatabaseConnetionExample {
        public static void main(String[] args) {
            // Step 1: Load the JDBC driver
            try {
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            Connection connection = null;
            Statement statement = null;
            ResultSet resultSet = null;

            try {
                // Step 2: Establish a connection
                connection = DriverManager.getConnection(
                        "jdbc:postgresql://localhost:5432/java",
                        "postgres", 
                        "All@123456");

                // Step 3: Create a statement
                statement = connection.createStatement();

                // Step 4: Execute the query
                resultSet = statement.executeQuery("SELECT * FROM students");

                // Step 5: Process the results
                while (resultSet.next()) {
                    System.out.println("id: " + resultSet.getInt("id"));
                    System.out.println("name: " + resultSet.getString("name"));
                    System.out.println("faculty: " + resultSet.getString("faculty"));
                    System.out.println("**************************************************************");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    // Step 6: Close the resources
                    if (resultSet != null) resultSet.close();
                    if (statement != null) statement.close();
                    if (connection != null) connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
}