package com.binger.common;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2017/12/13 0013
 * Time: 19:11
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class ServerResponse<T> implements Serializable {
    private int status;
    private String msg;
    private T data;
    private Page page;

    /**辅助变量, mock对象转换需要data class, 否则无法反射注入*/
    private Class<T> dataClazz;
    /**辅助变量, mock对象转换判断是否List, 否则无法反射注入*/
    private Boolean isDataSingle;

    public ServerResponse(){}

    public ServerResponse(int status) {
        this.status = status;
    }
    public ServerResponse(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }
    public ServerResponse(int status, T data) {
        this.status = status;
        this.data = data;
    }

    public ServerResponse(int status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public ServerResponse(int status, String msg, T data, Page page) {
        this.status = status;
        this.msg = msg;
        this.data = data;
        this.page = page;
    }

    public int getStatus() {
        return status;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }

    public Page getPage() {
        return page;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public static <T> ServerResponse<T> createBySuccess(String msg, T data){
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(), msg, data);
    }

    public static <T> ServerResponse<T> createBySuccess(String msg, T data, Page page){
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(), msg, data, page);
    }

    public static <T> ServerResponse<T> createByError(String msg){
        return new ServerResponse<T>(ResponseCode.ERROR.getCode(), msg);
    }

    public static <T> ServerResponse<T> createByError(String msg, T data){
        return new ServerResponse<T>(ResponseCode.ERROR.getCode(), msg, data);
    }

    @JsonIgnore
    public Class<T> getDataClazz() {
        return dataClazz;
    }

    public void setDataClazz(Class<T> dataClazz) {
        this.dataClazz = dataClazz;
    }

    @JsonIgnore
    public Boolean getDataSingle() {
        return isDataSingle;
    }

    public void setDataSingle(Boolean dataSingle) {
        isDataSingle = dataSingle;
    }
}
