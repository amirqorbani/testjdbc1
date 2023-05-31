package org.example.entity;
import java.util.Date;
import java.util.Objects;

public class User {
    private int userId;
    private String userName;
    private String password;
    private Date signupDate;

    public User(int userId, String username, String password, Date signupDate) {
        this.userId = userId;
        this.userName = username;
        this.password = password;
        this.signupDate = signupDate;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getSignupDate() {
        return signupDate;
    }

    public void setSignupDate(Date signupDate) {
        this.signupDate = signupDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user1 = (User) o;
        return userId == user1.userId && Objects.equals(userName, user1.userName) && Objects.equals(password, user1.password) && Objects.equals(signupDate, user1.signupDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userName, password, signupDate);
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + userId +
                ", username='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", signup_date=" + signupDate +
                '}';
    }
}
