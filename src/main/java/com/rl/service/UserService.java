package com.rl.service;

import com.rl.pojo.User;

public interface UserService {
    User checkLogin(String username, String password);
}
