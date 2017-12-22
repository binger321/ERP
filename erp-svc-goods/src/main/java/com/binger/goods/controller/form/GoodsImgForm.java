package com.binger.goods.controller.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2017/12/19 0019
 * Time: 17:06
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
@ApiModel("图片Form")
public class GoodsImgForm {

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

}