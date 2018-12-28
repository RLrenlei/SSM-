package com.rl.mapper;

import com.rl.pojo.User;

public interface UserMapper {
    User findByUserName(String username);
}