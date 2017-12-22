package com.binger.goods.controller.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2017/12/14 0014
 * Time: 16:49
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
@ApiModel(value = "商品Form")
public class GoodsForm {

    /**
     * 商品货号
     */
    @ApiModelProperty(value="商品货号",required = true)
    private String goodsCode;

    /**
     * 商品名称
     */
    @ApiModelProperty(value="商品名称",required = true)
    private String goodsName;

    /**
     * 商品英文名称
     */
    @ApiModelProperty(value="商品英文名称",required = false)
    private String goodsEnName;

    /**
     *
     */
    @ApiModelProperty(value="",required = false)
    private String mainImgUrl;

    /**
     * 一级分类ID
     */
    @ApiModelProperty(value="一级分类ID",required = false)
    private Integer categoryOneId;

    /**
     * 二级分类ID
     */
    @ApiModelProperty(value="二级分类ID",required = false)
    private Integer categoryTwoId;

    /**
     * 三级分类ID
     */
    @ApiModelProperty(value="三级分类ID",required = false)
    private Integer categoryThreeId;

    /**
     * 四级分类ID
     */
    @ApiModelProperty(value="四级分类ID",required = false)
    private Integer categoryFourId;

    /**
     * 品牌ID
     */
    @ApiModelProperty(value="品牌ID",required = false)
    private Integer brandId;

    /**
     * 成本价
     */
    @ApiModelProperty(value="成本价",required = false)
    private BigDecimal costPrice;

    /**
     *
     */
    @ApiModelProperty(value="",required = false)
    private BigDecimal weight;

    /**
     * 规格
     */
    @ApiModelProperty(value="规格",required = false)
    private String specification;

    /**
     * 型号
     */
    @ApiModelProperty(value="型号",required = false)
    private String model;

    /**
     * 材质
     */
    @ApiModelProperty(value="材质",required = false)
    private String material;

    /**
     * 是否生产款 100采购款 200生产款 300部分生产部分采购
     */
    @ApiModelProperty(value="是否生产款 100采购款 200生产款 300部分生产部分采购",required = false)
    private Integer isProduction;

    /**
     * 负责人ID
     */
    @ApiModelProperty(value="负责人ID",required = false)
    private Integer managerId;

    /**
     * 负责人
     */
    @ApiModelProperty(value="负责人",required = false)
    private String managerName;

    /**
     * 采购链接
     */
    @ApiModelProperty(value="采购链接",required = false)
    private String purchaseLink;

    /**
     * 同款采购链接
     */
    @ApiModelProperty(value="同款采购链接",required = false)
    private String samePurchaseLink;

    /**
     * 款式ID
     */
    @ApiModelProperty(value="款式ID",required = false)
    private Integer styleId;

    /**
     * 风格1
     */
    @ApiModelProperty(value="风格1",required = false)
    private String styleOne;

    /**
     * 风格2
     */
    @ApiModelProperty(value="风格2",required = false)
    private String styleTwo;

    /**
     * 风格3
     */
    @ApiModelProperty(value="风格3",required = false)
    private String styleThree;

    /**
     * 风格4
     */
    @ApiModelProperty(value="风格4",required = false)
    private String styleFour;

    /**
     * 风格5
     */
    @ApiModelProperty(value="风格5",required = false)
    private String styleFive;

    /**
     * 风格6
     */
    @ApiModelProperty(value="风格6",required = false)
    private String styleSix;

    /**
     * 风格7
     */
    @ApiModelProperty(value="风格7",required = false)
    private String styleSeven;

    /**
     * 风格8
     */
    @ApiModelProperty(value="风格8",required = false)
    private String styleEight;

    /**
     * 商品类型 1普通款，2半精品，3精品款，4星标款
     */
    @ApiModelProperty(value="商品类型 1普通款，2半精品，3精品款，4星标款",required = false)
    private Integer goodsType;
}