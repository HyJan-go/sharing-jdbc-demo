package com.db.sharingjdbcdemo.controller;

import com.db.sharingjdbcdemo.model.domain.User;
import com.db.sharingjdbcdemo.model.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: HyJan
 * @create: 2020-08-17 14:48
 **/
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/add")
    public String add(User user){
        boolean save = userService.save(user);
        if (save){
            return "success";
        }
        return "error";
    }

}
