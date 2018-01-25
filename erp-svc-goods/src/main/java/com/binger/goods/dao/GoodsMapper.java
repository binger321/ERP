package com.binger.goods.dao;

import com.binger.goods.domain.Goods;
import com.binger.goods.domain.GoodsExample;
import com.binger.goods.dto.query.GoodsIndexListQueryDto;
import com.binger.goods.dto.ret.GoodsIndexDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsMapper {
    long countByExample(GoodsExample example);

    int deleteByExample(GoodsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Goods record);

    int insertSelective(Goods record);

    List<Goods> selectByExampleWithColSelected(GoodsExample example);

    List<Goods> selectByExample(GoodsExample example);

    Goods selectByPrimaryKeyWithColSelected(@Param("id") Integer id, @Param("selectiveField") GoodsExample.SelectiveField selectiveField);

    Goods selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Goods record, @Param("example") GoodsExample example);

    int updateByExample(@Param("record") Goods record, @Param("example") GoodsExample example);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);

    Long countGoodsIndexDto(@Param("queryDto") GoodsIndexListQueryDto goodsIndexListQueryDto);

    List<GoodsIndexDto> listGoodsIndex(@Param("queryDto") GoodsIndexListQueryDto goodsIndexListQueryDto);
}