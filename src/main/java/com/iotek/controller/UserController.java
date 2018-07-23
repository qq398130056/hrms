package com.iotek.controller;

import com.alibaba.fastjson.JSON;
import com.iotek.entity.User;
import com.iotek.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2018/7/21.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/login")
    @ResponseBody
    public String login(User user){
        System.out.println(user);
        User u = userService.login(user);
        String s = JSON.toJSONString(u);
        return s;
    }
}
