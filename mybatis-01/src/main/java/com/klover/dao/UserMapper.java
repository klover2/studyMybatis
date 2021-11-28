package com.klover.dao;

import com.klover.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> getUserList();

    User gerUser(int id);

    int updateUser(User user);

    int insertUser(User user);

    int delUser(int id);
}
