package com.example.userbackend.user;

import java.util.List;

public interface IUserService {

    List<User> getAllUsers();
    User addUser(User user);
    User getUserById (int id);
    String deleteUser (int id);
    User updateUser(User user);

}
