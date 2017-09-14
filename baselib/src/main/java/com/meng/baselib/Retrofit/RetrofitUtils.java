package com.meng.baselib.Retrofit;

import com.meng.baselib.Api.ApiException;
import com.meng.baselib.Constant.StatusCode;
import com.meng.baselib.entitys.HttpResult;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.functions.Func1;
import rx.subscriptions.CompositeSubscription;

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
    
    public  CompositeSubscription mCompositeSubscription=new CompositeSubscription();

    /**
     * 取消所有网络请求
     */
    public void cancelNet() {
        mCompositeSubscription.unsubscribe();
    }
    /**
     * 用来统一处理Http的resultCode,并将HttpResult的Data部分剥离出来返回给subscriber
     *
     * @param <T> Subscriber真正需要的数据类型，也就是Data部分的数据类型
     */
    public class HttpResultFunc<T> implements Func1<HttpResult<T>, HttpResult<T>> {

        @Override
        public HttpResult<T> call(HttpResult<T> httpResult) {
            if (httpResult.getCode() != StatusCode.OK) {
                throw new ApiException(httpResult);
            }
            return httpResult;
        }
    }

}
