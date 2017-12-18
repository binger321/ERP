package com.binger.common;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2017/12/14 0014
 * Time: 10:00
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public interface Const {

    /**
     * 响应信息
     */
    String SUCCESS_MSG = "操作成功";
    String FAIL_MSG = "操作失败";
    /**
     * 是否可用
     */
    Boolean CAN_USER = true;
    Boolean CAN_NOT_USER = false;

    /**
     * 是否
     */
    Integer YES = 1;
    Integer NO = 0;

    /**
     * REDIS过期时间（按钮级权限列表/用户关联仓库/用户关联公司）.分
     */
    Integer EXPIRE = 10;

    /**updateByExampleSelective, updateByPrimaryKeySelective 设置String类型为空*/
    String DB_STRING_SET_NULL = "erpsetnull";

    /**updateByExampleSelective, updateByPrimaryKeySelective 设置Integer类型为空*/
    int DB_INT_SET_NULL = -99999;

    /**updateByExampleSelective, updateByPrimaryKeySelective 设置Long类型为空*/
    long DB_LONG_SET_NULL = -99999L;

    /**updateByExampleSelective, updateByPrimaryKeySelective 设置Float类型为空*/
    float DB_FLOAT_SET_NULL = -99999F;

    /**updateByExampleSelective, updateByPrimaryKeySelective 设置Double类型为空*/
    double DB_Double_SET_NULL = -99999F;

    /**updateByExampleSelective, updateByPrimaryKeySelective 设置BigDecimal类型为空*/
    BigDecimal DB_BigDecimal_SET_NULL = new BigDecimal(-99999);

    /**updateByExampleSelective, updateByPrimaryKeySelective 设置Date类型为空*/
    Date DB_DATE_SET_NULL = new Date(0);
}