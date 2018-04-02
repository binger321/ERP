package com.binger.goods.service;

import com.binger.goods.domain.GoodsColor;
import com.binger.goods.domain.GoodsColorExample;
import com.binger.goods.vo.GoodsColorDetailVo;
import com.binger.goods.vo.GoodsColorVo;

import java.util.List;


/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2017/12/19 0019
 * Time: 17:31
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public interface GoodsColorService {
    /**
     * 根据条件查询颜色列表数量
     * @param goodsColorExample
     * @return
     */
    long countGoodsColorByExample(GoodsColorExample goodsColorExample);

    /**
     * 根据条件查询颜色列表
     * @param goodsColorExample
     * @return
     */
    List<GoodsColorVo> listGoodsColor(GoodsColorExample goodsColorExample);

    /**
     * 根据id查询颜色详情
     * @param id
     * @return
     */
    GoodsColorDetailVo findColorById(Integer id);

    /**
     * 根据id修改颜色详情
     * @param goodsColor
     * @return
     */
    GoodsColorDetailVo updateColorById(GoodsColor goodsColor);

    /**
     * 新增颜色
     * @param goodsColor
     * @return
     */
    GoodsColorDetailVo addGoodsColor(GoodsColor goodsColor);

    /**
     * 删除颜色
     * @param id
     * @return
     */
    long deleteGoodsColor(Integer id);

    /**
     * 停用颜色
     * @param id
     * @return
     */
    GoodsColorVo disableColor(Integer id);

    /**
     * 启用颜色
     * @param id
     * @return
     */
    GoodsColorVo enableColor(Integer id);

    /**
     * 校验颜色编号的唯一性
     * @param colorCode
     * @param id
     * @return
     */
    boolean checkColorCode(String colorCode, Integer id);
}