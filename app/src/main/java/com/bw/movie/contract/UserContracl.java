package com.bw.movie.contract;

import com.bw.movie.base.BaseModel;
import com.bw.movie.base.BaseView;
import com.bw.movie.model.entity.UserEntity;

/**
 * 时间：2020/4/8
 * 作者：徐黎明
 * 类的作用：
 */
public interface UserContracl {
    interface Model extends BaseModel {
        void getresgin(String nickName, String pwd, String email, String code, ModelCallBack modelCallBack);
        void getlogin(String email, String pwd, ModelCallBack modelCallBack);
        void getyzm(String email, ModelCallBack modelCallBack);
    }
    interface ModelCallBack{
        void success(UserEntity userEntity);
        void fshibai(Throwable throwable);
    }
    interface View extends BaseView {
        void success(UserEntity userEntity);
        void fshibai(Throwable throwable);
    }
    interface Presenter{
        void getresgin(String nickName, String pwd, String email, String code);
        void getlogin(String email, String pwd);
        void getyzm(String email);
    }
}
