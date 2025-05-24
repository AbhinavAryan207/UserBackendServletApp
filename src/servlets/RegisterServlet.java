package servlets;

import utils.DBUtil;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");

        try (Connection conn = DBUtil.getConnection()) {
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO users (username, password, email) VALUES (?, ?, ?)");
            stmt.setString(1, username);
            stmt.setString(2, password);
            stmt.setString(3, email);
            int rows = stmt.executeUpdate();

            res.getWriter().println(rows > 0 ? "Registered successfully" : "Failed to register");
        } catch (SQLException e) {
            res.getWriter().println("DB Error: " + e.getMessage());
        }
    }
}
public void init() throws ServletException {
    System.out.println("RegisterServlet initialized.");
}
