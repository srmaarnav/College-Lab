package com.example.userpreferences;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class UserPreferencesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get the session object to check if the user is logged in
        HttpSession session = request.getSession(false);

        // Set the content type to HTML
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Check if the user is logged in, display appropriate content
        if (session != null && session.getAttribute("username") != null) {
            String username = (String) session.getAttribute("username");
            // Retrieve user preferences (theme) from cookies if available
            Cookie[] cookies = request.getCookies();
            String theme = "default";
            if (cookies != null) {
                for (Cookie cookie : cookies) {
                    if (cookie.getName().equals("theme")) {
                        theme = cookie.getValue();
                        break;
                    }
                }
            }

            // Display the user preferences and a logout option
            out.println("<html><body>");
            out.println("<h1>Welcome, " + username + "!</h1>");
            out.println("<p>Your preferred theme is: " + theme + "</p>");
            out.println("<form action='' method='POST'>");
            out.println("<label for='theme'>Choose Theme: </label>");
            out.println("<select name='theme' id='theme'>");
            out.println("<option value='light'>Light</option>");
            out.println("<option value='dark'>Dark</option>");
            out.println("</select><br>");
            out.println("<input type='submit' value='Save Preferences'/>");
            out.println("</form>");
            out.println("<a href='logout'>Logout</a>");
            out.println("</body></html>");
        } else {
            // If user is not logged in, show the login form
            out.println("<html><body>");
            out.println("<h1>Please login</h1>");
            out.println("<form action='' method='POST'>");
            out.println("<label for='username'>Username: </label><input type='text' name='username' required/><br>");
            out.println("<label for='password'>Password: </label><input type='password' name='password' required/><br>");
            out.println("<input type='submit' value='Login'/>");
            out.println("</form>");
            out.println("</body></html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Check if it's a login request or a preference update
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Handle login functionality
        if (username != null && password != null && !username.isEmpty() && !password.isEmpty()) {
            // Validate username and password (simple check for example purposes)
            if (username.equals("admin") && password.equals("password")) {
                // Create a session to store login info
                HttpSession session = request.getSession();
                session.setAttribute("username", username);

                // Redirect to the main page
                response.sendRedirect("UserPreferencesServlet");
                return;
            } else {
                // Invalid credentials
                response.getWriter().println("Invalid username or password.");
            }
        }

        // Handle saving user preferences
        String theme = request.getParameter("theme");
        if (theme != null) {
            // Store the selected theme in a cookie for future visits
            Cookie themeCookie = new Cookie("theme", theme);
            themeCookie.setMaxAge(60 * 60 * 24 * 365); // Expiry time: 1 year
            response.addCookie(themeCookie);

            // Redirect to the preferences page
            response.sendRedirect("UserPreferencesServlet");
        }
    }
}
