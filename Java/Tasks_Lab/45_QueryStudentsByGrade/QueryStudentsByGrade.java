import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class QueryStudentsByGrade {

    public static void main(String[] args) {
        // JDBC URL, username, and password of PostgreSQL server
        String url = "jdbc:postgresql://localhost:5432/java_lab";
        String user = "postgres";
        String password = "password";

        // SQL query to select students based on grade
        String querySQL = "SELECT id, name, grade FROM Students WHERE grade = ?";

        // Grade to search for
        String gradeToSearch = "A";  // Change this value to search for other grades

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement preparedStatement = connection.prepareStatement(querySQL)) {

            // Set the grade parameter in the query
            preparedStatement.setString(1, gradeToSearch);

            // Execute the query and get the result set
            ResultSet resultSet = preparedStatement.executeQuery();

            // Display the results
            System.out.println("Students with grade " + gradeToSearch + ":");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String grade = resultSet.getString("grade");
                System.out.println("ID: " + id + ", Name: " + name + ", Grade: " + grade);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
