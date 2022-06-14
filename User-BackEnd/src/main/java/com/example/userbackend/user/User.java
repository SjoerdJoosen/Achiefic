package com.example.userbackend.user;

import javax.persistence.*;

@Entity
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue
    public int UserId;
    private String username;
    private String email;
    private String password;
    public User() {

    }
    public User(int userId, String username, String email, String password) {
        UserId = userId;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public int getUserId() {
        return UserId;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
