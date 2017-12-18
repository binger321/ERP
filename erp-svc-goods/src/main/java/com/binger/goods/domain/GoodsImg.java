package com.binger.goods.domain;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 商品图片表
 */
@ApiModel(value="商品图片表")
public class GoodsImg implements Serializable {
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
     * 图片编码
     */
    @ApiModelProperty(value="图片编码",required = true)
    private String imgCode;

    /**
     * 图号
     */
    @ApiModelProperty(value="图号",required = true)
    private String imgNo;

    /**
     * 图片URL
     */
    @ApiModelProperty(value="图片URL",required = true)
    private String imgUrl;

    /**
     * 是否主图
     */
    @ApiModelProperty(value="是否主图",required = false)
    private Boolean isMain;

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
     * goods_img
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
     * 图片编码
     * @return img_code 图片编码
     */
    public String getImgCode() {
        return imgCode;
    }

    /**
     * 图片编码
     * @param imgCode 图片编码
     */
    public void setImgCode(String imgCode) {
        this.imgCode = imgCode == null ? null : imgCode.trim();
    }

    /**
     * 图号
     * @return img_no 图号
     */
    public String getImgNo() {
        return imgNo;
    }

    /**
     * 图号
     * @param imgNo 图号
     */
    public void setImgNo(String imgNo) {
        this.imgNo = imgNo == null ? null : imgNo.trim();
    }

    /**
     * 图片URL
     * @return img_url 图片URL
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * 图片URL
     * @param imgUrl 图片URL
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    /**
     * 是否主图
     * @return is_main 是否主图
     */
    public Boolean getIsMain() {
        return isMain;
    }

    /**
     * 是否主图
     * @param isMain 是否主图
     */
    public void setIsMain(Boolean isMain) {
        this.isMain = isMain;
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
        GoodsImg other = (GoodsImg) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (this.getImgCode() == null ? other.getImgCode() == null : this.getImgCode().equals(other.getImgCode()))
            && (this.getImgNo() == null ? other.getImgNo() == null : this.getImgNo().equals(other.getImgNo()))
            && (this.getImgUrl() == null ? other.getImgUrl() == null : this.getImgUrl().equals(other.getImgUrl()))
            && (this.getIsMain() == null ? other.getIsMain() == null : this.getIsMain().equals(other.getIsMain()))
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
        result = prime * result + ((getImgCode() == null) ? 0 : getImgCode().hashCode());
        result = prime * result + ((getImgNo() == null) ? 0 : getImgNo().hashCode());
        result = prime * result + ((getImgUrl() == null) ? 0 : getImgUrl().hashCode());
        result = prime * result + ((getIsMain() == null) ? 0 : getIsMain().hashCode());
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
        sb.append(", imgCode=").append(imgCode);
        sb.append(", imgNo=").append(imgNo);
        sb.append(", imgUrl=").append(imgUrl);
        sb.append(", isMain=").append(isMain);
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