<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
<h1>Login</h1>

<!-- Displaying a login form -->
<form method="post">
    Username: <input type="text" name="username" required /><br><br>
    Password: <input type="password" name="password" required /><br><br>
    <input type="submit" value="Login" />
</form>

<%
    // Retrieve form parameters
    String username = request.getParameter("username");
    String password = request.getParameter("password");

    // Check if the form has been submitted
    if (username != null && password != null) {
        // Validate username and password (Example with hardcoded values)
        if ("admin".equals(username) && "password".equals(password)) {
            // If valid, display the welcome message
            session.setAttribute("username", username);
            out.println("<h3>Welcome, " + username + "!</h3>");
        } else {
            // Invalid credentials
            out.println("<p style='color: red;'>Invalid username or password. Please try again.</p>");
        }
    }
%>

</body>
</html>
