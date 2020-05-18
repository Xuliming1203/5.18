package com.bw.movie.api;

import com.bw.movie.model.entity.UserEntity;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * 时间：2020/4/16
 * 作者：徐黎明
 * 类的作用：
 */
public interface UserApiService {
    @POST("movieApi/user/v2/register")
    @FormUrlEncoded
    Observable<UserEntity> getregis(@Field("nickName") String nickName,
                                    @Field("pwd") String pwd,
                                    @Field("email") String email,
                                    @Field("code") String code);
    @POST("movieApi/user/v2/login")
    @FormUrlEncoded
    Observable<UserEntity> getlogin(@Field("email") String email,
                                    @Field("pwd") String pwd);
    @POST("movieApi/user/v2/sendOutEmailCode")
    @FormUrlEncoded
    Observable<UserEntity> getyzm(@Field("email") String email);
}
