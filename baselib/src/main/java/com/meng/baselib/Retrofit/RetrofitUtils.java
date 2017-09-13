package com.meng.baselib.Retrofit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by hasee on 2017/2/1.
 */

public abstract class RetrofitUtils {
    private static Retrofit sRetrofit;
    private static OkHttpClient sOkHttpClient;
    /**
     * 获取Retrofit对象
     * @return
     */
    public static Retrofit getRetrofit(String baseUrl){
        if(sRetrofit==null){
            if(sOkHttpClient==null){
                sOkHttpClient=OkHttp3Utils.getOkHttpClient();
            }
            sRetrofit=new Retrofit.Builder()
                    //设置服务器路径
                    .baseUrl(baseUrl)
                    //添加转化库，默认是Gson
                    .addConverterFactory(GsonConverterFactory.create())
                    //添加回调库，采用RxJava
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    //设置使用okhttp网络请求
                    .client(sOkHttpClient)
                    .build();
        }

        return sRetrofit;
    }

}
