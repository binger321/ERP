package com.binger.goods.controller;

import com.binger.common.Const;
import com.binger.common.Page;
import com.binger.common.ServerResponse;
import com.binger.common.util.DozerUtils;
import com.binger.common.util.QueryUtils;
import com.binger.common.vo.SplitStringVo;
import com.binger.goods.controller.form.GoodsForm;
import com.binger.goods.controller.query.GoodsQuery;
import com.binger.goods.domain.GoodsExample;
import com.binger.goods.dto.query.GoodsIndexListQueryDto;
import com.binger.goods.service.GoodsService;
import com.binger.goods.vo.GoodsDetailVo;
import com.binger.goods.vo.GoodsVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 2017/12/13 0013
 * Time: 18:43
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Api(value = "goods", description = "商品接口", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController(value = "商品API")
@RequestMapping(value = "/erp-svc-goods/goods")
public class GoodsController {
    private static final Logger logger = LoggerFactory.getLogger(GoodsController.class);

    @Autowired
    GoodsService goodsService;

    /**
     * 商品列表
     * @param goodsQuery
     * @param pageNo
     * @param pageSize
     * @return
     */
    @ApiOperation(value="商品列表")
    @RequestMapping(value = "/listGoods",method = RequestMethod.POST)
    public ServerResponse<List<GoodsVo>> listGoodsVo(@RequestBody(required = false) GoodsQuery goodsQuery,
                                                     @RequestParam(name = "pageNo", required = false) Integer pageNo,
                                                     @RequestParam(name = "pageSize", required = false) Integer pageSize){
        GoodsIndexListQueryDto goodsIndexListQueryDto= DozerUtils.convert(goodsQuery,GoodsIndexListQueryDto.class);
        if (StringUtils.isNotBlank(goodsQuery.getGoodsCode())){
            SplitStringVo splitStringVo = QueryUtils.stringStringWhenQuery(goodsQuery.getGoodsCode());
            goodsIndexListQueryDto.setGoodsCode(splitStringVo.getSingleValue());
            goodsIndexListQueryDto.setGoodsCodeList(splitStringVo.getListValue());
        }
        if (StringUtils.isNotBlank(goodsQuery.getSkuCode())){
            SplitStringVo splitStringVo = QueryUtils.stringStringWhenQuery(goodsQuery.getSkuCode());
            goodsIndexListQueryDto.setSkuCode(splitStringVo.getSingleValue());
            goodsIndexListQueryDto.setSkuCodeList(splitStringVo.getListValue());
        }
        if(pageNo != null){
            Long total = goodsService.countGoods(goodsIndexListQueryDto);
            Page page = new Page(pageNo,pageSize,total);
            goodsIndexListQueryDto.setOffset(page.getOffset());
            goodsIndexListQueryDto.setLimit(page.getPageSize());
            List<GoodsVo> goodsVoList=goodsService.listGoodsVo(goodsIndexListQueryDto);
            return ServerResponse.createBySuccess(Const.SUCCESS_MSG,goodsVoList);
        }else {
            List<GoodsVo> goodsVoList=goodsService.listGoodsVo(goodsIndexListQueryDto);
            return ServerResponse.createBySuccess(Const.SUCCESS_MSG,goodsVoList);
        }

    }

    /**
     * 根据id查看商品详情
     * @param id
     * @return
     */
    @ApiOperation(value="根据id查看商品详情")
    @RequestMapping(value = "/detail/{id}",method = RequestMethod.POST)
    public ServerResponse<GoodsDetailVo> findGoodsById(@PathVariable Integer id){
        GoodsDetailVo goodsDetailVo=goodsService.findGoodsDetailById(id);
        if (goodsDetailVo!=null){
            return ServerResponse.createBySuccess(Const.SUCCESS_MSG,goodsDetailVo);
        }
        return null;
    }

    /**
     * 更新商品信息
     * @param id
     * @param goodsForm
     * @return
     */

    @ApiOperation(value = "更新商品信息")
    @RequestMapping(value = "/update/{id}",method = RequestMethod.POST)
    public ServerResponse<GoodsDetailVo> updateGoods(@PathVariable Integer id,
                                                     @RequestBody GoodsForm goodsForm){
        GoodsDetailVo goodsDetailVo = goodsService.updateGoods(id,goodsForm);
        if (goodsDetailVo!=null){
            return ServerResponse.createBySuccess(Const.SUCCESS_MSG, goodsDetailVo);
        }
        return null;
    }

    /**
     * 增加商品
     * @param goodsForm
     * @return
     */

    @ApiOperation(value = "增加商品")
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public ServerResponse<GoodsDetailVo> insertGoods(@RequestBody GoodsForm goodsForm){
        GoodsDetailVo goodsDetailVo = goodsService.insertGoods(goodsForm);
        if (goodsDetailVo!=null){
            return ServerResponse.createBySuccess(Const.SUCCESS_MSG,goodsDetailVo);
        }
        return null;
    }

    @ApiOperation(value = "删除商品")
    @RequestMapping(value = "delete", method = RequestMethod.POST)
    public ServerResponse<Integer> deleteGoods(@RequestParam Integer id){
        Integer count = goodsService.deleteByPrimaryId(id);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG,count);
    }

}