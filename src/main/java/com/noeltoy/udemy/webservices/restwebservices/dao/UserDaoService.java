package com.noeltoy.udemy.webservices.restwebservices.dao;

import com.noeltoy.udemy.webservices.restwebservices.model.user.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UserDaoService {
    private static List<User> userList = new ArrayList<>();
    private static Integer userCount = 3;

    static {
        userList.add(new User(1,"Adam",new Date()));
        userList.add(new User(2,"Eve",new Date()));
        userList.add(new User(3,"John",new Date()));
    }

    public List<User> findAll(){
        return userList;
    }

    public User findUser(Integer id){
        return userList.stream().filter(user->user.getId()==id).findAny().orElse(null);
    }
    public User saveUser(User user){
        if(user.getId()==null){
            user.setId(++userCount);
        }
        userList.add(user);
        return user;
    }
}
