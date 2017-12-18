package com.binger.goods.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 商品供应商表
 */
@ApiModel(value="商品供应商表")
public class GoodsSupplier implements Serializable {
    /**
     * ID
     */
    @ApiModelProperty(value="ID",required = true)
    private Integer id;

    /**
     * 商品ID
     */
    @ApiModelProperty(value="商品ID",required = true)
    private Integer goodsId;

    /**
     * 供应商ID
     */
    @ApiModelProperty(value="供应商ID",required = true)
    private Integer supplierId;

    /**
     * 供应商编码
     */
    @ApiModelProperty(value="供应商编码",required = true)
    private String supplierCode;

    /**
     * 供应商名称
     */
    @ApiModelProperty(value="供应商名称",required = true)
    private String supplierName;

    /**
     * 
     */
    @ApiModelProperty(value="",required = false)
    private BigDecimal importPrice;

    /**
     * 采购链接
     */
    @ApiModelProperty(value="采购链接",required = false)
    private String purchaseLink;

    /**
     * 供应商货号
     */
    @ApiModelProperty(value="供应商货号",required = false)
    private String supplierGoodsCode;

    /**
     * 是否同款
     */
    @ApiModelProperty(value="是否同款",required = false)
    private Boolean isSame;

    /**
     * 0禁用, 1启用
     */
    @ApiModelProperty(value="0禁用, 1启用",required = false)
    private Boolean status;

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
     * goods_supplier
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
     * 供应商ID
     * @return supplier_id 供应商ID
     */
    public Integer getSupplierId() {
        return supplierId;
    }

    /**
     * 供应商ID
     * @param supplierId 供应商ID
     */
    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    /**
     * 供应商编码
     * @return supplier_code 供应商编码
     */
    public String getSupplierCode() {
        return supplierCode;
    }

    /**
     * 供应商编码
     * @param supplierCode 供应商编码
     */
    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode == null ? null : supplierCode.trim();
    }

    /**
     * 供应商名称
     * @return supplier_name 供应商名称
     */
    public String getSupplierName() {
        return supplierName;
    }

    /**
     * 供应商名称
     * @param supplierName 供应商名称
     */
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName == null ? null : supplierName.trim();
    }

    /**
     * 
     * @return import_price 
     */
    public BigDecimal getImportPrice() {
        return importPrice;
    }

    /**
     * 
     * @param importPrice 
     */
    public void setImportPrice(BigDecimal importPrice) {
        this.importPrice = importPrice;
    }

    /**
     * 采购链接
     * @return purchase_link 采购链接
     */
    public String getPurchaseLink() {
        return purchaseLink;
    }

    /**
     * 采购链接
     * @param purchaseLink 采购链接
     */
    public void setPurchaseLink(String purchaseLink) {
        this.purchaseLink = purchaseLink == null ? null : purchaseLink.trim();
    }

    /**
     * 供应商货号
     * @return supplier_goods_code 供应商货号
     */
    public String getSupplierGoodsCode() {
        return supplierGoodsCode;
    }

    /**
     * 供应商货号
     * @param supplierGoodsCode 供应商货号
     */
    public void setSupplierGoodsCode(String supplierGoodsCode) {
        this.supplierGoodsCode = supplierGoodsCode == null ? null : supplierGoodsCode.trim();
    }

    /**
     * 是否同款
     * @return is_same 是否同款
     */
    public Boolean getIsSame() {
        return isSame;
    }

    /**
     * 是否同款
     * @param isSame 是否同款
     */
    public void setIsSame(Boolean isSame) {
        this.isSame = isSame;
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
        GoodsSupplier other = (GoodsSupplier) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (this.getSupplierId() == null ? other.getSupplierId() == null : this.getSupplierId().equals(other.getSupplierId()))
            && (this.getSupplierCode() == null ? other.getSupplierCode() == null : this.getSupplierCode().equals(other.getSupplierCode()))
            && (this.getSupplierName() == null ? other.getSupplierName() == null : this.getSupplierName().equals(other.getSupplierName()))
            && (this.getImportPrice() == null ? other.getImportPrice() == null : this.getImportPrice().equals(other.getImportPrice()))
            && (this.getPurchaseLink() == null ? other.getPurchaseLink() == null : this.getPurchaseLink().equals(other.getPurchaseLink()))
            && (this.getSupplierGoodsCode() == null ? other.getSupplierGoodsCode() == null : this.getSupplierGoodsCode().equals(other.getSupplierGoodsCode()))
            && (this.getIsSame() == null ? other.getIsSame() == null : this.getIsSame().equals(other.getIsSame()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreator() == null ? other.getCreator() == null : this.getCreator().equals(other.getCreator()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModifier() == null ? other.getModifier() == null : this.getModifier().equals(other.getModifier()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getGoodsId() == null) ? 0 : getGoodsId().hashCode());
        result = prime * result + ((getSupplierId() == null) ? 0 : getSupplierId().hashCode());
        result = prime * result + ((getSupplierCode() == null) ? 0 : getSupplierCode().hashCode());
        result = prime * result + ((getSupplierName() == null) ? 0 : getSupplierName().hashCode());
        result = prime * result + ((getImportPrice() == null) ? 0 : getImportPrice().hashCode());
        result = prime * result + ((getPurchaseLink() == null) ? 0 : getPurchaseLink().hashCode());
        result = prime * result + ((getSupplierGoodsCode() == null) ? 0 : getSupplierGoodsCode().hashCode());
        result = prime * result + ((getIsSame() == null) ? 0 : getIsSame().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getModifier() == null) ? 0 : getModifier().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
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
        sb.append(", supplierId=").append(supplierId);
        sb.append(", supplierCode=").append(supplierCode);
        sb.append(", supplierName=").append(supplierName);
        sb.append(", importPrice=").append(importPrice);
        sb.append(", purchaseLink=").append(purchaseLink);
        sb.append(", supplierGoodsCode=").append(supplierGoodsCode);
        sb.append(", isSame=").append(isSame);
        sb.append(", status=").append(status);
        sb.append(", creator=").append(creator);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifier=").append(modifier);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}