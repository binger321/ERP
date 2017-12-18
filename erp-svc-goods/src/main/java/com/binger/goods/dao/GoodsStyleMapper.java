package com.binger.goods.dao;

import com.binger.goods.domain.GoodsStyle;
import com.binger.goods.domain.GoodsStyleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsStyleMapper {
    long countByExample(GoodsStyleExample example);

    int deleteByExample(GoodsStyleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsStyle record);

    int insertSelective(GoodsStyle record);

    List<GoodsStyle> selectByExampleWithColSelected(GoodsStyleExample example);

    List<GoodsStyle> selectByExample(GoodsStyleExample example);

    GoodsStyle selectByPrimaryKeyWithColSelected(@Param("id") Integer id, @Param("selectiveField") GoodsStyleExample.SelectiveField selectiveField);

    GoodsStyle selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodsStyle record, @Param("example") GoodsStyleExample example);

    int updateByExample(@Param("record") GoodsStyle record, @Param("example") GoodsStyleExample example);

    int updateByPrimaryKeySelective(GoodsStyle record);

    int updateByPrimaryKey(GoodsStyle record);
}