package com.klover.mapper;

import com.klover.entity.Goods;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GoodsMapper {
    @Select("select * from goods")
    List<Goods> getGoodsList();

    List<Goods> getGoodsAndUserList1();

    List<Goods> getGoodsAndUserList2();
}
