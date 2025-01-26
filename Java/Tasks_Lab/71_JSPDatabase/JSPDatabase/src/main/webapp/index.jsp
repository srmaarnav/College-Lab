<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.sql.*, jakarta.servlet.*, jakarta.servlet.http.*" %>
<html>
<head>
    <title>Student List</title>
</head>
<body>
<h1>Student List</h1>

<table border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Grade</th>
    </tr>

    <%
        // Database connection details
        String url = "jdbc:postgresql://localhost:5432/java_lab"; // Replace with your actual database name
        String user = "postgres";
        String password = "password";
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Establish connection to the database
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, user, password);

            // Create a statement object to execute the SQL query
            stmt = conn.createStatement();

            // SQL query to fetch student data
            String sql = "SELECT id, name, grade FROM students";
            rs = stmt.executeQuery(sql);

            // Loop through the result set and display data in table rows
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String grade = rs.getString("grade");

                out.println("<tr>");
                out.println("<td>" + id + "</td>");
                out.println("<td>" + name + "</td>");
                out.println("<td>" + grade + "</td>");
                out.println("</tr>");
            }
        } catch (Exception e) {
            out.println("<tr><td colspan='3'>Error: " + e.getMessage() + "</td></tr>");
        } finally {
            // Close the resources
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    %>
</table>
</body>
</html>
