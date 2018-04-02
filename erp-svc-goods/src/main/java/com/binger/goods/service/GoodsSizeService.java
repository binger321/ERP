package com.binger.goods.service;

import com.binger.goods.domain.GoodsSize;
import com.binger.goods.domain.GoodsSizeExample;
import com.binger.goods.vo.GoodsDetailVo;
import com.binger.goods.vo.GoodsSizeDetailVo;
import com.binger.goods.vo.GoodsSizeVo;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2017/12/19 0019
 * Time: 17:31
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public interface GoodsSizeService {
    /**
     * 得到条件下size的数量
     * @param goodsSizeExample
     * @return
     */
    long countSizesByExample(GoodsSizeExample goodsSizeExample);

    /**
     * 得到size列表
     * @param goodsSizeExample
     * @return
     */
    List<GoodsSizeVo> listSizeByExample(GoodsSizeExample goodsSizeExample);

    /**
     * 根据id查询尺寸
     * @param id
     * @return
     */
    GoodsSizeDetailVo selectSizeByPrimaryId(Integer id);

    /**
     * 根据id更新尺寸
     * @param goodsSize
     * @param id
     * @return
     */
    GoodsSizeDetailVo updateSizeById(GoodsSize goodsSize, Integer id);
}