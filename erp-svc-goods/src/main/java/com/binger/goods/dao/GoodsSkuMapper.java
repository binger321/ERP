package com.binger.goods.dao;

import com.binger.goods.domain.GoodsSku;
import com.binger.goods.domain.GoodsSkuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsSkuMapper {
    long countByExample(GoodsSkuExample example);

    int deleteByExample(GoodsSkuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsSku record);

    int insertSelective(GoodsSku record);

    List<GoodsSku> selectByExampleWithColSelected(GoodsSkuExample example);

    List<GoodsSku> selectByExample(GoodsSkuExample example);

    GoodsSku selectByPrimaryKeyWithColSelected(@Param("id") Integer id, @Param("selectiveField") GoodsSkuExample.SelectiveField selectiveField);

    GoodsSku selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodsSku record, @Param("example") GoodsSkuExample example);

    int updateByExample(@Param("record") GoodsSku record, @Param("example") GoodsSkuExample example);

    int updateByPrimaryKeySelective(GoodsSku record);

    int updateByPrimaryKey(GoodsSku record);
}