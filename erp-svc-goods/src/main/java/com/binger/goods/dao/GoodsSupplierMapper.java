package com.binger.goods.dao;

import com.binger.goods.domain.GoodsSupplier;
import com.binger.goods.domain.GoodsSupplierExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsSupplierMapper {
    long countByExample(GoodsSupplierExample example);

    int deleteByExample(GoodsSupplierExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsSupplier record);

    int insertSelective(GoodsSupplier record);

    List<GoodsSupplier> selectByExampleWithColSelected(GoodsSupplierExample example);

    List<GoodsSupplier> selectByExample(GoodsSupplierExample example);

    GoodsSupplier selectByPrimaryKeyWithColSelected(@Param("id") Integer id, @Param("selectiveField") GoodsSupplierExample.SelectiveField selectiveField);

    GoodsSupplier selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodsSupplier record, @Param("example") GoodsSupplierExample example);

    int updateByExample(@Param("record") GoodsSupplier record, @Param("example") GoodsSupplierExample example);

    int updateByPrimaryKeySelective(GoodsSupplier record);

    int updateByPrimaryKey(GoodsSupplier record);
}