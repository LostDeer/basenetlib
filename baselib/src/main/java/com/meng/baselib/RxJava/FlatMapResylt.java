package com.meng.baselib.RxJava;


import com.meng.baselib.entitys.HttpResult;

import rx.Observable;
import rx.functions.Func1;

/**
 * Created by LiChaoBo on 2017/9/13.
 */

public class FlatMapResylt<T> implements Func1<HttpResult<T>,
        Observable<HttpResult<T>>> {
    private String tag;

    public FlatMapResylt(String tag) {
        this.tag=tag;
    }
    @Override
    public Observable<HttpResult<T>> call(HttpResult<T> tHttpResult) {
        tHttpResult.setRequest(tag);
        return Observable.just(tHttpResult);
    }
}
