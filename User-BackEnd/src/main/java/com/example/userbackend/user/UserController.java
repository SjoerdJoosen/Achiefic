package com.example.userbackend.user;

import com.example.userbackend.exception.RequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequestMapping("api")
@CrossOrigin
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers()
    {
        try
        {
            return userService.getAllUsers();
        }

        catch (Exception exception)
        {
            throw new RequestException("Cannot find users");
        }

    }

    @PostMapping("/user")
    public User addUser(@RequestBody User user)
    {
        try
        {
            return userService.addUser(user);
        }

        catch (Exception exception)
        {
            throw new RequestException("Unable able to add user");
        }
    }

    @GetMapping(value = "/users/{id}")
    public User getUserById(@PathVariable int id)
    {
        try
        {
            return userService.getUserById(id);
        }
        catch (Exception exception)
        {
            throw new RequestException("Cannot get user by Id");
        }
    }
/*    @DeleteMapping(value = "users/{id}")
    public String deleteUser(@PathVariable int id)
    {
        try
        {
            return UserService.deleteUser(id);
        }
        catch (Exception exception)
        {
            throw new RequestException("Cannot delete user");
        }
    }*/
}
