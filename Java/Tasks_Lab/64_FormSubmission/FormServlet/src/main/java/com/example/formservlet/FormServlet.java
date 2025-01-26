package com.example.formservlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class FormServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get parameters from the form submission
        String name = request.getParameter("name");
        String email = request.getParameter("email");

        // Set the content type to HTML
        response.setContentType("text/html");

        // Get the output stream to write the response
        PrintWriter out = response.getWriter();

        // Display the submitted data
        out.println("<html><body>");
        out.println("<h1>Form Submission Result</h1>");
        out.println("<p>Name: " + name + "</p>");
        out.println("<p>Email: " + email + "</p>");
        out.println("</body></html>");
    }
}
