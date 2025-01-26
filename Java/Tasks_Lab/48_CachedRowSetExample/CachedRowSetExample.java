import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.*;

public class CachedRowSetExample {

    public static void main(String[] args) {
        // JDBC URL, username, and password of PostgreSQL server
        String url = "jdbc:postgresql://localhost:5432/java_lab";
        String user = "postgres";
        String password = "password";

        // SQL query to fetch all student records
        String querySQL = "SELECT id, name, grade FROM Students";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            // Disable auto-commit for manual transaction control
            connection.setAutoCommit(false);

            // Create a CachedRowSet object
            CachedRowSet cachedRowSet = RowSetProvider.newFactory().createCachedRowSet();
            
            // Set the connection information for the CachedRowSet
            cachedRowSet.setUrl(url);
            cachedRowSet.setUsername(user);
            cachedRowSet.setPassword(password);
            cachedRowSet.setCommand(querySQL);
            
            // Populate the CachedRowSet with data from the database
            cachedRowSet.execute();

            // Display original data
            System.out.println("Original Data:");
            while (cachedRowSet.next()) {
                int id = cachedRowSet.getInt("id");
                String name = cachedRowSet.getString("name");
                String grade = cachedRowSet.getString("grade");
                System.out.println("ID: " + id + ", Name: " + name + ", Grade: " + grade);
            }

            // Modify the data offline (e.g., update grades)
            cachedRowSet.beforeFirst(); // Move cursor to the first row
            while (cachedRowSet.next()) {
                String name = cachedRowSet.getString("name");
                if (("Bal".equals(name)) || ("Eklo".equals(name))) {
                    cachedRowSet.updateString("grade", "C"); // Update grade for John Doe
                    cachedRowSet.updateRow(); // Commit the change to the row
                }
            }

            // Display modified data offline
            System.out.println("\nModified Data (Offline Changes):");
            cachedRowSet.beforeFirst();
            while (cachedRowSet.next()) {
                int id = cachedRowSet.getInt("id");
                String name = cachedRowSet.getString("name");
                String grade = cachedRowSet.getString("grade");
                System.out.println("ID: " + id + ", Name: " + name + ", Grade: " + grade);
            }

            // Apply changes back to the database
            cachedRowSet.acceptChanges(connection); // This writes the changes back to the database

            // Commit the transaction
            connection.commit();

            System.out.println("\nChanges have been committed to the database.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
