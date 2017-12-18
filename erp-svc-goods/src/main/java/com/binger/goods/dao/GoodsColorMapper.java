package com.binger.goods.dao;

import com.binger.goods.domain.GoodsColor;
import com.binger.goods.domain.GoodsColorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsColorMapper {
    long countByExample(GoodsColorExample example);

    int deleteByExample(GoodsColorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsColor record);

    int insertSelective(GoodsColor record);

    List<GoodsColor> selectByExampleWithColSelected(GoodsColorExample example);

    List<GoodsColor> selectByExample(GoodsColorExample example);

    GoodsColor selectByPrimaryKeyWithColSelected(@Param("id") Integer id, @Param("selectiveField") GoodsColorExample.SelectiveField selectiveField);

    GoodsColor selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodsColor record, @Param("example") GoodsColorExample example);

    int updateByExample(@Param("record") GoodsColor record, @Param("example") GoodsColorExample example);

    int updateByPrimaryKeySelective(GoodsColor record);

    int updateByPrimaryKey(GoodsColor record);
}