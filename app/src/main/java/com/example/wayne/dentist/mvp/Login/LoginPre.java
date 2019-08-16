package com.example.wayne.dentist.mvp.Login;


import com.example.wayne.dentist.base.BasePre;
import com.example.wayne.dentist.bean.LoginBean;
import com.example.wayne.dentist.bean.LoginCode;
import com.example.wayne.dentist.bean.LoginUserBean;
import com.example.wayne.dentist.bean.RegisterBean;
import com.example.wayne.dentist.bean.RegisterCode;
import com.example.wayne.dentist.mvp.collback.CallBack;
import com.example.wayne.dentist.mvp.encyclopedia.EncyView;

/**
 * @name 张东
 * @time wayne2019/8/2
 * @describe
 */
public class LoginPre extends BasePre<LoginView> {

    private LoginModel mLoginModel;

    @Override
    protected void initModel() {
        mLoginModel = new LoginModel();
        mModels.add(mLoginModel);
    }

    //注册短信
    public void getRegister(String phone) {
        mLoginModel.setRegister(phone, new CallBack<RegisterCode>() {
            @Override
            public void onSucceed(RegisterCode bean) {
                if (mView != null) {
                    mView.getRegisterCode(bean);
                }
            }

            @Override
            public void onFailr(String msg) {
                mView.getError(msg);
            }
        });
    }

    //登录短信
    public void getLogin(String phone) {
        mLoginModel.setLogin(phone, new CallBack<LoginCode>() {
            @Override
            public void onSucceed(LoginCode bean) {
                if (mView != null) {
                    mView.getLoginCode(bean);
                }
            }

            @Override
            public void onFailr(String msg) {
                mView.getError(msg);
            }
        });
    }

    //用户注册
    public void setRegister(String sn, String phone, String code) {
        mLoginModel.isRegister(sn, phone, code, new CallBack<RegisterBean>() {
            @Override
            public void onSucceed(RegisterBean bean) {
                if (mView != null) {
                    mView.getRegister(bean);
                }
            }

            @Override
            public void onFailr(String msg) {
                mView.getError(msg);
            }
        });
    }

    //手机号登录
    public void setLogin(String sn, String phone, String code){
        mLoginModel.isPhoneLogin(sn, phone, code, new CallBack<LoginBean>() {
            @Override
            public void onSucceed(LoginBean bean) {
                if (mView!=null){
                    mView.getPhoneLogin(bean);
                }
            }

            @Override
            public void onFailr(String msg) {
                mView.getError(msg);
            }
        });
    }

    //账号密码登录
    public void setUserLogin(String username, String password){
        mLoginModel.isUserLogin(username, password, new CallBack<LoginUserBean>() {
            @Override
            public void onSucceed(LoginUserBean bean) {
                if (mView!=null){
                    mView.getUserLogin(bean);
                }
            }

            @Override
            public void onFailr(String msg) {
                mView.getError(msg);
            }
        });
    }

}
