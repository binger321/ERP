package com.binger.goods.controller.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2017/12/18 0018
 * Time: 15:37
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
@ApiModel(value = "商品品牌Query")
public class GoodsBrandQuery {
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

}