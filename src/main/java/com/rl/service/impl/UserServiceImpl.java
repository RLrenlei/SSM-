package com.rl.service.impl;

import com.rl.mapper.UserMapper;
import com.rl.pojo.User;
import com.rl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User checkLogin(String username, String password) {
        User user = userMapper.findByUserName(username);
        if(user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }
}
