package com.example.wayne.dentist.mvp.Login;


import com.example.wayne.dentist.base.BaseModel;
import com.example.wayne.dentist.base.BaseObserver;
import com.example.wayne.dentist.base.UrlPort;
import com.example.wayne.dentist.bean.LoginBean;
import com.example.wayne.dentist.bean.LoginCode;
import com.example.wayne.dentist.bean.LoginUserBean;
import com.example.wayne.dentist.bean.RegisterBean;
import com.example.wayne.dentist.bean.RegisterCode;
import com.example.wayne.dentist.mvp.collback.CallBack;
import com.example.wayne.dentist.util.HttpUtils;
import com.example.wayne.dentist.util.RxUtils;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;

/**
 * @name 张东
 * @time wayne2019/8/2
 * @describe
 */
public class LoginModel extends BaseModel {

    //获取注册短信
    public void setRegister(String phone, final CallBack<RegisterCode> mCallback) {
        UrlPort urlPort = HttpUtils.getInstance().getApiserver(UrlPort.Url, UrlPort.class);
        Observable<RegisterCode> registerCode = urlPort.getRegisterCode(phone);
        registerCode.compose(RxUtils.<RegisterCode>rxObserableSchedulerHelper())
                .subscribe(new BaseObserver<RegisterCode>() {
                    @Override
                    public void onNext(RegisterCode registerCode) {
                            mCallback.onSucceed(registerCode);
                    }

                    @Override
                    public void error(String msg) {
                            mCallback.onFailr(msg);
                    }

                    @Override
                    protected void subscribe(Disposable d) {
                            addDisposable(d);
                    }
                });
    }

    //获取登录短信
    public void setLogin(String phone, final CallBack<LoginCode> mCallback){
        UrlPort port = HttpUtils.getInstance().getApiserver(UrlPort.Url, UrlPort.class);
        Observable<LoginCode> loginCode = port.getLoginCode(phone);
        loginCode.compose(RxUtils.<LoginCode>rxObserableSchedulerHelper())
                .subscribe(new BaseObserver<LoginCode>() {
                    @Override
                    public void onNext(LoginCode loginCode) {
                            mCallback.onSucceed(loginCode);
                    }

                    @Override
                    public void error(String msg) {
                            mCallback.onFailr(msg);
                    }

                    @Override
                    protected void subscribe(Disposable d) {
                            addDisposable(d);
                    }
                });
    }

    //用户注册
    public void isRegister(String sn , String phone, String code, final CallBack<RegisterBean> mCallback){
        UrlPort urlPort = HttpUtils.getInstance().getApiserver(UrlPort.Url, UrlPort.class);
        Observable<RegisterBean> register = urlPort.getRegister(sn, code, 8, phone, phone, "", "", "",
                                        "", "", "", "", "", "");
        register.compose(RxUtils.<RegisterBean>rxObserableSchedulerHelper())
                .subscribe(new BaseObserver<RegisterBean>() {
                    @Override
                    public void onNext(RegisterBean bean) {
                        mCallback.onSucceed(bean);
                    }

                    @Override
                    public void error(String msg) {
                        mCallback.onFailr(msg);
                    }

                    @Override
                    protected void subscribe(Disposable d) {
                        addDisposable(d);
                    }
                });

    }

    //手机号登录
    public void isPhoneLogin(String sn , String phone, String code, final CallBack<LoginBean> mCallback){
        UrlPort apiserver = HttpUtils.getInstance().getApiserver(UrlPort.Url, UrlPort.class);
        Observable<LoginBean> login = apiserver.getLogin(phone, sn, code);
        login.compose(RxUtils.<LoginBean>rxObserableSchedulerHelper())
                .subscribe(new BaseObserver<LoginBean>() {
                    @Override
                    public void onNext(LoginBean bean) {
                        mCallback.onSucceed(bean);
                    }

                    @Override
                    public void error(String msg) {
                        mCallback.onFailr(msg);
                    }

                    @Override
                    protected void subscribe(Disposable d) {
                        addDisposable(d);
                    }
                });
    }

    //账号密码登录
    public void isUserLogin(String username , String password ,final CallBack<LoginUserBean> mCallback){
        UrlPort urlPort = HttpUtils.getInstance().getApiserver(UrlPort.Url, UrlPort.class);
        Observable<LoginUserBean> userLogin = urlPort.getUserLogin(username, password);
        userLogin.compose(RxUtils.<LoginUserBean>rxObserableSchedulerHelper())
                .subscribe(new BaseObserver<LoginUserBean>() {
                    @Override
                    public void onNext(LoginUserBean loginUserBean) {
                        mCallback.onSucceed(loginUserBean);
                    }

                    @Override
                    public void error(String msg) {
                        mCallback.onFailr(msg);
                    }

                    @Override
                    protected void subscribe(Disposable d) {
                        addDisposable(d);
                    }
                });
    }

}
