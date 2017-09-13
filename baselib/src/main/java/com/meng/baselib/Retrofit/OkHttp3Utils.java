package com.meng.baselib.Retrofit;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;

/**
 * Created by hasee on 2017/2/1.
 */

public class OkHttp3Utils {
    private static OkHttpClient sOkHttpClient;
    /***
     * 30秒超时
     * @return
     */
    public static OkHttpClient getOkHttpClient() {
        if (sOkHttpClient == null) {
//            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
//            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            sOkHttpClient = new OkHttpClient.Builder()
//                    .addInterceptor(interceptor)
//                    .addInterceptor(new TokenInterceptor())
                    .connectTimeout(30, TimeUnit.SECONDS)
                    .writeTimeout(30, TimeUnit.SECONDS)
                    .readTimeout(30, TimeUnit.SECONDS)
                    .build()
            ;
        }
        return sOkHttpClient;
    }
}
