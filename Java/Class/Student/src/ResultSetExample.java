import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultSetExample {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/java";
        String user = "postgres";
        String password = "postgres";

        try {
            // Establish connection to PostgreSQL
            Connection conn = DriverManager.getConnection(url, user, password);


            // Create a statement object
            //  Scrollable ResultSet
           //Statement stmt = conn.createStatement();
           //Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,  		ResultSet.CONCUR_READ_ONLY);
//           Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,  		ResultSet.CONCUR_READ_ONLY);
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,  		ResultSet.CONCUR_UPDATABLE);




            // Execute a query
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            // Iterate over the ResultSet
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String faculty = rs.getString("faculty");
                System.out.println("ID: " + id + ", Name: " + name + ", Faculty: " + faculty);
            }

            // Close resources
            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
