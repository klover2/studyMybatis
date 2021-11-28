package com.klover.dao;

import com.klover.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getUserList();

    User getUserById(int id);

    // 模糊查询
    List<User> getUserByLike(String name);

    int updateUser(User user);

    int insertUser(User user);

    int delUser(int id);

    // 使用map 修改
    int updateUserByMap(Map<String, Object> map);
}
