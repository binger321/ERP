package com.binger.goods.dao;

import com.binger.goods.domain.GoodsImg;
import com.binger.goods.domain.GoodsImgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsImgMapper {
    long countByExample(GoodsImgExample example);

    int deleteByExample(GoodsImgExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsImg record);

    int insertSelective(GoodsImg record);

    List<GoodsImg> selectByExampleWithColSelected(GoodsImgExample example);

    List<GoodsImg> selectByExample(GoodsImgExample example);

    GoodsImg selectByPrimaryKeyWithColSelected(@Param("id") Integer id, @Param("selectiveField") GoodsImgExample.SelectiveField selectiveField);

    GoodsImg selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodsImg record, @Param("example") GoodsImgExample example);

    int updateByExample(@Param("record") GoodsImg record, @Param("example") GoodsImgExample example);

    int updateByPrimaryKeySelective(GoodsImg record);

    int updateByPrimaryKey(GoodsImg record);
}