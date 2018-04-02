package com.binger.goods.controller;

import com.binger.common.Const;
import com.binger.common.Page;
import com.binger.common.ServerResponse;
import com.binger.common.util.DozerUtils;
import com.binger.goods.controller.form.GoodsSizeForm;
import com.binger.goods.controller.query.GoodsSizeQuery;
import com.binger.goods.domain.GoodsSize;
import com.binger.goods.domain.GoodsSizeExample;
import com.binger.goods.service.GoodsSizeService;
import com.binger.goods.vo.GoodsDetailVo;
import com.binger.goods.vo.GoodsSizeDetailVo;
import com.binger.goods.vo.GoodsSizeVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2017/12/19 0019
 * Time: 16:33
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Api(value = "goodsSize",description = "商品尺寸接口", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController(value = "商品尺寸API")
@RequestMapping(value = "erp-svc-goods/goodsSize")
public class GoodsSizeController {
    @Autowired
    GoodsSizeService goodsSizeService;
    @ApiOperation(value = "尺寸列表")
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public ServerResponse<List<GoodsSizeVo>> listGoodsSizes(@RequestBody GoodsSizeQuery goodsSizeQuery,
                                                           @RequestParam(required = false) Integer pageNo,
                                                           @RequestParam(required = false) Integer pageSize){
        GoodsSizeExample goodsSizeExample = new GoodsSizeExample();
        goodsSizeExample.createCriteria()
                .andSizeCodeLike(goodsSizeQuery.getSizeCode())
                .andSizeNameLike(goodsSizeQuery.getSizeName());
        long total = goodsSizeService.countSizesByExample(goodsSizeExample);
        if (total <= 0){
            return ServerResponse.createByError("没有相应的尺寸");
        }
        if (pageNo != null) {
            Page page = new Page(pageNo, pageSize, total);
            goodsSizeExample.setOffset(page.getOffset());
            goodsSizeExample.setLimit(page.getPageSize());
            List<GoodsSizeVo> goodsSizeVoList = goodsSizeService.listSizeByExample(goodsSizeExample);
            return ServerResponse.createBySuccess(Const.SUCCESS_MSG, goodsSizeVoList);
        }else {
            List<GoodsSizeVo> goodsSizeVoList = goodsSizeService.listSizeByExample(goodsSizeExample);
            return ServerResponse.createBySuccess(Const.SUCCESS_MSG, goodsSizeVoList);
        }
    }

    @ApiOperation(value = "尺寸详情")
    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public ServerResponse<GoodsSizeDetailVo> findSizeById(@Validated Integer id){
        GoodsSizeDetailVo goodsSizeDetailVo = goodsSizeService.selectSizeByPrimaryId(id);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG,goodsSizeDetailVo);
    }

    @ApiOperation(value = "修改尺寸")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public ServerResponse<GoodsDetailVo> updateSizeById(@Validated Integer id,
                                                        @RequestBody GoodsSizeForm goodsSizeForm){
        GoodsSize goodsSize = DozerUtils.convert(goodsSizeForm, GoodsSize.class);
        GoodsSizeDetailVo goodsSizeDetailVo = goodsSizeService.updateSizeById(goodsSize, id);
        return null;
    }
}