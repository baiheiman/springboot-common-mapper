package com.baizhi;

import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootCommonMapperApplicationTests {
    @Autowired
    UserDao userDao;

    @Test
    public void contextLoads() {
       /* List<User> list = userDao.selectAll();
        System.out.println(list);*/
       User user = new User();
       user.setName("白起");
        int i = userDao.insertSelective(user);
        System.out.println(i);
    }

}
