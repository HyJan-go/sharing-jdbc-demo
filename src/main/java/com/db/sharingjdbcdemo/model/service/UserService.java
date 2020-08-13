package com.db.sharingjdbcdemo.model.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.db.sharingjdbcdemo.model.domain.User;
import com.db.sharingjdbcdemo.model.mapper.UserMapper;
@Service
public class UserService extends ServiceImpl<UserMapper, User> {

}
