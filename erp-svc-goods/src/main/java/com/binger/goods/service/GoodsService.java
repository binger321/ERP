package com.binger.goods.service;

import com.binger.goods.controller.form.GoodsForm;
import com.binger.goods.domain.GoodsExample;
import com.binger.goods.dto.query.GoodsIndexListQueryDto;
import com.binger.goods.vo.GoodsDetailVo;
import com.binger.goods.vo.GoodsVo;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2017/12/13 0013
 * Time: 18:43
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public interface GoodsService {
    /**
     * 计算所有商品的数量
     * @param goodsIndexListQueryDto
     * @return
     */
    Long countGoods(GoodsIndexListQueryDto goodsIndexListQueryDto);

    /**
     * 列出所有商品信息
     * @param goodsIndexListQueryDto
     * @return
     */
    List<GoodsVo> listGoodsVo(GoodsIndexListQueryDto goodsIndexListQueryDto);

    /**
     * 根据id查询商品详细信息
     * @param id
     * @return
     */
    GoodsDetailVo findGoodsDetailById(Integer id);

    /**
     * 更新产品信息
     * @param id
     * @param goodsForm
     * @return
     */
    GoodsDetailVo updateGoods(Integer id, GoodsForm goodsForm);

    /**
     * 新增商品
     * @param goodsForm
     * @return
     */
    GoodsDetailVo insertGoods(GoodsForm goodsForm);

    /**
     * 删除商品
     * @param id
     * @return
     */
    Integer deleteByPrimaryId(Integer id);

    /**
     * 根据少量的条件查询商品数量
     * @param goodsExample
     * @return
     */
    long countGoodsByExample(GoodsExample goodsExample);
}