<%--
  Created by IntelliJ IDEA.
  User: arnavs
  Date: 1/22/25
  Time: 1:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.Date" %>

<html>
<head>
  <title>Current Date and Time</title>
</head>
<body>
<h1>Current Date and Time</h1>

<!-- Using JSP Declaration to declare a variable -->
<%
  Date currentDate = new Date();
%>

<!-- Using JSP Expression to display the current date and time -->
<p>The current date and time is: <%= currentDate.toString() %></p>

</body>
</html>