package com.njcit;

import com.njcit.pojo.User;
import com.njcit.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.PathVariable;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class Server4ApplicationTests {

    @Autowired
    DataSource dataSource;

    @Test
    public void contextLoads() throws SQLException {
        //看一下默认数据源
        System.out.println(dataSource.getClass());
        //获得连接
        Connection connection =  dataSource.getConnection();
        System.out.println(connection);
        //关闭连接
        connection.close();
    }

    @Autowired
    UserService userService;

    @Test
    public void select() {
        User user = userService.selectUserById(1);
        System.out.println(user);
    }
}
