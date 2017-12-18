package com.binger.common;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2017/12/13 0013
 * Time: 18:59
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public enum ResponseCode {

    SUCCESS(0, "SUCCESS"),
    ERROR(-1, "ERROR");

    private final int code;
    private final String desc;

    ResponseCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}