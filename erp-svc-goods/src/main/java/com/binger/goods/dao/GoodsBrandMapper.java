package com.binger.goods.dao;

import com.binger.goods.domain.GoodsBrand;
import com.binger.goods.domain.GoodsBrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsBrandMapper {
    long countByExample(GoodsBrandExample example);

    int deleteByExample(GoodsBrandExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsBrand record);

    int insertSelective(GoodsBrand record);

    List<GoodsBrand> selectByExampleWithColSelected(GoodsBrandExample example);

    List<GoodsBrand> selectByExample(GoodsBrandExample example);

    GoodsBrand selectByPrimaryKeyWithColSelected(@Param("id") Integer id, @Param("selectiveField") GoodsBrandExample.SelectiveField selectiveField);

    GoodsBrand selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodsBrand record, @Param("example") GoodsBrandExample example);

    int updateByExample(@Param("record") GoodsBrand record, @Param("example") GoodsBrandExample example);

    int updateByPrimaryKeySelective(GoodsBrand record);

    int updateByPrimaryKey(GoodsBrand record);
}