import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionExample {

    public static void main(String[] args) {
        // JDBC URL, username, and password of PostgreSQL server
        String url = "jdbc:postgresql://localhost:5432/";
        String user = "postgres";
        String password = "password";

        // SQL queries for inserting records into the Students table
        String insertStudent1 = "INSERT INTO Students (name, grade) VALUES (?, ?)";
        String insertStudent2 = "INSERT INTO Students (name, grade) VALUES (?, ?)";

        // SQL queries for update and delete (optional for demonstration)
        // String updateStudent = "UPDATE Students SET grade = ? WHERE name = ?";
        // String deleteStudent = "DELETE FROM Students WHERE name = ?";

        Connection connection = null;

        try {
            // Establish a connection to the database
            connection = DriverManager.getConnection(url, user, password);
            
            // Disable auto-commit to start a transaction
            connection.setAutoCommit(false);

            // Insert first student
            try (PreparedStatement pstmt1 = connection.prepareStatement(insertStudent1)) {
                pstmt1.setString(1, "John Doe");
                pstmt1.setString(2, "A");
                pstmt1.executeUpdate();
            }

            // Insert second student (this can be a part of the same transaction)
            try (PreparedStatement pstmt2 = connection.prepareStatement(insertStudent2)) {
                pstmt2.setString(1, "Jane Doe");
                pstmt2.setString(2, "B");
                pstmt2.executeUpdate();
            }

            // Commit the transaction if no error occurs
            connection.commit();
            System.out.println("Transaction completed successfully.");

        } catch (SQLException e) {
            // If an error occurs, rollback the transaction to ensure data consistency
            if (connection != null) {
                try {
                    System.out.println("Transaction failed. Rolling back...");
                    connection.rollback();
                } catch (SQLException rollbackEx) {
                    rollbackEx.printStackTrace();
                }
            }
            e.printStackTrace();
        } finally {
            try {
                // Restore auto-commit mode and close the connection
                if (connection != null) {
                    connection.setAutoCommit(true);
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
