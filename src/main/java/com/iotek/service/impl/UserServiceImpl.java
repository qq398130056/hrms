package com.iotek.service.impl;

import com.iotek.dao.UserMapper;
import com.iotek.entity.User;
import com.iotek.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/7/23.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public User login(User user) {
        return userMapper.selectByAccountAndPassword(user.getAccount(),user.getPassword());
    }

    @Override
    public boolean regist(User user) {
        return userMapper.insert(user)>0?true:false;
    }

    @Override
    public boolean canRegist(String account) {
        return userMapper.selectCountByAccount(account)==0?true:false;
    }
}
