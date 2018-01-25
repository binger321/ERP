package com.binger.common.vo;

import lombok.Data;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/1/25 0025
 * Time: 16:12
 * To change this template use File | Settings | File Templates.
 * Description: 用于模糊查询及批量查询
 */
@Data
public class SplitStringVo {
    /**
     * 只有一个值时使用模糊查询
     */
    private String singleValue;

    /**
     * 闯入多个值后使用批量查询
     */
    private List<String> listValue;
}