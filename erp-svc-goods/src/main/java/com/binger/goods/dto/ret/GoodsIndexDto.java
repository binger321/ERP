package com.binger.goods.dto.ret;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/1/25 0025
 * Time: 18:39
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
public class GoodsIndexDto {

    /**
     * id
     */
    private Integer id;
    /**
     * 商品货号
     */
    private String goodsCode;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 商品类型 1普通款，2半精品，3精品款，4星标款
     */
    private Integer goodsType;

    /**
     * 图片
     */
    private String mainImgUrl;

    /**
     * 品牌ID
     */
    private Integer brandId;

    /**
     * 品牌
     */
    private String brandName;

    /**
     * 重量(g)
     */
    private BigDecimal weight;
    /**
     * 供应商ID
     */
    private Integer supplierId;

    /**
     * 供应商
     */
    private String supplierName;

    /**
     * 成本价
     */
    private BigDecimal costPrice;

    /**
     * 是否生产款
     */
    private Integer isProduction;
}