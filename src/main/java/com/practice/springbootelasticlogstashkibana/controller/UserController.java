package com.practice.springbootelasticlogstashkibana.controller;


import com.practice.springbootelasticlogstashkibana.model.User;
import com.practice.springbootelasticlogstashkibana.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/user")
public class UserController {

    UserService userService;

    public UserController(UserService userService){
        this.userService=userService;
    }
    @GetMapping("/{id}")
    public User findUser(@PathVariable int id){
        return userService.findUser(id);
    }
}
