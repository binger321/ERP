package com.binger.goods.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2017/12/19 0019
 * Time: 16:22
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
@ApiModel("图片详情")
public class GoodsImgDetailVo {
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
     * 图片编码
     */
    @ApiModelProperty(value="图片编码")
    private String imgCode;

    /**
     * 图号
     */
    @ApiModelProperty(value="图号")
    private String imgNo;

    /**
     * 图片URL
     */
    @ApiModelProperty(value="图片URL")
    private String imgUrl;

    /**
     * 是否主图
     */
    @ApiModelProperty(value="是否主图")
    private Boolean isMain;

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