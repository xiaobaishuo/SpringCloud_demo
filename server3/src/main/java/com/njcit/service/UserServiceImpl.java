package com.njcit.service;

import com.njcit.dao.UserDao;
import com.njcit.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserDao userDao;

    public List<User> selectAll() {
        return userDao.selectAll();
    }
}
