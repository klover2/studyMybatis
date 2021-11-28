package com.klover.dao;

import com.klover.pojo.User;
import com.klover.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.List;

/**
 * CURD
 * 注意 CUD 需要提交事务 commit
 */

public class UserMapperTest {
    @Test
    public void getUserList() {

        // 1. 获取 sqlSession 对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        // 2. 执行sql
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> userList = mapper.getUserList();


        for (User user : userList) {
            System.out.println(user);
        }

        // 3. 关闭
        sqlSession.close();
    }

    @Test
    public void gerUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.gerUser(1);
        System.out.println(user);

        sqlSession.close();
    }

    @Test
    public void updateUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.updateUser(new User(1, "22", 22, new Date()));

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void insertUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.insertUser(new User(2, "33", 33, new Date()));

        sqlSession.commit();
        sqlSession.close();
    }
    
    @Test
    public void delUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.delUser(2);

        sqlSession.commit();
        sqlSession.close();
    }
}
