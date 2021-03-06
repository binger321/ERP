package com.binger.goods.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2017/12/18 0018
 * Time: 16:41
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
@ApiModel("商品品牌详情")
public class GoodsBrandDetailVo {
    /**
     * ID
     */
    @ApiModelProperty(value="ID")
    private Integer id;

    /**
     * 品牌编码
     */
    @ApiModelProperty(value="品牌编码")
    private String brandCode;

    /**
     * 品牌名称
     */
    @ApiModelProperty(value="品牌名称")
    private String brandName;

    /**
     * 国家编码
     */
    @ApiModelProperty(value="国家编码")
    private String countryCode;

    /**
     * 国家名称
     */
    @ApiModelProperty(value="国家名称")
    private String countryName;

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