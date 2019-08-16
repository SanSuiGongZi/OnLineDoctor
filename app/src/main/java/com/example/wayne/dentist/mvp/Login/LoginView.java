package com.example.wayne.dentist.mvp.Login;


import com.example.wayne.dentist.base.BaseView;
import com.example.wayne.dentist.bean.LoginBean;
import com.example.wayne.dentist.bean.LoginCode;
import com.example.wayne.dentist.bean.LoginUserBean;
import com.example.wayne.dentist.bean.RegisterBean;
import com.example.wayne.dentist.bean.RegisterCode;

/**
 * @name 张东
 * @time wayne2019/8/2
 * @describe
 */
public interface LoginView extends BaseView {

    //获取注册验证码
    void getRegisterCode(RegisterCode bean);

    //获取登录验证码
    void getLoginCode(LoginCode bean);

    //获取注册信息
    void getRegister(RegisterBean bean);

    //手机号登录
    void getPhoneLogin(LoginBean bean);

    //账号密码登录
    void getUserLogin(LoginUserBean loginUserBean);

    //返回错误信息
    void getError(String msg);

}
