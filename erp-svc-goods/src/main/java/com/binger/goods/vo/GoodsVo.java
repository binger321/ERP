package com.binger.goods.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2017/12/14 0014
 * Time: 16:27
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
@ApiModel("商品详情")
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
     * 图片
     */
    @ApiModelProperty(value="图片")
    private String mainImgUrl;

    /**
     * 重量(g)
     */
    @ApiModelProperty(value="重量(g)")
    private BigDecimal weight;

    /**
     * 供应商ID
     */
    @ApiModelProperty(value="供应商ID")
    private Integer supplierId;

    /**
     * 供应商
     */
    @ApiModelProperty(value="供应商")
    private String supplierName;

    /**
     * 品牌ID
     */
    @ApiModelProperty(value="品牌ID")
    private Integer brandId;

    /**
     * 品牌
     */
    @ApiModelProperty(value="品牌")
    private String brandName;

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
     * 商品类型 1普通款，2半精品，3精品款，4星标款
     */
    @ApiModelProperty(value="商品类型 1普通款，2半精品，3精品款，4星标款")
    private Integer goodsType;

    /**
     * 0禁用, 1启用
     */
    @ApiModelProperty(value="0禁用, 1启用")
    private Boolean status;

}