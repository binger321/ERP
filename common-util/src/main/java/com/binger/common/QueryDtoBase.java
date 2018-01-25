package com.binger.common;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/1/25 0025
 * Time: 16:36
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
public class QueryDtoBase {
    /**mysql每页条数*/
    private Integer limit;

    /**mysql分页位移*/
    private Integer offset;

    /**orderby语句, 数据库字段名, e.g. column_1 asc, column_2 desc*/
    private String orderByClause;
}