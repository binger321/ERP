package com.binger.goods.service.impl;

import com.binger.common.util.DozerUtils;
import com.binger.goods.dao.GoodsColorMapper;
import com.binger.goods.domain.GoodsColor;
import com.binger.goods.domain.GoodsColorExample;
import com.binger.goods.service.GoodsColorService;
import com.binger.goods.vo.GoodsColorDetailVo;
import com.binger.goods.vo.GoodsColorVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2017/12/19 0019
 * Time: 17:31
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Service
public class GoodsColorServiceImpl implements GoodsColorService{
    @Autowired
    GoodsColorMapper goodsColorMapper;


    @Override
    public long countGoodsColorByExample(GoodsColorExample goodsColorExample) {
        return goodsColorMapper.countByExample(goodsColorExample);
    }

    @Override
    public List<GoodsColorVo> listGoodsColor(GoodsColorExample goodsColorExample) {
        List<GoodsColor> goodsColorList = goodsColorMapper.selectByExample(goodsColorExample);
        return DozerUtils.convertList(goodsColorList, GoodsColorVo.class);
    }

    @Override
    public GoodsColorDetailVo findColorById(Integer id) {
        GoodsColor goodsColor = goodsColorMapper.selectByPrimaryKey(id);
        return DozerUtils.convert(goodsColor, GoodsColorDetailVo.class);
    }

    @Override
    public GoodsColorDetailVo updateColorById(GoodsColor goodsColor) {
        long count = goodsColorMapper.updateByPrimaryKeySelective(goodsColor);
        if (count > 0){
            GoodsColor color = goodsColorMapper.selectByPrimaryKey(goodsColor.getId());
            return DozerUtils.convert(color, GoodsColorDetailVo.class);
        }else {
            return null;
        }
    }

    @Override
    public GoodsColorDetailVo addGoodsColor(GoodsColor goodsColor) {
        long count = goodsColorMapper.insert(goodsColor);
        if (count > 0){
            GoodsColor color = goodsColorMapper.selectByPrimaryKey(goodsColor.getId());
            return DozerUtils.convert(color, GoodsColorDetailVo.class);
        }else {
            return null;
        }
    }

    @Override
    public long deleteGoodsColor(Integer id) {
        return goodsColorMapper.deleteByPrimaryKey(id);
    }

    @Override
    public GoodsColorVo disableColor(Integer id) {
        GoodsColor goodsColor = new GoodsColor();
        goodsColor.setId(id);
        goodsColor.setStatus(false);
        goodsColor.setBlockTime(new Date());
        return DozerUtils.convert(updateColorById(goodsColor), GoodsColorVo.class);
    }

    @Override
    public GoodsColorVo enableColor(Integer id) {
        GoodsColor goodsColor = new GoodsColor();
        goodsColor.setId(id);
        goodsColor.setStatus(true);
        return DozerUtils.convert(updateColorById(goodsColor), GoodsColorVo.class);
    }

    @Override
    public boolean checkColorCode(String colorCode, Integer id) {
        GoodsColorExample goodsColorExample = new GoodsColorExample();
        GoodsColorExample.Criteria criteria = goodsColorExample.createCriteria();
        criteria.andColorCodeEqualTo(colorCode);
        if (id != null){
            criteria.andIdNotEqualTo(id);
        }
        if (goodsColorMapper.countByExample(goodsColorExample) > 0){
            return false;
        }else {
            return true;
        }
    }


}