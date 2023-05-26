package org.example.connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class MyConnection {

    public static Connection getConnections() throws SQLException {
        Connection connection1 = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mavenconnection",
                                                                               "postgres", "sbu16036");
        return connection1;
    }
}
