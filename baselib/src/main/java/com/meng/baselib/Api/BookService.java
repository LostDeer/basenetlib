package com.meng.baselib.Api;

import com.meng.baselib.entitys.HttpResult;
import com.meng.baselib.entitys.TestEntity;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by hasee on 2017/2/1.
 */

public interface BookService {
    //获取类别列表@FormUrlEncoded
//    @Multipart
//    @POST("/uc/user/update")
//    Observable<HttpResult<MessageEntity>> getTypeList(@PartMap HashMap<String, RequestBody> names);

//    @FormUrlEncoded
//    @POST("/uc/user/update")
//    Observable<HttpResult<MessageEntity>> getTypeList(@FieldMap HashMap<String, String> names);
    @GET("today")
    Observable<HttpResult<TestEntity>> getTypeList();
}
