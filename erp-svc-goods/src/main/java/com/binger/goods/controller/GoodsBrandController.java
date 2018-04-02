package com.binger.goods.controller;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2017/12/18 0018
 * Time: 15:14
 * To change this template use File | Settings | File Templates.
 * Description:
 */

import com.binger.common.Const;
import com.binger.common.Page;
import com.binger.common.ServerResponse;
import com.binger.common.util.DozerUtils;
import com.binger.goods.controller.form.GoodsBrandForm;
import com.binger.goods.controller.query.GoodsBrandQuery;
import com.binger.goods.domain.GoodsBrand;
import com.binger.goods.domain.GoodsBrandExample;
import com.binger.goods.domain.GoodsExample;
import com.binger.goods.service.GoodsBrandService;
import com.binger.goods.service.GoodsService;
import com.binger.goods.vo.GoodsBrandDetailVo;
import com.binger.goods.vo.GoodsBrandVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
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

    @Autowired
    GoodsService goodsService;
    /**
     * 商品品牌列表
     * @param goodsBrandQuery
     * @param pageNo
     * @param pageSize
     * @return
     */
    @ApiOperation(value = "商品品牌列表")
    @RequestMapping(value = "/list",method = RequestMethod.POST)
    public ServerResponse<List<GoodsBrandVo>> listGoodsBrand(@RequestBody(required = false) GoodsBrandQuery goodsBrandQuery,
                                                             @RequestParam(name = "pageNo",required = false) Integer pageNo,
                                                             @RequestParam(name = "pageSize",required = false) Integer pageSize){

        GoodsBrandExample goodsBrandExample = new GoodsBrandExample();
        GoodsBrandExample.Criteria criteria = goodsBrandExample.createCriteria();
        if (!StringUtils.isBlank(goodsBrandQuery.getBrandCode())){
            criteria.andBrandCodeLike(goodsBrandQuery.getBrandCode());
        }
        if (!StringUtils.isBlank(goodsBrandQuery.getBrandName())){
            criteria.andBrandNameLike(goodsBrandQuery.getBrandName());
        }
        if(pageNo !=null){
            long total = goodsBrandService.countGoodsBrand(goodsBrandExample);
            Page page = new Page(pageNo, pageSize,total);
            goodsBrandExample.setOffset(page.getOffset());
            goodsBrandExample.setLimit(page.getPageSize());
            List<GoodsBrandVo> goodsBrandVoList = goodsBrandService.listGoodsBrand(goodsBrandExample);
            return ServerResponse.createBySuccess(Const.SUCCESS_MSG, goodsBrandVoList);
        }else {
            List<GoodsBrandVo> goodsBrandVoList = goodsBrandService.listGoodsBrand(goodsBrandExample);
            return ServerResponse.createBySuccess(Const.SUCCESS_MSG, goodsBrandVoList);
        }
    }

    /**
     * 根据id查询品牌
     * @param id
     * @return
     */
    @ApiOperation(value = "根据id查询品牌")
    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public ServerResponse<GoodsBrandDetailVo> findBrandById(@PathVariable Integer id){
        GoodsBrandDetailVo goodsBrandDetailVo = goodsBrandService.findBrandById(id);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, goodsBrandDetailVo);
    }

    /**
     * 新增品牌
     * @param goodsBrandForm
     * @return
     */
    @ApiOperation(value = "新增品牌")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ServerResponse<GoodsBrandVo> addGoodsBrand(@RequestBody GoodsBrandForm goodsBrandForm){
        if (StringUtils.isBlank(goodsBrandForm.getBrandCode())){
            return ServerResponse.createByError("品牌编号不能为空");
        }
        long count = goodsBrandService.checkBrandCode(goodsBrandForm.getBrandCode(), null);
        if (count > 0){
            return ServerResponse.createByError("品牌编号有重复");
        }
        GoodsBrand goodsBrand = DozerUtils.convert(goodsBrandForm, GoodsBrand.class);
        GoodsBrandVo goodsBrandVo = goodsBrandService.addGoodsBrand(goodsBrand);
        if (goodsBrandVo != null){
            return ServerResponse.createBySuccess(Const.SUCCESS_MSG, goodsBrandVo);
        }else {
            return ServerResponse.createByError(Const.FAIL_MSG);
        }
    }

    /**
     * 修改品牌
     * @param id
     * @param goodsBrandForm
     * @return
     */
    @ApiOperation(value = "修改品牌")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public ServerResponse<GoodsBrandDetailVo> updateGoodsBrand(@PathVariable Integer id,
                                                         @RequestBody GoodsBrandForm goodsBrandForm){
        if (StringUtils.isBlank(goodsBrandForm.getBrandCode())){
            return ServerResponse.createByError("品牌编号不能为空");
        }
        long count = goodsBrandService.checkBrandCode(goodsBrandForm.getBrandCode(), id);
        if (count > 0){
            return ServerResponse.createByError("品牌编号有重复");
        }
        GoodsBrand goodsBrand = DozerUtils.convert(goodsBrandForm, GoodsBrand.class);
        goodsBrand.setId(id);
        GoodsBrandDetailVo goodsBrandDetailVo = goodsBrandService.updateGoodsBrand(goodsBrand);
        if (goodsBrandDetailVo != null){
            return ServerResponse.createBySuccess(Const.SUCCESS_MSG, goodsBrandDetailVo);
        }else {
            return ServerResponse.createByError("未做修改!");
        }
    }

    /**
     * 删除品牌
     * @param id
     * @return
     */
    @ApiOperation(value = "删除品牌")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public ServerResponse deleteGoodsBrandById(@RequestParam Integer id){
        if (id == null){
            return ServerResponse.createByError("未传入需要删除的品牌");
        }
        GoodsExample goodsExample = new GoodsExample();
        GoodsExample.Criteria criteria = goodsExample.createCriteria();
        criteria.andBrandIdEqualTo(id);
        long goodsCount = goodsService.countGoodsByExample(goodsExample);
        if (goodsCount > 0){
            return ServerResponse.createByError("先删除该品牌的商品");
        }
        long deleteCount = goodsBrandService.deleteBrandById(id);
        if (deleteCount > 0){
            return ServerResponse.createBySuccess(Const.SUCCESS_MSG,deleteCount);
        }else {
            return ServerResponse.createByError(Const.FAIL_MSG);
        }
    }

    /**
     * 停用品牌
     * @param id
     * @return
     */
    @ApiOperation(value = "停用品牌")
    @RequestMapping(value = "/disable/{id}", method = RequestMethod.POST)
    public ServerResponse<GoodsBrandVo> disableGoodsBrandById(@PathVariable Integer id){
        GoodsBrandDetailVo goodsBrandDetailVo = goodsBrandService.findBrandById(id);
        if (goodsBrandDetailVo != null && goodsBrandDetailVo.getStatus()){
            return ServerResponse.createByError("该品牌已停用");
        }
        GoodsBrandVo brandVo = goodsBrandService.disableBrandById(id);
        if (brandVo != null){
            return ServerResponse.createBySuccess(Const.SUCCESS_MSG, brandVo);
        }else {
            return ServerResponse.createByError(Const.FAIL_MSG);
        }
    }

    /**
     * 启用品牌
     * @param id
     * @return
     */
    @ApiOperation(value = "启用品牌")
    @RequestMapping(value = "/enable/{id}", method = RequestMethod.POST)
    public ServerResponse<GoodsBrandVo> enableGoodsBrandById(@PathVariable Integer id){
        GoodsBrandDetailVo goodsBrandDetailVo = goodsBrandService.findBrandById(id);
        if (goodsBrandDetailVo != null && !goodsBrandDetailVo.getStatus()){
            return ServerResponse.createByError("该品牌已启用");
        }
        GoodsBrandVo brandVo = goodsBrandService.enableBrandById(id);
        if (brandVo != null){
            return ServerResponse.createBySuccess(Const.SUCCESS_MSG,brandVo);
        }else {
            return ServerResponse.createByError(Const.FAIL_MSG);
        }
    }
}