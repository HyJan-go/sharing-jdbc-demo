package com.db.sharingjdbcdemo.model.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.db.sharingjdbcdemo.model.domain.User;

public interface UserMapper extends BaseMapper<User> {

    void updateEmailById(User user);

}