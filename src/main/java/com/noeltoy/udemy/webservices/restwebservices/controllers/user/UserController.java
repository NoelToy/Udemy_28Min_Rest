package com.noeltoy.udemy.webservices.restwebservices.controllers.user;

import com.noeltoy.udemy.webservices.restwebservices.dao.UserDaoService;
import com.noeltoy.udemy.webservices.restwebservices.model.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/users")
public class UserController {
    @Autowired
    private UserDaoService userDaoService;

    //retrieve all user
    @GetMapping(path = "/getAllUsers")
    public List<User> getAllUsers(){
        return userDaoService.findAll();
    }

    //retrieve specific user
    @GetMapping(path = "/getUser/{id}")
    public User getUser(@PathVariable Integer id){
        return userDaoService.findUser(id);
    }

    @PostMapping(path = "/saveUser")
    public void saveUser(@RequestBody User user){
        userDaoService.saveUser(user);
    }
}
