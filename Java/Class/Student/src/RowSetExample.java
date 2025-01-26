import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;

public class RowSetExample {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/java";
        String user = "postgres";
        String password = "postgres";

        try {
            // Create a CachedRowSet object
            RowSetFactory factory = RowSetProvider.newFactory();
            CachedRowSet rowSet = factory.createCachedRowSet();

//            CachedRowSet crs = new CachedRowSet();

            // Set connection properties
            rowSet.setUrl(url);
            rowSet.setUsername(user);
            rowSet.setPassword(password);

            // Set the SQL command
            rowSet.setCommand("SELECT * FROM students");

            // Execute the query
            rowSet.execute();

            // Disconnect from the database (operates in disconnected mode)

            // Iterate over the CachedRowSet
            while (rowSet.next()) {
                int id = rowSet.getInt("id");
                String name = rowSet.getString("name");
                String faculty = rowSet.getString("faculty");
                System.out.println("ID: " + id + ", Name: " + name + ", Faculty: " + faculty);
            }

            // No need to explicitly close resources since RowSet handles them

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
