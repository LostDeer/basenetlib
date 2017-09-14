package com.meng.baselib.HttpData;

import com.meng.baselib.Api.BookService;
import com.meng.baselib.Retrofit.RetrofitUtils;
import com.meng.baselib.RxJava.FlatMapResylt;
import com.meng.baselib.entitys.HttpResult;
import com.meng.baselib.entitys.TestEntity;

import rx.Observable;
import rx.Observer;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by hasee on 2017/2/1.
 */

public class HttpData extends RetrofitUtils {
    //    protected static final Retrofit
    protected static final BookService service = getRetrofit("https://interface.meiriyiwen.com/article/").create(BookService.class);
//    private static final MediaType FORM_CONTENT_TYPE = MediaType.parse("application/x-www-form-urlencoded; charset=utf-8");

    public void getBookTypes(Observer<HttpResult<TestEntity>> subscriber) {
//        Observable observable = service.getTypeList();
        doNet(service.getTypeList(),subscriber,"123456789");
    }

    private void doNet(Observable<HttpResult<TestEntity>> observable, Observer<HttpResult<TestEntity>> observer, String tag) {
        Subscription subscribe = observable
                .map(new HttpResultFunc<TestEntity>())//接收后操作
                .flatMap(new FlatMapResylt<TestEntity>(tag))
                .subscribeOn(Schedulers.io())//订阅在子线程
                .observeOn(AndroidSchedulers.mainThread())//;观察者在主线程
                .subscribe(observer);
        mCompositeSubscription.add(subscribe);
    }

    //在访问HttpMethods时创建单例
    private static class SingletonHolder {
        private static final HttpData INSTANCE = new HttpData();
    }

    //获取单例
    public static HttpData getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
