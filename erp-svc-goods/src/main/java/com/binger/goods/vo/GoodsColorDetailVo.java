package com.binger.goods.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2017/12/19 0019
 * Time: 11:26
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
@ApiModel("商品颜色详情")
public class GoodsColorDetailVo {
    /**
     * ID
     */
    @ApiModelProperty(value="ID")
    private Integer id;

    /**
     * 颜色编码
     */
    @ApiModelProperty(value="颜色编码")
    private String colorCode;

    /**
     * 颜色名称
     */
    @ApiModelProperty(value="颜色名称")
    private String colorName;

    /**
     * 备注
     */
    @ApiModelProperty(value="备注")
    private String remark;

    /**
     * 0禁用, 1启用
     */
    @ApiModelProperty(value="0禁用, 1启用")
    private Boolean status;

    /**
     * 停用时间
     */
    @ApiModelProperty(value="停用时间")
    private Date blockTime;

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