package com.db.sharingjdbcdemo.model.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.db.sharingjdbcdemo.model.domain.User;
import com.db.sharingjdbcdemo.model.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService extends ServiceImpl<UserMapper, User> {

    @Autowired
    private UserMapper userMapper;

    public void updateEmailById(User user) {
        userMapper.updateEmailById(user);
    }
}
