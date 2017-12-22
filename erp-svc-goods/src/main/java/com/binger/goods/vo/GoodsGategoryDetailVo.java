package com.binger.goods.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2017/12/19 0019
 * Time: 11:15
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
@ApiModel("商品类别详情")
public class GoodsGategoryDetailVo {
    /**
     * ID
     */
    @ApiModelProperty(value="ID")
    private Integer id;

    /**
     * 上级分类ID
     */
    @ApiModelProperty(value="上级分类ID")
    private Integer pid;

    /**
     * 分类编号
     */
    @ApiModelProperty(value="分类编号")
    private String categoryCode;

    /**
     * 分类名称
     */
    @ApiModelProperty(value="分类名称")
    private String categoryName;

    /**
     * 商品类别英文名
     */
    @ApiModelProperty(value="商品类别英文名")
    private String categoryEnName;

    /**
     * 等级（1:一级2:二级3:三级4:四级）
     */
    @ApiModelProperty(value="等级（1:一级2:二级3:三级4:四级）")
    private Integer level;

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