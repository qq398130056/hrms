package com.iotek.service;

import com.iotek.entity.User;

/**
 * Created by Administrator on 2018/7/23.
 */
public interface UserService {

    public User login(User user);

    public boolean regist(User user);

    public boolean canRegist(String account);
}
