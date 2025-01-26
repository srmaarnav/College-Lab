package com.example.studentdetails;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDetailsServlet extends HttpServlet {

    // Database credentials
    private static final String URL = "jdbc:postgresql://localhost:5432/java_lab";
    private static final String USER = "postgres";
    private static final String PASSWORD = "password";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set the content type to HTML
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        // Establish database connection
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            // Create a statement to fetch data from the Students table
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Students");

            // Start building the HTML table to display the student data
            out.println("<html><body>");
            out.println("<h1>Student Details</h1>");
            out.println("<table border='1'><tr><th>ID</th><th>Name</th><th>Grade</th></tr>");

            // Loop through the ResultSet and display each student's details
            while (rs.next()) {
                out.println("<tr>");
                out.println("<td>" + rs.getInt("id") + "</td>");
                out.println("<td>" + rs.getString("name") + "</td>");
                out.println("<td>" + rs.getString("grade") + "</td>");
                out.println("</tr>");
            }

            // Close the table and the HTML
            out.println("</table>");
            out.println("</body></html>");
        } catch (Exception e) {
            e.printStackTrace();
            out.println("<p>Error fetching student details: " + e.getMessage() + "</p>");
        }
    }
}
