package org.example;

import org.example.repository.UserRepository;
import org.example.entity.User;
import java.sql.SQLException;
import java.util.Date;


public class Main {
    public static void main(String[] args) throws SQLException {
        User user11 = new User(0, "amin", "aaaa", new Date());
        User user12 = new User(2, "sajad", "bbbb", new Date());
        User user13 = new User(3, "soheil", "ssss", new Date());
        User user14 = new User(4, "saber", "dddd", new Date());
        User user15 = new User(5, "navid", "gggg", new Date());
        User[] users = {user11, user12, user13, user14, user15};
        UserRepository userRepository1 = new UserRepository();
//        userRepository1.save(user11);
//        System.out.println(userRepository1.load(1).toString());
//        userRepository1.update(user11 , "amin" , "123456");
//        System.out.println(userRepository1.loadall().toString());
//        userRepository1.saveall(users);
//        List<User> userList1 = userRepository1.loadall();
//        for (User user : userList1) {
//            System.out.println("\n"+user.toString());
//
//        }
        userRepository1.delete(user11);
    }
}