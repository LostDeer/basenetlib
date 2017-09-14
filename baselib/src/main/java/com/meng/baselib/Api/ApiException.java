package com.meng.baselib.Api;


import com.meng.baselib.Constant.StatusCode;
import com.meng.baselib.entitys.HttpResult;


/**
 * 异常类
 * 按照自己公司的接口需求来  不可直接套用
 * 使用需谨慎
 */
public class ApiException extends RuntimeException {

    public ApiException(HttpResult httpResult) {
        this(getApiExceptionMessage(httpResult));
    }

    public ApiException(String detailMessage) {
        super(detailMessage);
    }

    /**
     * 对服务器接口传过来的错误信息进行统一处理
     * 免除在Activity的过多的错误判断
     */
    private static String getApiExceptionMessage(HttpResult httpResult){
        int code = httpResult.getCode();
        String message = StatusCode.getInstance().codeMsgMap.get(code);
//        Toast.makeText(App.sContext, message, Toast.LENGTH_SHORT).show();
        return message;
    }
}

