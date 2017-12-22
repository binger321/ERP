package com.binger.goods.controller.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2017/12/19 0019
 * Time: 16:43
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
@ApiModel("类型Form")
public class GoodsCategoryForm {

    /**
     * 上级分类ID
     */
    @ApiModelProperty(value="上级分类ID",required = false)
    private Integer pid;

    /**
     * 分类编号
     */
    @ApiModelProperty(value="分类编号",required = true)
    private String categoryCode;

    /**
     * 分类名称
     */
    @ApiModelProperty(value="分类名称",required = true)
    private String categoryName;

    /**
     * 商品类别英文名
     */
    @ApiModelProperty(value="商品类别英文名",required = false)
    private String categoryEnName;

    /**
     * 等级（1:一级2:二级3:三级4:四级）
     */
    @ApiModelProperty(value="等级（1:一级2:二级3:三级4:四级）",required = true)
    private Integer level;

    /**
     * 0禁用, 1启用
     */
    @ApiModelProperty(value="0禁用, 1启用",required = false)
    private Boolean status;
}