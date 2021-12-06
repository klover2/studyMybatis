package com.klover.mapper;

import com.klover.entity.User;
import com.klover.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMapperTest {
    private static Logger logger = Logger.getLogger(UserMapperTest.class);

    @Test
    public void getUserList() {

        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();

        for (User user : userList) {
//            System.out.println(user);
            logger.info(user);
        }
        sqlSession.close();
    }

    @Test
    public void gerUserListPagination() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        Map paginationMap = new HashMap<String, Number>();
        paginationMap.put("limit", 1);
        paginationMap.put("offset", 0);
        List<User> users = mapper.gerUserListPagination(paginationMap);
        for (User user : users) {
            System.out.println(user);
        }

        sqlSession.close();
    }
}
