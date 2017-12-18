package com.binger.goods.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品表
 */
@ApiModel(value="商品表")
public class Goods implements Serializable {
    /**
     * ID
     */
    @ApiModelProperty(value="ID",required = true)
    private Integer id;

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
     * goods
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
     * 商品货号
     * @return goods_code 商品货号
     */
    public String getGoodsCode() {
        return goodsCode;
    }

    /**
     * 商品货号
     * @param goodsCode 商品货号
     */
    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode == null ? null : goodsCode.trim();
    }

    /**
     * 商品名称
     * @return goods_name 商品名称
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * 商品名称
     * @param goodsName 商品名称
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    /**
     * 商品英文名称
     * @return goods_en_name 商品英文名称
     */
    public String getGoodsEnName() {
        return goodsEnName;
    }

    /**
     * 商品英文名称
     * @param goodsEnName 商品英文名称
     */
    public void setGoodsEnName(String goodsEnName) {
        this.goodsEnName = goodsEnName == null ? null : goodsEnName.trim();
    }

    /**
     * 
     * @return main_img_url 
     */
    public String getMainImgUrl() {
        return mainImgUrl;
    }

    /**
     * 
     * @param mainImgUrl 
     */
    public void setMainImgUrl(String mainImgUrl) {
        this.mainImgUrl = mainImgUrl == null ? null : mainImgUrl.trim();
    }

    /**
     * 一级分类ID
     * @return category_one_id 一级分类ID
     */
    public Integer getCategoryOneId() {
        return categoryOneId;
    }

    /**
     * 一级分类ID
     * @param categoryOneId 一级分类ID
     */
    public void setCategoryOneId(Integer categoryOneId) {
        this.categoryOneId = categoryOneId;
    }

    /**
     * 二级分类ID
     * @return category_two_id 二级分类ID
     */
    public Integer getCategoryTwoId() {
        return categoryTwoId;
    }

    /**
     * 二级分类ID
     * @param categoryTwoId 二级分类ID
     */
    public void setCategoryTwoId(Integer categoryTwoId) {
        this.categoryTwoId = categoryTwoId;
    }

    /**
     * 三级分类ID
     * @return category_three_id 三级分类ID
     */
    public Integer getCategoryThreeId() {
        return categoryThreeId;
    }

    /**
     * 三级分类ID
     * @param categoryThreeId 三级分类ID
     */
    public void setCategoryThreeId(Integer categoryThreeId) {
        this.categoryThreeId = categoryThreeId;
    }

    /**
     * 四级分类ID
     * @return category_four_id 四级分类ID
     */
    public Integer getCategoryFourId() {
        return categoryFourId;
    }

    /**
     * 四级分类ID
     * @param categoryFourId 四级分类ID
     */
    public void setCategoryFourId(Integer categoryFourId) {
        this.categoryFourId = categoryFourId;
    }

    /**
     * 品牌ID
     * @return brand_id 品牌ID
     */
    public Integer getBrandId() {
        return brandId;
    }

    /**
     * 品牌ID
     * @param brandId 品牌ID
     */
    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
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
     * 规格
     * @return specification 规格
     */
    public String getSpecification() {
        return specification;
    }

    /**
     * 规格
     * @param specification 规格
     */
    public void setSpecification(String specification) {
        this.specification = specification == null ? null : specification.trim();
    }

    /**
     * 型号
     * @return model 型号
     */
    public String getModel() {
        return model;
    }

    /**
     * 型号
     * @param model 型号
     */
    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    /**
     * 材质
     * @return material 材质
     */
    public String getMaterial() {
        return material;
    }

    /**
     * 材质
     * @param material 材质
     */
    public void setMaterial(String material) {
        this.material = material == null ? null : material.trim();
    }

    /**
     * 是否生产款 100采购款 200生产款 300部分生产部分采购
     * @return is_production 是否生产款 100采购款 200生产款 300部分生产部分采购
     */
    public Integer getIsProduction() {
        return isProduction;
    }

    /**
     * 是否生产款 100采购款 200生产款 300部分生产部分采购
     * @param isProduction 是否生产款 100采购款 200生产款 300部分生产部分采购
     */
    public void setIsProduction(Integer isProduction) {
        this.isProduction = isProduction;
    }

    /**
     * 负责人ID
     * @return manager_id 负责人ID
     */
    public Integer getManagerId() {
        return managerId;
    }

    /**
     * 负责人ID
     * @param managerId 负责人ID
     */
    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    /**
     * 负责人
     * @return manager_name 负责人
     */
    public String getManagerName() {
        return managerName;
    }

    /**
     * 负责人
     * @param managerName 负责人
     */
    public void setManagerName(String managerName) {
        this.managerName = managerName == null ? null : managerName.trim();
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
     * 同款采购链接
     * @return same_purchase_link 同款采购链接
     */
    public String getSamePurchaseLink() {
        return samePurchaseLink;
    }

    /**
     * 同款采购链接
     * @param samePurchaseLink 同款采购链接
     */
    public void setSamePurchaseLink(String samePurchaseLink) {
        this.samePurchaseLink = samePurchaseLink == null ? null : samePurchaseLink.trim();
    }

    /**
     * 款式ID
     * @return style_id 款式ID
     */
    public Integer getStyleId() {
        return styleId;
    }

    /**
     * 款式ID
     * @param styleId 款式ID
     */
    public void setStyleId(Integer styleId) {
        this.styleId = styleId;
    }

    /**
     * 风格1
     * @return style_one 风格1
     */
    public String getStyleOne() {
        return styleOne;
    }

    /**
     * 风格1
     * @param styleOne 风格1
     */
    public void setStyleOne(String styleOne) {
        this.styleOne = styleOne == null ? null : styleOne.trim();
    }

    /**
     * 风格2
     * @return style_two 风格2
     */
    public String getStyleTwo() {
        return styleTwo;
    }

    /**
     * 风格2
     * @param styleTwo 风格2
     */
    public void setStyleTwo(String styleTwo) {
        this.styleTwo = styleTwo == null ? null : styleTwo.trim();
    }

    /**
     * 风格3
     * @return style_three 风格3
     */
    public String getStyleThree() {
        return styleThree;
    }

    /**
     * 风格3
     * @param styleThree 风格3
     */
    public void setStyleThree(String styleThree) {
        this.styleThree = styleThree == null ? null : styleThree.trim();
    }

    /**
     * 风格4
     * @return style_four 风格4
     */
    public String getStyleFour() {
        return styleFour;
    }

    /**
     * 风格4
     * @param styleFour 风格4
     */
    public void setStyleFour(String styleFour) {
        this.styleFour = styleFour == null ? null : styleFour.trim();
    }

    /**
     * 风格5
     * @return style_five 风格5
     */
    public String getStyleFive() {
        return styleFive;
    }

    /**
     * 风格5
     * @param styleFive 风格5
     */
    public void setStyleFive(String styleFive) {
        this.styleFive = styleFive == null ? null : styleFive.trim();
    }

    /**
     * 风格6
     * @return style_six 风格6
     */
    public String getStyleSix() {
        return styleSix;
    }

    /**
     * 风格6
     * @param styleSix 风格6
     */
    public void setStyleSix(String styleSix) {
        this.styleSix = styleSix == null ? null : styleSix.trim();
    }

    /**
     * 风格7
     * @return style_seven 风格7
     */
    public String getStyleSeven() {
        return styleSeven;
    }

    /**
     * 风格7
     * @param styleSeven 风格7
     */
    public void setStyleSeven(String styleSeven) {
        this.styleSeven = styleSeven == null ? null : styleSeven.trim();
    }

    /**
     * 风格8
     * @return style_eight 风格8
     */
    public String getStyleEight() {
        return styleEight;
    }

    /**
     * 风格8
     * @param styleEight 风格8
     */
    public void setStyleEight(String styleEight) {
        this.styleEight = styleEight == null ? null : styleEight.trim();
    }

    /**
     * 商品类型 1普通款，2半精品，3精品款，4星标款
     * @return goods_type 商品类型 1普通款，2半精品，3精品款，4星标款
     */
    public Integer getGoodsType() {
        return goodsType;
    }

    /**
     * 商品类型 1普通款，2半精品，3精品款，4星标款
     * @param goodsType 商品类型 1普通款，2半精品，3精品款，4星标款
     */
    public void setGoodsType(Integer goodsType) {
        this.goodsType = goodsType;
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
        Goods other = (Goods) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGoodsCode() == null ? other.getGoodsCode() == null : this.getGoodsCode().equals(other.getGoodsCode()))
            && (this.getGoodsName() == null ? other.getGoodsName() == null : this.getGoodsName().equals(other.getGoodsName()))
            && (this.getGoodsEnName() == null ? other.getGoodsEnName() == null : this.getGoodsEnName().equals(other.getGoodsEnName()))
            && (this.getMainImgUrl() == null ? other.getMainImgUrl() == null : this.getMainImgUrl().equals(other.getMainImgUrl()))
            && (this.getCategoryOneId() == null ? other.getCategoryOneId() == null : this.getCategoryOneId().equals(other.getCategoryOneId()))
            && (this.getCategoryTwoId() == null ? other.getCategoryTwoId() == null : this.getCategoryTwoId().equals(other.getCategoryTwoId()))
            && (this.getCategoryThreeId() == null ? other.getCategoryThreeId() == null : this.getCategoryThreeId().equals(other.getCategoryThreeId()))
            && (this.getCategoryFourId() == null ? other.getCategoryFourId() == null : this.getCategoryFourId().equals(other.getCategoryFourId()))
            && (this.getBrandId() == null ? other.getBrandId() == null : this.getBrandId().equals(other.getBrandId()))
            && (this.getCostPrice() == null ? other.getCostPrice() == null : this.getCostPrice().equals(other.getCostPrice()))
            && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
            && (this.getSpecification() == null ? other.getSpecification() == null : this.getSpecification().equals(other.getSpecification()))
            && (this.getModel() == null ? other.getModel() == null : this.getModel().equals(other.getModel()))
            && (this.getMaterial() == null ? other.getMaterial() == null : this.getMaterial().equals(other.getMaterial()))
            && (this.getIsProduction() == null ? other.getIsProduction() == null : this.getIsProduction().equals(other.getIsProduction()))
            && (this.getManagerId() == null ? other.getManagerId() == null : this.getManagerId().equals(other.getManagerId()))
            && (this.getManagerName() == null ? other.getManagerName() == null : this.getManagerName().equals(other.getManagerName()))
            && (this.getPurchaseLink() == null ? other.getPurchaseLink() == null : this.getPurchaseLink().equals(other.getPurchaseLink()))
            && (this.getSamePurchaseLink() == null ? other.getSamePurchaseLink() == null : this.getSamePurchaseLink().equals(other.getSamePurchaseLink()))
            && (this.getStyleId() == null ? other.getStyleId() == null : this.getStyleId().equals(other.getStyleId()))
            && (this.getStyleOne() == null ? other.getStyleOne() == null : this.getStyleOne().equals(other.getStyleOne()))
            && (this.getStyleTwo() == null ? other.getStyleTwo() == null : this.getStyleTwo().equals(other.getStyleTwo()))
            && (this.getStyleThree() == null ? other.getStyleThree() == null : this.getStyleThree().equals(other.getStyleThree()))
            && (this.getStyleFour() == null ? other.getStyleFour() == null : this.getStyleFour().equals(other.getStyleFour()))
            && (this.getStyleFive() == null ? other.getStyleFive() == null : this.getStyleFive().equals(other.getStyleFive()))
            && (this.getStyleSix() == null ? other.getStyleSix() == null : this.getStyleSix().equals(other.getStyleSix()))
            && (this.getStyleSeven() == null ? other.getStyleSeven() == null : this.getStyleSeven().equals(other.getStyleSeven()))
            && (this.getStyleEight() == null ? other.getStyleEight() == null : this.getStyleEight().equals(other.getStyleEight()))
            && (this.getGoodsType() == null ? other.getGoodsType() == null : this.getGoodsType().equals(other.getGoodsType()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getBlockTime() == null ? other.getBlockTime() == null : this.getBlockTime().equals(other.getBlockTime()))
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
        result = prime * result + ((getGoodsCode() == null) ? 0 : getGoodsCode().hashCode());
        result = prime * result + ((getGoodsName() == null) ? 0 : getGoodsName().hashCode());
        result = prime * result + ((getGoodsEnName() == null) ? 0 : getGoodsEnName().hashCode());
        result = prime * result + ((getMainImgUrl() == null) ? 0 : getMainImgUrl().hashCode());
        result = prime * result + ((getCategoryOneId() == null) ? 0 : getCategoryOneId().hashCode());
        result = prime * result + ((getCategoryTwoId() == null) ? 0 : getCategoryTwoId().hashCode());
        result = prime * result + ((getCategoryThreeId() == null) ? 0 : getCategoryThreeId().hashCode());
        result = prime * result + ((getCategoryFourId() == null) ? 0 : getCategoryFourId().hashCode());
        result = prime * result + ((getBrandId() == null) ? 0 : getBrandId().hashCode());
        result = prime * result + ((getCostPrice() == null) ? 0 : getCostPrice().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getSpecification() == null) ? 0 : getSpecification().hashCode());
        result = prime * result + ((getModel() == null) ? 0 : getModel().hashCode());
        result = prime * result + ((getMaterial() == null) ? 0 : getMaterial().hashCode());
        result = prime * result + ((getIsProduction() == null) ? 0 : getIsProduction().hashCode());
        result = prime * result + ((getManagerId() == null) ? 0 : getManagerId().hashCode());
        result = prime * result + ((getManagerName() == null) ? 0 : getManagerName().hashCode());
        result = prime * result + ((getPurchaseLink() == null) ? 0 : getPurchaseLink().hashCode());
        result = prime * result + ((getSamePurchaseLink() == null) ? 0 : getSamePurchaseLink().hashCode());
        result = prime * result + ((getStyleId() == null) ? 0 : getStyleId().hashCode());
        result = prime * result + ((getStyleOne() == null) ? 0 : getStyleOne().hashCode());
        result = prime * result + ((getStyleTwo() == null) ? 0 : getStyleTwo().hashCode());
        result = prime * result + ((getStyleThree() == null) ? 0 : getStyleThree().hashCode());
        result = prime * result + ((getStyleFour() == null) ? 0 : getStyleFour().hashCode());
        result = prime * result + ((getStyleFive() == null) ? 0 : getStyleFive().hashCode());
        result = prime * result + ((getStyleSix() == null) ? 0 : getStyleSix().hashCode());
        result = prime * result + ((getStyleSeven() == null) ? 0 : getStyleSeven().hashCode());
        result = prime * result + ((getStyleEight() == null) ? 0 : getStyleEight().hashCode());
        result = prime * result + ((getGoodsType() == null) ? 0 : getGoodsType().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getBlockTime() == null) ? 0 : getBlockTime().hashCode());
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
        sb.append(", goodsCode=").append(goodsCode);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", goodsEnName=").append(goodsEnName);
        sb.append(", mainImgUrl=").append(mainImgUrl);
        sb.append(", categoryOneId=").append(categoryOneId);
        sb.append(", categoryTwoId=").append(categoryTwoId);
        sb.append(", categoryThreeId=").append(categoryThreeId);
        sb.append(", categoryFourId=").append(categoryFourId);
        sb.append(", brandId=").append(brandId);
        sb.append(", costPrice=").append(costPrice);
        sb.append(", weight=").append(weight);
        sb.append(", specification=").append(specification);
        sb.append(", model=").append(model);
        sb.append(", material=").append(material);
        sb.append(", isProduction=").append(isProduction);
        sb.append(", managerId=").append(managerId);
        sb.append(", managerName=").append(managerName);
        sb.append(", purchaseLink=").append(purchaseLink);
        sb.append(", samePurchaseLink=").append(samePurchaseLink);
        sb.append(", styleId=").append(styleId);
        sb.append(", styleOne=").append(styleOne);
        sb.append(", styleTwo=").append(styleTwo);
        sb.append(", styleThree=").append(styleThree);
        sb.append(", styleFour=").append(styleFour);
        sb.append(", styleFive=").append(styleFive);
        sb.append(", styleSix=").append(styleSix);
        sb.append(", styleSeven=").append(styleSeven);
        sb.append(", styleEight=").append(styleEight);
        sb.append(", goodsType=").append(goodsType);
        sb.append(", status=").append(status);
        sb.append(", blockTime=").append(blockTime);
        sb.append(", creator=").append(creator);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifier=").append(modifier);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}