package com.njcit.service;

import com.njcit.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "SERVER",fallbackFactory = UserServiceFallbackFactory.class)
public interface UserService {

    @GetMapping("/all3/{id}")
    User selectUserById(@PathVariable("id") int id);
}
