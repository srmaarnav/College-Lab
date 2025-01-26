import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgreSQLMetadata {

    public static void main(String[] args) {
        // JDBC URL, username, and password of PostgreSQL server
        String url = "jdbc:postgresql://localhost:5432/";
        String user = "postgres";
        String password = "password";

        // Establish the connection
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            // Get the metadata
            DatabaseMetaData metadata = connection.getMetaData();

            // Display the metadata
            System.out.println("Database Product Name: " + metadata.getDatabaseProductName());
            System.out.println("Database Product Version: " + metadata.getDatabaseProductVersion());
            System.out.println("Database Driver Name: " + metadata.getDriverName());
            System.out.println("Database Driver Version: " + metadata.getDriverVersion());
        } catch (SQLException e) {
            // Handle SQL exception
            e.printStackTrace();
        }
    }
}
