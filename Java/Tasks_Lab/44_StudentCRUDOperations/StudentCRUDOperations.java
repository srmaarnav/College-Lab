import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentCRUDOperations {

    public static void main(String[] args) {
        // JDBC URL, username, and password of PostgreSQL server
        String url = "jdbc:postgresql://localhost:5432/java_lab";
        String user = "postgres";
        String password = "password";

        // Insert a record into the Students table
        String insertSQL = "INSERT INTO Students (name, grade) VALUES (?, ?)";
        
        // Update a record in the Students table
        String updateSQL = "UPDATE Students SET grade = ? WHERE name = ?";
        
        // Delete a record from the Students table
        String deleteSQL = "DELETE FROM Students WHERE name = ?";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            
            // Insert a new student
            try (PreparedStatement insertStatement = connection.prepareStatement(insertSQL)) {
                insertStatement.setString(1, "John Doe");
                insertStatement.setString(2, "A");
                int rowsInserted = insertStatement.executeUpdate();
                System.out.println(rowsInserted + " record(s) inserted.");
            }

            // Update an existing student
            try (PreparedStatement updateStatement = connection.prepareStatement(updateSQL)) {
                updateStatement.setString(1, "B");
                updateStatement.setString(2, "John Doe");
                int rowsUpdated = updateStatement.executeUpdate();
                System.out.println(rowsUpdated + " record(s) updated.");
            }

            // Delete a student record
            try (PreparedStatement deleteStatement = connection.prepareStatement(deleteSQL)) {
                deleteStatement.setString(1, "John Doe");
                int rowsDeleted = deleteStatement.executeUpdate();
                System.out.println(rowsDeleted + " record(s) deleted.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
