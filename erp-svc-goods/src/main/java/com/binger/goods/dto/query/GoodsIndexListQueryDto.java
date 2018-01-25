package com.binger.goods.dto.query;

import com.binger.common.QueryDtoBase;
import lombok.Data;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/1/25 0025
 * Time: 16:31
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
public class GoodsIndexListQueryDto extends QueryDtoBase{
    /**
     * 商品货号
     */
    private String goodsCode;

    /**
     * 商品货号list
     */
    private List<String> goodsCodeList;
    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 商品类型 1普通款，2半精品，3精品款，4星标款
     */
    private Integer goodsType;

    /**
     * SKU编码
     */
    private String skuCode;

    /**
     * SKU编码list
     */
    private List<String> skuCodeList;


    /**
     * 一级分类ID
     */
    private Integer categoryOneId;

    /**
     * 二级分类ID
     */
    private Integer categoryTwoId;

    /**
     * 三级分类ID
     */
    private Integer categoryThreeId;

    /**
     * 四级分类ID
     */
    private Integer categoryFourId;

    /**
     * 品牌ID
     */
    private Integer brandId;

    /**
     * 供应商ID
     */
    private Integer supplierId;


    /**
     * 是否生产款
     */
    private Integer isProduction;
}