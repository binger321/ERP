package com.binger.goods.controller;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2017/12/18 0018
 * Time: 15:14
 * To change this template use File | Settings | File Templates.
 * Description:
 */

import ch.qos.logback.core.pattern.ConverterUtil;
import com.binger.common.Const;
import com.binger.common.Page;
import com.binger.common.ServerResponse;
import com.binger.common.util.DozerUtils;
import com.binger.goods.controller.query.GoodsBrandQuery;
import com.binger.goods.domain.GoodsBrand;
import com.binger.goods.domain.GoodsBrandExample;
import com.binger.goods.service.GoodsBrandService;
import com.binger.goods.vo.GoodsBrandVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 商品品牌
 */
@Api(value = "goodsBrand",description = "商品品牌接口", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController(value = "商品品牌API")
@RequestMapping(value = "erp-svc-goods/goodsBrand")
public class GoodsBrandController {
    @Autowired
    GoodsBrandService goodsBrandService;

    /**
     * 商品品牌列表
     * @param goodsBrandQuery
     * @param pageNo
     * @param pageSize
     * @return
     */
    @ApiOperation(value = "商品列表")
    @RequestMapping(value = "/listGoodsBrand",method = RequestMethod.POST)
    public ServerResponse<List<GoodsBrandVo>> listGoodsBrand(@RequestBody(required = false) GoodsBrandQuery goodsBrandQuery,
                                                             @RequestParam(name = "pageNo",required = false) Integer pageNo,
                                                             @RequestParam(name = "pageSize",required = false) Integer pageSize){
        GoodsBrandExample goodsBrandExample= DozerUtils.convert(goodsBrandQuery,GoodsBrandExample.class);
        if(pageNo !=null){
            Long total = goodsBrandService.countGoodsBrand(goodsBrandExample);
            Page page = new Page(pageNo,pageSize,total);
            goodsBrandExample.setOffset(page.getOffset());
            goodsBrandExample.setLimit(page.getPageSize());
            List<GoodsBrandVo> goodsBrandVoList=goodsBrandService.listGoodsBrand(goodsBrandExample);
            return ServerResponse.createBySuccess(Const.SUCCESS_MSG,goodsBrandVoList);
        }else {
            List<GoodsBrandVo> goodsBrandVoList=goodsBrandService.listGoodsBrand(goodsBrandExample);
            return ServerResponse.createBySuccess(Const.SUCCESS_MSG,goodsBrandVoList);
        }
    }
}