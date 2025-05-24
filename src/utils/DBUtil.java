package utils;

import java.sql.*;

public class DBUtil {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/userdb";
        String user = "abhinav";
        String pass = "shashank";
        return DriverManager.getConnection(url, user, pass);
    }
}
