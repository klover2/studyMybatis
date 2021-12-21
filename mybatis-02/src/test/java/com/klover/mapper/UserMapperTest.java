package com.klover.mapper;

import com.klover.entity.User;
import com.klover.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.Date;
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

    @Test
    public void getUserGoodsById1() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> goods = mapper.getUserGoodsById1(1);

        for (User good : goods) {
            System.out.println(good);
        }

        sqlSession.close();
    }

    @Test
    public void getUserGoodsById2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> goods = mapper.getUserGoodsById2(1);

        for (User good : goods) {
            System.out.println(good);
        }

        sqlSession.close();
    }

    @Test
    public void getUserListByIf() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map map = new HashMap<String, Number>();
        map.put("id", 1);
        List<User> users = mapper.getUserListByIf(map);

        for (User user : users) {
            System.out.println(user);
        }

        sqlSession.close();
    }

    @Test
    public void updateUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map map = new HashMap<String, Object>();
        map.put("id", 1);
        map.put("name", "123123");
        map.put("age", 10);
        map.put("time", new Date());
        int res = mapper.updateUser(map);

        System.out.println(res);

        sqlSession.close();
    }

    @Test
    public void getUserByChoose() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map map = new HashMap<String, Object>();
        map.put("id", 1);
        map.put("name", "123123");
        List users = mapper.getUserByChoose(map);

        for (Object user : users) {
            System.out.println(user);
        }

        sqlSession.close();
    }

    @Test
    public void getUserByForeach() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int[] ids = new int[]{1};
        List users = mapper.getUserByForeach(ids);

        for (Object user : users) {
            System.out.println(user);
        }

        sqlSession.close();
    }
}
