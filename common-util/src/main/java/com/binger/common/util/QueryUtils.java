package com.binger.common.util;

import com.binger.common.vo.SplitStringVo;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/1/25 0025
 * Time: 16:17
 * To change this template use File | Settings | File Templates.
 * Description:用于多条批量查询或单条模糊查询
 */
public class QueryUtils {

    public static SplitStringVo stringStringWhenQuery(String source){
        SplitStringVo splitStringVo = new SplitStringVo();
        if (source.contains("，") || source.contains(",")){
            String[] sourceArr = source.replaceAll("，",",").split(",");
            for (String str : sourceArr){
                splitStringVo.getListValue().add(str);
            }
        }else {
            splitStringVo.setSingleValue(source);
        }
        return splitStringVo;
    }
}