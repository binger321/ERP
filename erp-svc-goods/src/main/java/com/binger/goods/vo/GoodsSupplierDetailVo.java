package com.binger.goods.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2017/12/19 0019
 * Time: 16:26
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
@ApiModel("供应商详情")
public class GoodsSupplierDetailVo {
    /**
     * ID
     */
    @ApiModelProperty(value="ID")
    private Integer id;

    /**
     * 商品ID
     */
    @ApiModelProperty(value="商品ID")
    private Integer goodsId;

    /**
     * 供应商ID
     */
    @ApiModelProperty(value="供应商ID")
    private Integer supplierId;

    /**
     * 供应商编码
     */
    @ApiModelProperty(value="供应商编码")
    private String supplierCode;

    /**
     * 供应商名称
     */
    @ApiModelProperty(value="供应商名称")
    private String supplierName;

    /**
     *
     */
    @ApiModelProperty(value="")
    private BigDecimal importPrice;

    /**
     * 采购链接
     */
    @ApiModelProperty(value="采购链接")
    private String purchaseLink;

    /**
     * 供应商货号
     */
    @ApiModelProperty(value="供应商货号")
    private String supplierGoodsCode;

    /**
     * 是否同款
     */
    @ApiModelProperty(value="是否同款")
    private Boolean isSame;

    /**
     * 0禁用, 1启用
     */
    @ApiModelProperty(value="0禁用, 1启用")
    private Boolean status;

    /**
     * 创建人
     */
    @ApiModelProperty(value="创建人")
    private String creator;

    /**
     * 创建时间
     */
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    /**
     * 修改人
     */
    @ApiModelProperty(value="修改人")
    private String modifier;

    /**
     * 修改时间
     */
    @ApiModelProperty(value="修改时间")
    private Date modifyTime;

}