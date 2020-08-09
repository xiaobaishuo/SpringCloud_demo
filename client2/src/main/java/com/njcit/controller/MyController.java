package com.njcit.controller;

import com.njcit.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    RestTemplate restTemplate;

//    private static final String url = "http://localhost:8080";
    private static final String url = "http://SERVER";

    @RequestMapping("/all2")
    public List<User> selectAll() {
        return restTemplate.getForObject(url+"/all", List.class);
    }
}