package com.binger.goods.service;

import com.binger.goods.domain.GoodsBrandExample;

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


}