package com.daqsoft.controller;

import com.daqsoft.entity.User;
import com.daqsoft.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @author lxx
 */

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/findByName", method = RequestMethod.GET)
    @ResponseBody
    public List<User> findByName(String name){
        List<User> userList = userService.findByName(name);
        return userList;
    }

    @RequestMapping(value = "/findByAge", method = RequestMethod.GET)
    @ResponseBody
    public List<User> findByAge(int age){
        List<User> userList = userService.findByAge(age);
        return userList;
    }

    @RequestMapping(value = "/findUser", method = RequestMethod.GET)
    @ResponseBody
    public User findUser(long id){
        User user = userService.findUser(id);
        return user;
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String hello(long id, Map<String, Object> map) {
        User user = userService.findUser(id);
        map.put("name", user.getName());
        return "index";
    }
}
