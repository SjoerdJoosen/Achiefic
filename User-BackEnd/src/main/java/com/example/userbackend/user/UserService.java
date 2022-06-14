package com.example.userbackend.user;

import com.example.userbackend.exception.RequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {this.userRepository = userRepository;}

    public List<User> getAllUsers()
    {
        try
        {
            return userRepository.findAll();
        }

        catch (Exception exception)
        {
            throw new RequestException("Cannot find users");
        }
    }

    public User addUser(User user)
    {
        try
        {
            return userRepository.save(user);
        }

        catch (Exception exception)
        {
            throw new RequestException("Cannot add user");
        }
    }

    public User getUserById (int id)
    {
        try
        {
            return userRepository.findById(id).orElse(null);
        }

        catch (Exception exception)
        {
            throw new RequestException("Cannot get user by Id");
        }
    }

    public String deleteUser(int id)
    {
        try
        {
            userRepository.deleteById(id);
            return "User deleted" + id;
        }

        catch (Exception exception)
        {
            throw new RequestException("Cannot delete user");
        }
    }
    @Override
    public User updateUser(User user)
    {
        return null;
    }
}



