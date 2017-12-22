package com.binger.goods.service.impl;

import com.binger.common.util.DozerUtils;
import com.binger.goods.dao.GoodsBrandMapper;
import com.binger.goods.domain.GoodsBrand;
import com.binger.goods.domain.GoodsBrandExample;
import com.binger.goods.service.GoodsBrandService;
import com.binger.goods.vo.GoodsBrandVo;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2017/12/18 0018
 * Time: 15:48
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Service
public class GoodsBrandServiceImpl implements GoodsBrandService {
    @Autowired
    GoodsBrandMapper goodsBrandMapper;
    @Override
    public Long countGoodsBrand(GoodsBrandExample goodsBrandExample) {
        return goodsBrandMapper.countByExample(goodsBrandExample);
    }

    @Override
    public List<GoodsBrandVo> listGoodsBrand(GoodsBrandExample goodsBrandExample) {
        List<GoodsBrand> goodsBrandList=goodsBrandMapper.selectByExample(goodsBrandExample);
        if(CollectionUtils.isNotEmpty(goodsBrandList)) {
            return DozerUtils.convertList(goodsBrandList,GoodsBrandVo.class);
        }
        return null;
    }

}