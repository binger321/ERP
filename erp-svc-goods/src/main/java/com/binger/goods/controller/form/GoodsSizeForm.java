package com.binger.goods.controller.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2017/12/19 0019
 * Time: 17:09
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
@ApiModel("尺寸Form")
public class GoodsSizeForm {

    /**
     * 尺寸编码
     */
    @ApiModelProperty(value="尺寸编码",required = true)
    private String sizeCode;

    /**
     * 尺寸名称
     */
    @ApiModelProperty(value="尺寸名称",required = true)
    private String sizeName;

    /**
     *
     */
    @ApiModelProperty(value="",required = true)
    private String sizeShortName;

    /**
     * 备注
     */
    @ApiModelProperty(value="备注",required = false)
    private String remark;

    /**
     * 0禁用, 1启用
     */
    @ApiModelProperty(value="0禁用, 1启用",required = true)
    private Boolean status;


}