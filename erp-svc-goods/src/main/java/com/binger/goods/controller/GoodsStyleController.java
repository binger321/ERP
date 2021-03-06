package com.binger.goods.controller;

import io.swagger.annotations.Api;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2017/12/19 0019
 * Time: 16:34
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Api(value = "goodsStyle",description = "商品品牌接口", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController(value = "商品款式API")
@RequestMapping(value = "erp-svc-goods/goodsStyle")
public class GoodsStyleController {
}