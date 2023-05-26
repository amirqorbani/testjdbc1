package org.example.repository;

import org.example.connection.MyConnection;
import org.example.entity.User;

import java.sql.*;

public class UserRepository {
    public void save(User user) throws SQLException {
        Connection connection = MyConnection.getConnections();
        String sql ="INSERT INTO USER (user_id , username , password , signup_date) VALUES (? , ? , ? , ?) ";
                PreparedStatement pstmt = connection.prepareStatement(sql);
                pstmt.setInt(1 , user.getUser_id());
                pstmt.setString(2 , user.getUsername());
                pstmt.setString(3 , user.getPassword() );
                pstmt.setDate(4 , (Date) user.getSignup_date());

    }
}
