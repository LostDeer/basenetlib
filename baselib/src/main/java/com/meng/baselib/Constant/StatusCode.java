package com.meng.baselib.Constant;

import android.util.SparseArray;

/**
 * 全局状态码常量类
 *
 * @author Marvin
 * @create 2017-01-12 下午3:22
 */
public class StatusCode {
    //成功(2字头)
    public static final int OK = 200;
    //客户端请求错误(4字头)
    public static final int BAD_REQUEST = 400;
    public static final int UNAUTHORIZED = 401;
    public static final int FORBIDDEN = 403;
    public static final int NOT_FOUND = 404;

    //50800-50900//other

    public static final SparseArray<String> codeMsgMap = new SparseArray();
    private static StatusCode mInstance=null;
    private StatusCode() {
    }

    public static StatusCode getInstance(){
        if(mInstance==null){
            synchronized (StatusCode.class){
                if(mInstance==null){
                    mInstance=new StatusCode();
                }
            }
        }
        return mInstance;
    }


    static {
        //成功(2字头)
        codeMsgMap.put(StatusCode.OK, "成功");
        //客户端请求错误(4字头)
        codeMsgMap.put(StatusCode.BAD_REQUEST, "无效的请求");
        codeMsgMap.put(StatusCode.UNAUTHORIZED, "当前的请求需要验证");
        codeMsgMap.put(StatusCode.FORBIDDEN, "服务器禁止请求");
        codeMsgMap.put(StatusCode.NOT_FOUND, "请求的资源没有找到");
    }
}
