package com.njcit.dao;

import com.njcit.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDao {
    User selectUserById(int id);
}
