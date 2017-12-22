package com.binger.goods.controller.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2017/12/19 0019
 * Time: 17:12
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
@ApiModel("商品SkuForm")
public class GoodsSkuForm {

    /**
     * 商品ID
     */
    @ApiModelProperty(value="商品ID",required = false)
    private Integer goodsId;

    /**
     *
     */
    @ApiModelProperty(value="",required = false)
    private String skuCode;

    /**
     * SKU名称
     */
    @ApiModelProperty(value="SKU名称",required = true)
    private String skuName;

    /**
     * 商品图片ID
     */
    @ApiModelProperty(value="商品图片ID",required = false)
    private Integer imgId;

    /**
     * 颜色ID
     */
    @ApiModelProperty(value="颜色ID",required = false)
    private Integer colorId;

    /**
     * 尺寸ID
     */
    @ApiModelProperty(value="尺寸ID",required = false)
    private Integer sizeId;

    /**
     * 尺码
     */
    @ApiModelProperty(value="尺码",required = false)
    private String size;

    /**
     *
     */
    @ApiModelProperty(value="",required = false)
    private BigDecimal weight;

    /**
     * 警戒库存数
     */
    @ApiModelProperty(value="警戒库存数",required = false)
    private Integer stockAlarmNum;

    /**
     * 是否生产款(100采购款，200生产款，300部分采购，部分生产)
     */
    @ApiModelProperty(value="是否生产款(100采购款，200生产款，300部分采购，部分生产)",required = false)
    private Integer isProduction;

    /**
     * 成本价
     */
    @ApiModelProperty(value="成本价",required = false)
    private BigDecimal costPrice;

    /**
     * 0禁用, 1启用
     */
    @ApiModelProperty(value="0禁用, 1启用",required = false)
    private Boolean status;

    /**
     * 停用时间
     */
    @ApiModelProperty(value="停用时间",required = false)
    private Date blockTime;

    /**
     * 创建人
     */
    @ApiModelProperty(value="创建人",required = false)
    private String creator;

    /**
     * 创建时间
     */
    @ApiModelProperty(value="创建时间",required = false)
    private Date createTime;

    /**
     * 修改人
     */
    @ApiModelProperty(value="修改人",required = false)
    private String modifier;

    /**
     * 修改时间
     */
    @ApiModelProperty(value="修改时间",required = false)
    private Date modifyTime;

    /**
     * 备注
     */
    @ApiModelProperty(value="备注",required = false)
    private String comments;

}