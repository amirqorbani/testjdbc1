package org.example;

import org.example.entity.User;
import org.example.repository.UserRepository;

import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws SQLException {
        User user1 = new User(1 , "amin" , "aaaa", new Date());
        UserRepository userRepository1 = new UserRepository();
        userRepository1.save(user1);



    }
}