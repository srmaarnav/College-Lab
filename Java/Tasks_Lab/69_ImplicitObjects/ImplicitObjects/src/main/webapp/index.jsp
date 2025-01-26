<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*" %>
<html>
<head>
    <title>JSP Implicit Objects Example</title>
</head>
<body>
<h1>JSP Implicit Objects Example</h1>

<!-- Form to get the user name -->
<form method="post">
    Name: <input type="text" name="username" />
    <input type="submit" value="Submit" />
</form>

<%
    // Check if the user has already submitted a name
    String name = request.getParameter("username");
    if (name != null && !name.isEmpty()) {
        // Store the username in the session
        session.setAttribute("username", name);

        // Set the response content type to text/html
        response.setContentType("text/html");

        // Output a message using the implicit response object
        out.println("<h3>Hello, " + name + "!</h3>");
        out.println("<p>Your name has been stored in the session.</p>");
    } else {
        // If the name is not provided, retrieve it from the session
        String storedName = (String) session.getAttribute("username");
        if (storedName != null) {
            out.println("<h3>Welcome back, " + storedName + "!</h3>");
        } else {
            out.println("<h3>Welcome! Please enter your name.</h3>");
        }
    }
%>

</body>
</html>
