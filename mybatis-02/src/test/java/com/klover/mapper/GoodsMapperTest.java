package com.klover.mapper;

import com.klover.entity.Goods;
import com.klover.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class GoodsMapperTest {
    @Test
    public void getGoodsList() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        GoodsMapper mapper = sqlSession.getMapper(GoodsMapper.class);
        List<Goods> goodsList = mapper.getGoodsList();
        for (Goods goods : goodsList) {
            System.out.println(goods);
        }

        sqlSession.close();
    }

    @Test
    public void getGoodsAndUserList1() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        GoodsMapper mapper = sqlSession.getMapper(GoodsMapper.class);
        List<Goods> goodsAndUserList1 = mapper.getGoodsAndUserList1();

        for (Goods goods : goodsAndUserList1) {
            System.out.println(goods);
        }
        sqlSession.close();
    }

    @Test
    public void getGoodsAndUserList2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        GoodsMapper mapper = sqlSession.getMapper(GoodsMapper.class);
        List<Goods> goodsAndUserList1 = mapper.getGoodsAndUserList2();

        for (Goods goods : goodsAndUserList1) {
            System.out.println(goods);
        }
        sqlSession.close();
    }
}
