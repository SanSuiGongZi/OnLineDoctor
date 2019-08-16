package com.example.wayne.dentist.mvp.collback;

/**
 * @name 张东
 * @time 2019/8/117:05
 */
public interface CallBack<T> {

    void onSucceed(T bean);
    void onFailr(String msg);

}
