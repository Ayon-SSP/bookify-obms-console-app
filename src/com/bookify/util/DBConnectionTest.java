package com.bookify.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionTest {
    public static void main(String[] args) {
        final String url = "jdbc:oracle:thin:@localhost:1521:xe";
        // final String url = "jdbc:oracle:thin:@localhost:1521:xepdb1"; // SID xepdb1 is not registered with the listener at host localhost port 1521.
        final String username = "obms_system";
        final String password = "321654";
        System.out.println("JDBC API demo");

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            if (connection.isClosed()) {
                System.out.println("Not Connected");
            } else {
                System.out.println("Connected");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
