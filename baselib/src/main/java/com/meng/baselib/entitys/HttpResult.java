package com.meng.baselib.entitys;

/**
 * Created by Administrator on 2016/11/14.
 */

public class HttpResult<T> {
    public String msg;
    public int code;
    public T data;


    private int res;
    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }
    @Override
    public String toString() {
        return "HttpResult{" +
                "msg='" + msg + '\'' +
                ", code=" + code +
                ", data=" + data +
                ", request='" + request + '\'' +
                '}';
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String request;
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public HttpResult(String requestTime, int code, T data) {
        this.msg = requestTime;
        this.code = code;
        this.data = data;
    }

}
