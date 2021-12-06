package com.klover.mapper;

import com.klover.entity.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getUserList();
    List<User> gerUserListPagination(Map paginationMap);
}
