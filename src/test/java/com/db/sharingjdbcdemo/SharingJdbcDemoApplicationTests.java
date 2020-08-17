package com.db.sharingjdbcdemo;

import cn.hutool.core.util.RandomUtil;
import com.db.sharingjdbcdemo.model.domain.Category;
import com.db.sharingjdbcdemo.model.domain.User;
import com.db.sharingjdbcdemo.model.service.CategoryService;
import com.db.sharingjdbcdemo.model.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SharingJdbcDemoApplicationTests {

    @Autowired
    private UserService userService;

    @Autowired
    private CategoryService categoryService;

    @Test
    public void contextLoads() {

    }

    @Test
    public void testInsert(){
        User user = new User();
//        user.setId(3L);
        user.setSize(0);
        String email = RandomUtil.randomString(9);
        user.setEmail(email);
        System.out.println(email);
        user.setUsername("黄俊杰");
        userService.save(user);
//        userService.updateEmailById(user);
    }

    @Test
    public void testInsertCategory(){
        Category category = new Category();
        category.setId(123L);
        category.setUserId(12588L);
        category.setName("jjaja");
        categoryService.save(category);
    }
}
