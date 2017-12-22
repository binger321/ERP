package com.binger.goods.controller.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2017/12/19 0019
 * Time: 17:14
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
@ApiModel("风格Query")
public class GoodsStyleQuery {
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

}