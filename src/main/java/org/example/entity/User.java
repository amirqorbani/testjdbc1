package org.example.entity;

import java.util.Date;
import java.util.Objects;

public class User {
    private int user_id;
     private String username;
     private String password;
    private  Date signup_date;

    public User(int user_id, String username, String password, Date signup_date) {
        this.user_id = user_id;
        this.username = username;
        this.password = password;
        this.signup_date = signup_date;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getSignup_date() {
        return signup_date;
    }

    public void setSignup_date(Date signup_date) {
        this.signup_date = signup_date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return user_id == user.user_id && Objects.equals(username, user.username) && Objects.equals(password, user.password) && Objects.equals(signup_date, user.signup_date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user_id, username, password, signup_date);
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", signup_date=" + signup_date +
                '}';
    }
}
