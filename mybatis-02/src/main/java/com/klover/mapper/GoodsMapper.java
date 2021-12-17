package com.klover.mapper;

import com.klover.entity.Goods;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GoodsMapper {
    // 商品列表
    @Select("select * from goods")
    List<Goods> getGoodsList();

    // 商品和用户信息列表
    List<Goods> getGoodsAndUserList1();

    // 商品和用户信息列表
    List<Goods> getGoodsAndUserList2();
}
