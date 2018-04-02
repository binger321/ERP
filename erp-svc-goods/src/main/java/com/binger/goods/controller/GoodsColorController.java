package com.binger.goods.controller;

import com.binger.common.Const;
import com.binger.common.Page;
import com.binger.common.ServerResponse;
import com.binger.common.util.DozerUtils;
import com.binger.goods.controller.form.GoodsColorForm;
import com.binger.goods.controller.query.GoodsColorQuery;
import com.binger.goods.domain.GoodsColor;
import com.binger.goods.domain.GoodsColorExample;
import com.binger.goods.service.GoodsColorService;
import com.binger.goods.vo.GoodsColorDetailVo;
import com.binger.goods.vo.GoodsColorVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.Validate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2017/12/19 0019
 * Time: 16:32
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Api(value = "goodsColor",description = "商品颜色接口", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController(value = "商品颜色API")
@RequestMapping(value = "erp-svc-goods/goodsColor")
public class GoodsColorController {
    @Autowired
    GoodsColorService goodsColorService;

    @ApiOperation(value = "颜色列表")
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public ServerResponse<List<GoodsColorVo>> listColors(@RequestBody GoodsColorQuery goodsColorQuery,
                                                        @RequestParam(value = "pageNo", required = false) Integer pageNo,
                                                        @RequestParam(value = "pageSize", required = false) Integer pageSize){
        GoodsColorExample goodsColorExample = new GoodsColorExample();
        GoodsColorExample.Criteria criteria = goodsColorExample.createCriteria();
        if (StringUtils.isNotBlank(goodsColorQuery.getColorCode())){
            criteria.andColorCodeLike(goodsColorQuery.getColorCode());
        }
        if (StringUtils.isNotBlank(goodsColorQuery.getColorName())){
            criteria.andColorNameLike(goodsColorQuery.getColorName());
        }
        if (pageNo != null){
            long total = goodsColorService.countGoodsColorByExample(goodsColorExample);
            Page page = new Page(pageNo, pageSize, total);
            goodsColorExample.setLimit(page.getPageSize());
            goodsColorExample.setOffset(page.getOffset());
            List<GoodsColorVo> goodsColorVoList = goodsColorService.listGoodsColor(goodsColorExample);
            return ServerResponse.createBySuccess(Const.SUCCESS_MSG, goodsColorVoList);
        }else {
            List<GoodsColorVo> goodsColorVoList = goodsColorService.listGoodsColor(goodsColorExample);
            return ServerResponse.createBySuccess(Const.SUCCESS_MSG, goodsColorVoList);
        }

    }

    @ApiOperation(value = "根据id查询颜色")
    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public ServerResponse<GoodsColorDetailVo> findColorById(@PathVariable Integer id){
        GoodsColorDetailVo goodsColorDetailVo = goodsColorService.findColorById(id);
        if (goodsColorDetailVo != null){
            return ServerResponse.createBySuccess(Const.SUCCESS_MSG, goodsColorDetailVo);
        }else {
            return ServerResponse.createByError("没有该id的颜色");
        }
    }

    @ApiOperation(value = "修改颜色")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public ServerResponse<GoodsColorDetailVo> updateColorById(@RequestBody GoodsColorForm goodsColorForm,
                                                              @PathVariable Integer id){
        GoodsColor goodsColor = DozerUtils.convert(goodsColorForm, GoodsColor.class);
        goodsColor.setId(id);
        if (!goodsColorService.checkColorCode(goodsColor.getColorCode(), id)){
            return ServerResponse.createByError("该颜色编号已存在");
        }
        GoodsColorDetailVo goodsColorDetailVo = goodsColorService.updateColorById(goodsColor);
        if (goodsColorDetailVo != null){
            return ServerResponse.createBySuccess(Const.SUCCESS_MSG, goodsColorDetailVo);
        }else {
            return ServerResponse.createByError(Const.FAIL_MSG);
        }
    }

    @ApiOperation(value = "新增颜色")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ServerResponse<GoodsColorDetailVo> addGoodsColor(@RequestBody GoodsColorForm goodsColorForm){
        GoodsColor goodsColor = DozerUtils.convert(goodsColorForm, GoodsColor.class);
        if (!goodsColorService.checkColorCode(goodsColor.getColorCode(), null)){
            return ServerResponse.createByError("该颜色编号已存在");
        }
        GoodsColorDetailVo goodsColorDetailVo = goodsColorService.addGoodsColor(goodsColor);
        if (goodsColorDetailVo != null){
            return ServerResponse.createBySuccess(Const.SUCCESS_MSG, goodsColorDetailVo);
        }else {
            return ServerResponse.createByError(Const.FAIL_MSG);
        }
    }

    @ApiOperation(value = "删除颜色")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    public ServerResponse deleteGoodsColor(@PathVariable Integer id){
        long count = goodsColorService.deleteGoodsColor(id);
        if (count > 0){
            return ServerResponse.createBySuccess(Const.SUCCESS_MSG, count);
        }else {
            return ServerResponse.createByError(Const.FAIL_MSG);
        }
    }

    @ApiOperation(value = "停用颜色")
    @RequestMapping(value = "/disable/{id}", method = RequestMethod.POST)
    public ServerResponse<GoodsColorVo> disableColor(@PathVariable Integer id){
        GoodsColorDetailVo goodsColorDetailVo = goodsColorService.findColorById(id);
        if (goodsColorDetailVo != null && !goodsColorDetailVo.getStatus()){
            return ServerResponse.createByError("该颜色已被停用");
        }
        GoodsColorVo goodsColorVo = goodsColorService.disableColor(id);
        if (goodsColorVo != null){
            return ServerResponse.createBySuccess(Const.SUCCESS_MSG, goodsColorVo);
        }else {
            return ServerResponse.createByError(Const.FAIL_MSG);
        }
    }

    @ApiOperation(value = "启用颜色")
    @RequestMapping(value = "/enable/{id}", method = RequestMethod.POST)
    public ServerResponse<GoodsColorVo> enableColor(@PathVariable Integer id){
        GoodsColorDetailVo goodsColorDetailVo = goodsColorService.findColorById(id);
        if (goodsColorDetailVo != null && goodsColorDetailVo.getStatus()){
            return ServerResponse.createByError("该颜色已被启用");
        }
        GoodsColorVo goodsColorVo = goodsColorService.enableColor(id);
        if (goodsColorVo != null){
            return ServerResponse.createBySuccess(Const.SUCCESS_MSG, goodsColorVo);
        }else {
            return ServerResponse.createByError(Const.FAIL_MSG);
        }
    }
}