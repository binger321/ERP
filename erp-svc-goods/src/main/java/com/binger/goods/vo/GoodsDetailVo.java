package com.binger.goods.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2017/12/13 0013
 * Time: 20:13
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
@ApiModel("商品VO")
public class GoodsDetailVo {
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
     *
     */
    @ApiModelProperty(value="图片文件夹")
    private String mainImgUrl;

    /**
     * 一级分类ID
     */
    @ApiModelProperty(value="一级分类ID")
    private Integer categoryOneId;

    /**
     * 二级分类ID
     */
    @ApiModelProperty(value="二级分类ID")
    private Integer categoryTwoId;

    /**
     * 三级分类ID
     */
    @ApiModelProperty(value="三级分类ID")
    private Integer categoryThreeId;

    /**
     * 四级分类ID
     */
    @ApiModelProperty(value="四级分类ID")
    private Integer categoryFourId;

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
     *
     */
    @ApiModelProperty(value="")
    private BigDecimal weight;

    /**
     * 规格
     */
    @ApiModelProperty(value="规格")
    private String specification;

    /**
     * 型号
     */
    @ApiModelProperty(value="型号")
    private String model;

    /**
     * 材质
     */
    @ApiModelProperty(value="材质")
    private String material;

    /**
     * 是否生产款 100采购款 200生产款 300部分生产部分采购
     */
    @ApiModelProperty(value="是否生产款 100采购款 200生产款 300部分生产部分采购")
    private Integer isProduction;

    /**
     * 负责人ID
     */
    @ApiModelProperty(value="负责人ID")
    private Integer managerId;

    /**
     * 负责人
     */
    @ApiModelProperty(value="负责人")
    private String managerName;

    /**
     * 采购链接
     */
    @ApiModelProperty(value="采购链接")
    private String purchaseLink;

    /**
     * 同款采购链接
     */
    @ApiModelProperty(value="同款采购链接")
    private String samePurchaseLink;

    /**
     * 款式ID
     */
    @ApiModelProperty(value="款式ID")
    private Integer styleId;

    /**
     * 风格1
     */
    @ApiModelProperty(value="风格1")
    private String styleOne;

    /**
     * 风格2
     */
    @ApiModelProperty(value="风格2")
    private String styleTwo;

    /**
     * 风格3
     */
    @ApiModelProperty(value="风格3")
    private String styleThree;

    /**
     * 风格4
     */
    @ApiModelProperty(value="风格4")
    private String styleFour;

    /**
     * 风格5
     */
    @ApiModelProperty(value="风格5")
    private String styleFive;

    /**
     * 风格6
     */
    @ApiModelProperty(value="风格6")
    private String styleSix;

    /**
     * 风格7
     */
    @ApiModelProperty(value="风格7")
    private String styleSeven;

    /**
     * 风格8
     */
    @ApiModelProperty(value="风格8")
    private String styleEight;

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