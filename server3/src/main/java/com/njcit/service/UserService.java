package com.njcit.service;


import com.njcit.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;

import java.util.List;

@FeignClient(value = "SERVER")
public interface UserService {
    List<User> selectAll();
}
