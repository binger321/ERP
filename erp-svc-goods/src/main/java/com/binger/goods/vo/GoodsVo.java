package com.binger.goods.vo;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2017/12/14 0014
 * Time: 16:27
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class GoodsVo {
    /**
     * ID
     */
    @ApiModelProperty(value="ID")
    private Integer id;

    /**
     * 商品货号
     */
    @ApiModelProperty(value="商品货号")
    private String goodsCode;

    /**
     * 商品名称
     */
    @ApiModelProperty(value="商品名称")
    private String goodsName;

    /**
     * 商品英文名称
     */
    @ApiModelProperty(value="商品英文名称")
    private String goodsEnName;

    /**
     * 品牌ID
     */
    @ApiModelProperty(value="品牌ID")
    private Integer brandId;

    /**
     * 成本价
     */
    @ApiModelProperty(value="成本价")
    private BigDecimal costPrice;


    /**
     * 是否生产款 100采购款 200生产款 300部分生产部分采购
     */
    @ApiModelProperty(value="是否生产款 100采购款 200生产款 300部分生产部分采购")
    private Integer isProduction;

    /**
     * 0禁用, 1启用
     */
    @ApiModelProperty(value="0禁用, 1启用")
    private Boolean status;

}