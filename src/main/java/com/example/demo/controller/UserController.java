package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
   private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping(value = "/user/list")
    public List<User> getUser(){
        List<User> userList = userRepository.findAll();
        return userList;
    }

    @GetMapping("/public/info")
    public String getInfo(){
        return "Welcome to Spring Security Info";
    }
    @GetMapping("/public/info/test")
    public String getTest(){
        return "Welcome to Test";
    }
    @GetMapping("/public/stat")
    public String getStat(){
        return "Welcome to Statistics";
    }
}
