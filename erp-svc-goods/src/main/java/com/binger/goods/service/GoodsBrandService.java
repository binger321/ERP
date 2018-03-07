package com.binger.goods.service;

import com.binger.goods.domain.GoodsBrand;
import com.binger.goods.domain.GoodsBrandExample;
import com.binger.goods.vo.GoodsBrandVo;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2017/12/14 0014
 * Time: 20:53
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public interface GoodsBrandService {
    /**
     * 计算所有品牌的数量
     * @param goodsBrandExample
     * @return
     */
    Long countGoodsBrand(GoodsBrandExample goodsBrandExample);

    /**
     * 列出所有商品品牌
     * @param goodsBrandExample
     * @return
     */
    List<GoodsBrandVo> listGoodsBrand(GoodsBrandExample goodsBrandExample);

    /**
     * 查看商品品牌详情
     * @param id
     * @return
     */
    GoodsBrandVo findBrandById(Integer id);

    /**
     * 新增品牌
     * @param goodsBrand
     * @return
     */
    GoodsBrandVo addGoodsBrand(GoodsBrand goodsBrand);

    /**
     * 检查品牌编号的唯一性
     * @param Code
     * @param id
     * @return
     */
    long checkBrandCode(String Code, Integer id);

    /**
     * 更新品牌信息
     * @param goodsBrand
     * @return
     */
    GoodsBrandVo updateGoodsBrand(GoodsBrand goodsBrand);

    /**
     * 根据id删除品牌
     * @param id
     * @return
     */
    long deleteBrandById(Integer id);

    /**
     * 根据id停用品牌
     * @param id
     * @return
     */
    GoodsBrandVo disableBrandById(Integer id);

    /**
     * 根据id启用品牌
     * @param id
     * @return
     */
    GoodsBrandVo enableBrandById(Integer id);
}