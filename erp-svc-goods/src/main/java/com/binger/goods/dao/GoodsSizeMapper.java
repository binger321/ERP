package com.binger.goods.dao;

import com.binger.goods.domain.GoodsSize;
import com.binger.goods.domain.GoodsSizeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsSizeMapper {
    long countByExample(GoodsSizeExample example);

    int deleteByExample(GoodsSizeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsSize record);

    int insertSelective(GoodsSize record);

    List<GoodsSize> selectByExampleWithColSelected(GoodsSizeExample example);

    List<GoodsSize> selectByExample(GoodsSizeExample example);

    GoodsSize selectByPrimaryKeyWithColSelected(@Param("id") Integer id, @Param("selectiveField") GoodsSizeExample.SelectiveField selectiveField);

    GoodsSize selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodsSize record, @Param("example") GoodsSizeExample example);

    int updateByExample(@Param("record") GoodsSize record, @Param("example") GoodsSizeExample example);

    int updateByPrimaryKeySelective(GoodsSize record);

    int updateByPrimaryKey(GoodsSize record);
}