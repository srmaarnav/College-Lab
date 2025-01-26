import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Step 1: Load the JDBC driver
            Class.forName("org.postgresql.Driver");

            // Step 2: Establish a connection
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://127.0.0.1:5432/java",
                    "postgres",
                    "postgres");

            // Display options
            while (true) {
                System.out.println("Please select an option:");
                System.out.println("1. Display all students");
                System.out.println("2. Add a new student");
                System.out.println("3. Update a student");
                System.out.println("4. Delete a student");
                System.out.println("5. Exit");

                int choice = scanner.nextInt();
                scanner.nextLine();  // Consume newline

                switch (choice) {
                    case 1:
                        // Read/Display all students
                        displayStudents(connection);
                        break;
                    case 2:
                        // Add a new student
                        System.out.print("Enter student name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter faculty: ");
                        String faculty = scanner.nextLine();
                        addStudent(connection, name, faculty);
                        break;
                    case 3:
                        // Update a student
                        System.out.print("Enter student ID to update: ");
                        int updateId = scanner.nextInt();
                        scanner.nextLine();  // Consume newline
                        System.out.print("Enter new student name: ");
                        String newName = scanner.nextLine();
                        System.out.print("Enter new faculty: ");
                        String newFaculty = scanner.nextLine();
                        updateStudent(connection, updateId, newName, newFaculty);
                        break;
                    case 4:
                        // Delete a student
                        System.out.print("Enter student ID to delete: ");
                        int deleteId = scanner.nextInt();
                        deleteStudent(connection, deleteId);
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice, please try again.");
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            scanner.close();
        }
    }

    // Method to display all students
    private static void displayStudents(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM students");
        while (resultSet.next()) {
            System.out.println("id: " + resultSet.getInt("id"));
            System.out.println("name: " + resultSet.getString("name"));
            System.out.println("faculty: " + resultSet.getString("faculty"));
            System.out.println("**************************************************************");
        }
        resultSet.close();
        statement.close();
    }

    // Method to add a new student
    private static void addStudent(Connection connection, String name, String faculty) throws SQLException {
        String sql = "INSERT INTO students (name, faculty) VALUES (?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, name);
        preparedStatement.setString(2, faculty);
        int rowsAffected = preparedStatement.executeUpdate();
        if (rowsAffected > 0) {
            System.out.println("Student added successfully!");
        }
        preparedStatement.close();
    }

    // Method to update a student
    private static void updateStudent(Connection connection, int id, String name, String faculty) throws SQLException {
        String sql = "UPDATE students SET name = ?, faculty = ? WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, name);
        preparedStatement.setString(2, faculty);
        preparedStatement.setInt(3, id);
        int rowsAffected = preparedStatement.executeUpdate();
        if (rowsAffected > 0) {
            System.out.println("Student updated successfully!");
        }
        preparedStatement.close();
    }

    // Method to delete a student
    private static void deleteStudent(Connection connection, int id) throws SQLException {
        String sql = "DELETE FROM students WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        int rowsAffected = preparedStatement.executeUpdate();
        if (rowsAffected > 0) {
            System.out.println("Student deleted successfully!");
        }
        preparedStatement.close();
    }
}
