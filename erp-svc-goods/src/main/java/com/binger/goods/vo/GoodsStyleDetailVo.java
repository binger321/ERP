package com.binger.goods.vo;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2017/12/19 0019
 * Time: 11:40
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class GoodsStyleDetailVo {
    /**
     * ID
     */
    @ApiModelProperty(value="ID",required = true)
    private Integer id;

    /**
     * 款式编码
     */
    @ApiModelProperty(value="款式编码",required = true)
    private String styleCode;

    /**
     * 款式名称
     */
    @ApiModelProperty(value="款式名称",required = true)
    private String styleName;

    /**
     * 备注
     */
    @ApiModelProperty(value="备注",required = false)
    private String remark;

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

}