package org.example.connection;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {

    public static Connection getConnections() throws SQLException {
        Connection connection1 = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mavenconnection", "postgres", "sbu16036");
        return connection1;
    }
}
