package com.binger.goods.service.impl;

import com.binger.common.util.DozerUtils;
import com.binger.goods.dao.GoodsBrandMapper;
import com.binger.goods.domain.GoodsBrand;
import com.binger.goods.domain.GoodsBrandExample;
import com.binger.goods.service.GoodsBrandService;
import com.binger.goods.vo.GoodsBrandDetailVo;
import com.binger.goods.vo.GoodsBrandVo;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
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

    @Override
    public GoodsBrandDetailVo findBrandById(Integer id) {
        GoodsBrand goodsBrand = goodsBrandMapper.selectByPrimaryKey(id);
        GoodsBrandDetailVo goodsBrandDetailVo = DozerUtils.convert(goodsBrand, GoodsBrandDetailVo.class);
        return goodsBrandDetailVo;
    }

    @Override
    public GoodsBrandVo addGoodsBrand(GoodsBrand goodsBrand) {
        long count = goodsBrandMapper.insertSelective(goodsBrand);
        if (count > 0){
            GoodsBrand brand = goodsBrandMapper.selectByPrimaryKey(goodsBrand.getId());
            return DozerUtils.convert(brand, GoodsBrandVo.class);
        }
        return null;
    }

    @Override
    public long checkBrandCode(String code, Integer id) {
        GoodsBrandExample goodsBrandExample = new GoodsBrandExample();
        GoodsBrandExample.Criteria criteria = goodsBrandExample.createCriteria();
        criteria.andBrandCodeEqualTo(code);
        if (id != null){
            criteria.andIdNotEqualTo(id);
        }
        return goodsBrandMapper.countByExample(goodsBrandExample);
    }

    @Override
    public GoodsBrandDetailVo updateGoodsBrand(GoodsBrand goodsBrand) {
        long count = goodsBrandMapper.updateByPrimaryKeySelective(goodsBrand);
        if (count > 0){
            GoodsBrand brand = goodsBrandMapper.selectByPrimaryKey(goodsBrand.getId());
            return DozerUtils.convert(brand, GoodsBrandDetailVo.class);
        }else {
            return null;
        }
    }

    @Override
    public long deleteBrandById(Integer id) {
        return goodsBrandMapper.deleteByPrimaryKey(id);
    }

    @Override
    public GoodsBrandVo disableBrandById(Integer id) {
        GoodsBrand goodsBrand = new GoodsBrand();
        goodsBrand.setId(id);
        goodsBrand.setStatus(true);
        return DozerUtils.convert(updateGoodsBrand(goodsBrand), GoodsBrandVo.class);
    }

    @Override
    public GoodsBrandVo enableBrandById(Integer id) {
        GoodsBrand goodsBrand = new GoodsBrand();
        goodsBrand.setId(id);
        goodsBrand.setStatus(false);
        return DozerUtils.convert(updateGoodsBrand(goodsBrand), GoodsBrandVo.class);
    }


}