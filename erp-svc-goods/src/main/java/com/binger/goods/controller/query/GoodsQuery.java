package com.binger.goods.controller.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2017/12/13 0013
 * Time: 20:21
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
@ApiModel("商品Query")
public class GoodsQuery {

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
     * 商品类型 1普通款，2半精品，3精品款，4星标款
     */
    @ApiModelProperty(value="商品类型 1普通款，2半精品，3精品款，4星标款")
    private Integer goodsType;

    /**
     * SKU编码
     */
    @ApiModelProperty(value="SKU编码")
    private String skuCode;



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
     * 供应商ID
     */
    @ApiModelProperty(value="供应商ID")
    private Integer supplierId;



    /**
     * 开始时间
     */@ApiModelProperty(value="开始时间")
    private String startTime;

    /**
     * 结束时间
     */
    @ApiModelProperty(value="结束时间")
    private String endTime;

    /**
     * 0禁用, 1启用
     */
    @ApiModelProperty(value="0禁用, 1启用")
    private Boolean status;

    /**
     * 是否生产款
     */
    @ApiModelProperty(value="是否生产款 100采购款 200生产款")
    private Integer isProduction;
}
