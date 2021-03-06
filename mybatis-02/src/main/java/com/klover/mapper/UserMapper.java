package com.klover.mapper;

import com.klover.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getUserList();
    List<User> gerUserListPagination(Map paginationMap);
    // 获取用户和用户下商品信息
    List<User> getUserGoodsById1(@Param("userId") int id);

    // 获取用户和用户下商品信息
    List<User> getUserGoodsById2(@Param("userId") int id);
}
