package com.binger.goods.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 商品SKU表
 */
@ApiModel(value="商品SKU表")
public class GoodsSku implements Serializable {
    /**
     * ID
     */
    @ApiModelProperty(value="ID",required = true)
    private Integer id;

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

    /**
     * goods_sku
     */
    private static final long serialVersionUID = 1L;

    /**
     * ID
     * @return id ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * ID
     * @param id ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 商品ID
     * @return goods_id 商品ID
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * 商品ID
     * @param goodsId 商品ID
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * 
     * @return sku_code 
     */
    public String getSkuCode() {
        return skuCode;
    }

    /**
     * 
     * @param skuCode 
     */
    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode == null ? null : skuCode.trim();
    }

    /**
     * SKU名称
     * @return sku_name SKU名称
     */
    public String getSkuName() {
        return skuName;
    }

    /**
     * SKU名称
     * @param skuName SKU名称
     */
    public void setSkuName(String skuName) {
        this.skuName = skuName == null ? null : skuName.trim();
    }

    /**
     * 商品图片ID
     * @return img_id 商品图片ID
     */
    public Integer getImgId() {
        return imgId;
    }

    /**
     * 商品图片ID
     * @param imgId 商品图片ID
     */
    public void setImgId(Integer imgId) {
        this.imgId = imgId;
    }

    /**
     * 颜色ID
     * @return color_id 颜色ID
     */
    public Integer getColorId() {
        return colorId;
    }

    /**
     * 颜色ID
     * @param colorId 颜色ID
     */
    public void setColorId(Integer colorId) {
        this.colorId = colorId;
    }

    /**
     * 尺寸ID
     * @return size_id 尺寸ID
     */
    public Integer getSizeId() {
        return sizeId;
    }

    /**
     * 尺寸ID
     * @param sizeId 尺寸ID
     */
    public void setSizeId(Integer sizeId) {
        this.sizeId = sizeId;
    }

    /**
     * 尺码
     * @return size 尺码
     */
    public String getSize() {
        return size;
    }

    /**
     * 尺码
     * @param size 尺码
     */
    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    /**
     * 
     * @return weight 
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * 
     * @param weight 
     */
    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    /**
     * 警戒库存数
     * @return stock_alarm_num 警戒库存数
     */
    public Integer getStockAlarmNum() {
        return stockAlarmNum;
    }

    /**
     * 警戒库存数
     * @param stockAlarmNum 警戒库存数
     */
    public void setStockAlarmNum(Integer stockAlarmNum) {
        this.stockAlarmNum = stockAlarmNum;
    }

    /**
     * 是否生产款(100采购款，200生产款，300部分采购，部分生产)
     * @return is_production 是否生产款(100采购款，200生产款，300部分采购，部分生产)
     */
    public Integer getIsProduction() {
        return isProduction;
    }

    /**
     * 是否生产款(100采购款，200生产款，300部分采购，部分生产)
     * @param isProduction 是否生产款(100采购款，200生产款，300部分采购，部分生产)
     */
    public void setIsProduction(Integer isProduction) {
        this.isProduction = isProduction;
    }

    /**
     * 成本价
     * @return cost_price 成本价
     */
    public BigDecimal getCostPrice() {
        return costPrice;
    }

    /**
     * 成本价
     * @param costPrice 成本价
     */
    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    /**
     * 0禁用, 1启用
     * @return status 0禁用, 1启用
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * 0禁用, 1启用
     * @param status 0禁用, 1启用
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * 停用时间
     * @return block_time 停用时间
     */
    public Date getBlockTime() {
        return blockTime;
    }

    /**
     * 停用时间
     * @param blockTime 停用时间
     */
    public void setBlockTime(Date blockTime) {
        this.blockTime = blockTime;
    }

    /**
     * 创建人
     * @return creator 创建人
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 创建人
     * @param creator 创建人
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 修改人
     * @return modifier 修改人
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * 修改人
     * @param modifier 修改人
     */
    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    /**
     * 修改时间
     * @return modify_time 修改时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 修改时间
     * @param modifyTime 修改时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * 备注
     * @return comments 备注
     */
    public String getComments() {
        return comments;
    }

    /**
     * 备注
     * @param comments 备注
     */
    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        GoodsSku other = (GoodsSku) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (this.getSkuCode() == null ? other.getSkuCode() == null : this.getSkuCode().equals(other.getSkuCode()))
            && (this.getSkuName() == null ? other.getSkuName() == null : this.getSkuName().equals(other.getSkuName()))
            && (this.getImgId() == null ? other.getImgId() == null : this.getImgId().equals(other.getImgId()))
            && (this.getColorId() == null ? other.getColorId() == null : this.getColorId().equals(other.getColorId()))
            && (this.getSizeId() == null ? other.getSizeId() == null : this.getSizeId().equals(other.getSizeId()))
            && (this.getSize() == null ? other.getSize() == null : this.getSize().equals(other.getSize()))
            && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
            && (this.getStockAlarmNum() == null ? other.getStockAlarmNum() == null : this.getStockAlarmNum().equals(other.getStockAlarmNum()))
            && (this.getIsProduction() == null ? other.getIsProduction() == null : this.getIsProduction().equals(other.getIsProduction()))
            && (this.getCostPrice() == null ? other.getCostPrice() == null : this.getCostPrice().equals(other.getCostPrice()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getBlockTime() == null ? other.getBlockTime() == null : this.getBlockTime().equals(other.getBlockTime()))
            && (this.getCreator() == null ? other.getCreator() == null : this.getCreator().equals(other.getCreator()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModifier() == null ? other.getModifier() == null : this.getModifier().equals(other.getModifier()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()))
            && (this.getComments() == null ? other.getComments() == null : this.getComments().equals(other.getComments()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getGoodsId() == null) ? 0 : getGoodsId().hashCode());
        result = prime * result + ((getSkuCode() == null) ? 0 : getSkuCode().hashCode());
        result = prime * result + ((getSkuName() == null) ? 0 : getSkuName().hashCode());
        result = prime * result + ((getImgId() == null) ? 0 : getImgId().hashCode());
        result = prime * result + ((getColorId() == null) ? 0 : getColorId().hashCode());
        result = prime * result + ((getSizeId() == null) ? 0 : getSizeId().hashCode());
        result = prime * result + ((getSize() == null) ? 0 : getSize().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getStockAlarmNum() == null) ? 0 : getStockAlarmNum().hashCode());
        result = prime * result + ((getIsProduction() == null) ? 0 : getIsProduction().hashCode());
        result = prime * result + ((getCostPrice() == null) ? 0 : getCostPrice().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getBlockTime() == null) ? 0 : getBlockTime().hashCode());
        result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getModifier() == null) ? 0 : getModifier().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        result = prime * result + ((getComments() == null) ? 0 : getComments().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", skuCode=").append(skuCode);
        sb.append(", skuName=").append(skuName);
        sb.append(", imgId=").append(imgId);
        sb.append(", colorId=").append(colorId);
        sb.append(", sizeId=").append(sizeId);
        sb.append(", size=").append(size);
        sb.append(", weight=").append(weight);
        sb.append(", stockAlarmNum=").append(stockAlarmNum);
        sb.append(", isProduction=").append(isProduction);
        sb.append(", costPrice=").append(costPrice);
        sb.append(", status=").append(status);
        sb.append(", blockTime=").append(blockTime);
        sb.append(", creator=").append(creator);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifier=").append(modifier);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", comments=").append(comments);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}