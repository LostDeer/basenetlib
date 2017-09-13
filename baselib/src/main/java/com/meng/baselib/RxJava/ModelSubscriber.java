package com.meng.baselib.RxJava;

import android.app.ProgressDialog;
import android.content.Context;
import android.util.Log;

import com.meng.baselib.entitys.HttpResult;

import rx.Subscriber;


/**
 * Created by LiChaoBo on 2017/9/13.
 */

public class ModelSubscriber<T> extends Subscriber<HttpResult<T>> {
    private Context mContext;
    private ProgressDialog mProgressDialog;

    public ModelSubscriber(Context context) {
        this.mContext = context;
        diaLogInit();
    }

    @Override
    public void onStart() {
        super.onStart();
        show();
        Log.e("ModelSubscriberOnStart", Thread.currentThread().getName());
    }

    @Override
    public void onCompleted() {
        Log.e("ModelSubscriberonCom", Thread.currentThread().getName());
        dismiss();
    }

    @Override
    public void onError(Throwable e) {
        Log.e("ModelSubscriberError", Thread.currentThread().getName());
        dismiss();
    }

    @Override
    public void onNext(HttpResult<T> tHttpResult) {

    }

    private void diaLogInit() {
        mProgressDialog = new ProgressDialog(mContext);
    }

    private void dismiss() {
        if (mProgressDialog != null) {
            if (mProgressDialog.isShowing()) {
                mProgressDialog.dismiss();
            }
        }
    }

    private void show() {
        if (mProgressDialog != null) {
            if (!mProgressDialog.isShowing()) {
                mProgressDialog.show();
            }
        }
    }
}
