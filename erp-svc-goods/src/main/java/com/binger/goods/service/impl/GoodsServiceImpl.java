package com.binger.goods.service.impl;

import com.binger.common.util.DozerUtils;
import com.binger.goods.controller.form.GoodsForm;
import com.binger.goods.dao.GoodsMapper;
import com.binger.goods.domain.Goods;
import com.binger.goods.domain.GoodsExample;
import com.binger.goods.service.GoodsService;
import com.binger.goods.vo.GoodsDetailVo;
import com.binger.goods.vo.GoodsVo;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2017/12/13 0013
 * Time: 18:44
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Service
public class GoodsServiceImpl implements GoodsService{
    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public Long countGoods(GoodsExample goodsExample) {
        return goodsMapper.countByExample(goodsExample);

    }

    @Override
    public List<GoodsVo> listGoodsVo(GoodsExample goodsExample) {
        List<Goods> goodsList=goodsMapper.selectByExample(goodsExample);
        if (CollectionUtils.isNotEmpty(goodsList)){
            return DozerUtils.convertList(goodsList,GoodsVo.class);
        }
        return null;
    }

    @Override
    public GoodsDetailVo findGoodsDetailById(Integer id) {
        Goods goods=goodsMapper.selectByPrimaryKey(id);
        return DozerUtils.convert(goods,GoodsDetailVo.class);
    }

    @Override
    public GoodsDetailVo updateGoods(Integer id, GoodsForm goodsForm) {
        Goods goods=DozerUtils.convert(goodsForm,Goods.class);
        goods.setId(id);
        goodsMapper.updateByPrimaryKeySelective(goods);
        Goods newGoods= goodsMapper.selectByPrimaryKey(id);
        return DozerUtils.convert(newGoods,GoodsDetailVo.class);
    }

    @Override
    public GoodsDetailVo insertGoods(GoodsForm goodsForm) {
        Goods goods=DozerUtils.convert(goodsForm,Goods.class);
        Integer id=goodsMapper.insert(goods);
        Goods newGoods=goodsMapper.selectByPrimaryKey(id);
        return DozerUtils.convert(newGoods,GoodsDetailVo.class);

    }

    @Override
    public Integer deleteByPrimaryId(Integer id) {
        return goodsMapper.deleteByPrimaryKey(id);
    }
}