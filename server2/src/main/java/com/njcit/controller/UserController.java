package com.njcit.controller;

import com.njcit.pojo.User;
import com.njcit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/all")
    public List<User> selectAll() {
        return userService.selectAll();
    }
}
