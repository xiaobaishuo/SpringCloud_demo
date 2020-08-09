package com.njcit.service;

import com.njcit.pojo.User;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class UserServiceFallbackFactory implements FallbackFactory {
    @Override
    public UserService create(Throwable throwable) {
        return new UserService() {
            @Override
            public User selectUserById(int id) {
                return new User()
                        .setId(id)
                        .setUsername("停止服务")
                        .setPassword("停止服务");
            }
        };
    }
}
