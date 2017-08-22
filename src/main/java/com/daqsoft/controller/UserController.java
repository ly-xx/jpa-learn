package com.daqsoft.controller;

import com.daqsoft.entity.User;
import com.daqsoft.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lxx
 */

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/findByName", method = RequestMethod.GET)
    public List<User> findByName(String name){
        List<User> userList = userService.findByName(name);
        return userList;
    }

    @RequestMapping(value = "/findByAge", method = RequestMethod.GET)
    public List<User> findByAge(int age){
        List<User> userList = userService.findByAge(age);
        return userList;
    }

    @RequestMapping(value = "/findUser", method = RequestMethod.GET)
    public User findUser(long id){
        User userList = userService.findUser(id);
        return userList;
    }
}
