package org.example.repository;

import org.example.connection.MyConnection;
import org.example.entity.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    public void save(User user) throws SQLException {
        Connection connection = MyConnection.getConnections();
        String sql = "INSERT INTO usertable (user_id , username , password , signup_date) VALUES (? , ? , ? , ?) ";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setInt(1, user.getUserId());
        pstmt.setString(2, user.getUserName());
        pstmt.setString(3, user.getPassword());
        pstmt.setDate(4, new Date(user.getSignupDate().getTime()));
        pstmt.executeUpdate();
        connection.close();
    }

    public User load(int id) throws SQLException {
        Connection connection = MyConnection.getConnections();
        String sql = "select * from usertable where user_id = ? ";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setInt(1, id);
        ResultSet resultSet = pstmt.executeQuery();
        connection.close();
        Integer user_id = 0;
        String username = null;
        String password = null;
        Date signup_date = null;
        while (resultSet.next()) {
            user_id = resultSet.getInt("user_id");
            username = resultSet.getString("username");
            password = resultSet.getString("password");
            signup_date = resultSet.getDate("signup_date");
        }
        return new User(user_id, username, password, signup_date);
    }

    public void update(User user, String a, String b) throws SQLException {
        Connection connection = MyConnection.getConnections();
        String sql = "update usertable set username = ?, password = ? where user_id = ? ";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setString(1, a);
        pstmt.setString(2, b);
        pstmt.setInt(3, user.getUserId());
        pstmt.executeUpdate();
        connection.close();
    }

    public List<User> loadall() throws SQLException {
        Connection connection = MyConnection.getConnections();
        List<User> userlist = new ArrayList<>();
        String sql = "select * from usertable ";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        ResultSet resultSet = pstmt.executeQuery();
        connection.close();
        Integer user_id = 0;
        String username = null;
        String password = null;
        Date signup_date = null;

        while (resultSet.next()) {
            user_id = resultSet.getInt("user_id");
            username = resultSet.getString("username");
            password = resultSet.getString("password");
            signup_date = resultSet.getDate("signup_date");
            userlist.add(new User(user_id, username, password, signup_date));
        }
        return userlist;
    }

    public void saveall(User[] users) throws SQLException {
        Connection connection = MyConnection.getConnections();
        String sql = "INSERT INTO usertable (user_id , username , password , signup_date) VALUES (? , ? , ? , ?) ";
        for (User user : users) {
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setInt(1, user.getUserId());
            pstmt.setString(2, user.getUserName());
            pstmt.setString(3, user.getPassword());
            pstmt.setDate(4, new Date(user.getSignupDate().getTime()));
            pstmt.executeUpdate();
        }
        connection.close();
    }
    public void delete (User user) throws SQLException {
        Connection connection = MyConnection.getConnections();
        String sql = "delete from usertable where user_id = ? ";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setInt(1, user.getUserId());
        pstmt.executeUpdate();
        connection.close();
    }
}
