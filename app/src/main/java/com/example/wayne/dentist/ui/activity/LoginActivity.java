package com.example.wayne.dentist.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.wayne.dentist.R;
import com.example.wayne.dentist.base.BaseActivity;
import com.example.wayne.dentist.bean.LoginBean;
import com.example.wayne.dentist.bean.LoginCode;
import com.example.wayne.dentist.bean.LoginUserBean;
import com.example.wayne.dentist.bean.RegisterBean;
import com.example.wayne.dentist.bean.RegisterCode;
import com.example.wayne.dentist.mvp.Login.LoginPre;
import com.example.wayne.dentist.mvp.Login.LoginView;
import com.example.wayne.dentist.util.ToastUtil;
import com.example.wayne.dentist.widget.RoutineTextView;
import com.jaeger.library.StatusBarUtil;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity<LoginView, LoginPre> implements LoginView {

    // toolbar
    @BindView(R.id.mTool)
    Toolbar mTool;
    @BindView(R.id.mIv_getBack)
    ImageView mIvGetBack;
    @BindView(R.id.mTv_switchover)
    RoutineTextView mTvSwitchover;

    //手机
    @BindView(R.id.isLogin_phone)
    LinearLayout isLoginPhone;
    @BindView(R.id.mTv_login)
    RoutineTextView mTvLogin;
    @BindView(R.id.mEt_phone)
    EditText mEtPhone;
    @BindView(R.id.mTv_getCode)
    TextView mTvGetCode;
    @BindView(R.id.mEt_phoneCode)
    EditText mEtPhoneCode;
    @BindView(R.id.mll_Code)
    LinearLayout mllCode;
    @BindView(R.id.mBt_phoneEnter)
    Button mBtPhoneEnter;

    //密码登录
    @BindView(R.id.isLogin_account)
    LinearLayout isLoginAccount;
    @BindView(R.id.mEt_account)
    EditText mEtAccount;
    @BindView(R.id.mEt_password)
    EditText mEtPassword;
    @BindView(R.id.mTV_retrievePassword)
    TextView mTVRetrievePassword;
    @BindView(R.id.mBt_accountEnter)
    Button mBtAccountEnter;

    // 三方
    @BindView(R.id.mIv_weChat)
    ImageView mIvWeChat;
    @BindView(R.id.mIv_QQ)
    ImageView mIvQQ;
    @BindView(R.id.mIv_microblog)
    ImageView mIvMicroblog;

    //判断是否被点击
    private boolean mBoolean = false;

    //判断该手机号是否已注册
    private boolean isRegister = false;

    private String mPhone;
    private String mSn;
    private String mCode;
    private String mToken;

    @Override
    protected LoginPre getPresenter() {
        return new LoginPre();
    }

    @Override
    protected int getId() {
        return R.layout.activity_login;
    }

    @Override
    public void initView() {
        mTool.setTitle("");
        setSupportActionBar(mTool);
        StatusBarUtil.setLightMode(this);

        mTvSwitchover.setText(getResources().getText(R.string.login_password));

        initI();

    }

    //设置验证码按钮
    private void initI() {

        mEtPhone.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.length() == 11) {
                    mllCode.setVisibility(View.VISIBLE);
                } else {
                    mllCode.setVisibility(View.GONE);
                }
            }
        });

        mEtPhoneCode.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.length() == 6) {
                    switchBtnState(s.toString());
                } else {
                    switchBtnState("");
                }
            }
        });

    }

    private void switchBtnState(String s) {
        if (!TextUtils.isEmpty(s)) {
            mBtPhoneEnter.setBackgroundResource(R.drawable.button_shapelogin);
            mBtPhoneEnter.setEnabled(true);
        } else {
            mBtPhoneEnter.setBackgroundResource(R.drawable.button_shape);
            mBtPhoneEnter.setEnabled(false);
        }
    }

    @OnClick({R.id.mIv_getBack, R.id.mTv_switchover, R.id.mBt_phoneEnter, R.id.mIv_weChat, R.id.mIv_QQ, R.id.mIv_microblog, R.id.mTV_retrievePassword, R.id.mTv_getCode})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.mIv_getBack:
                finish();
                break;
            case R.id.mTv_switchover:
                //切换登录方式
                if (mBoolean) {
                    mTvSwitchover.setText(getResources().getText(R.string.login_password));
                    mTvLogin.setText(getResources().getText(R.string.login_hostital));
                    mBoolean = false;
                    isLoginAccount.setVisibility(View.GONE);
                    isLoginPhone.setVisibility(View.VISIBLE);
                } else {
                    mTvSwitchover.setText(getResources().getText(R.string.login_nopassword));
                    mTvLogin.setText(getResources().getText(R.string.login_password));
                    mBoolean = true;
                    isLoginAccount.setVisibility(View.VISIBLE);
                    isLoginPhone.setVisibility(View.GONE);
                }

                break;
            case R.id.mTv_getCode:
                //获取验证码
                mPhone = mEtPhone.getText().toString().trim();

                if (!mPhone.isEmpty()) {
                    if (mPhone.length() == 11) {
                        mPresenter.getLogin(mPhone);
                    } else {
                        ToastUtil.showShort("请输入正确的手机号");
                    }
                } else {
                    ToastUtil.showShort("手机号码不能为空");
                }

                break;
            case R.id.mTV_retrievePassword:
                //找回密码
                break;
            case R.id.mBt_phoneEnter:
                //手机号登录
                mCode = mEtPhoneCode.getText().toString().trim();

                if (isRegister) {
                    //调用手机号登录接口
                    mPresenter.setLogin(mSn, mPhone, mCode);
                } else {
                    mPresenter.setRegister(mSn, mPhone, mCode);
                }

                break;
            case R.id.mBt_accountEnter:
                //调用账号密码登录
                String username = mEtAccount.getText().toString().trim();
                String password = mEtPassword.getText().toString().trim();
                mPresenter.setUserLogin(username, password);
                break;
            case R.id.mIv_weChat:
                break;
            case R.id.mIv_QQ:
                break;
            case R.id.mIv_microblog:
                break;
        }
    }

    @Override
    public void getLoginCode(LoginCode bean) {
        if (bean.getResult() == 1) {
            mSn = bean.getSn();
            ToastUtil.showShort(bean.getMsg());
            isRegister = true;
            startActivity(new Intent(LoginActivity.this, MainActivity.class));
        } else {
            if (bean.getMsg().equals("手机号码不存在")) {
                mPresenter.getRegister(mPhone);
            } else {
                ToastUtil.showShort("请稍后再试");
            }

        }
    }

    @Override
    public void getRegister(RegisterBean bean) {
        if (bean.getResult() == 1) {

            ToastUtil.showShort(bean.getMsg());
            startActivity(new Intent(LoginActivity.this, MainActivity.class));
            finish();
        }
        ToastUtil.showShort(bean.getMsg());
    }

    @Override
    public void getPhoneLogin(LoginBean bean) {
        if (bean.getResult() == 1) {
            mToken = bean.getToken();
            startActivity(new Intent(LoginActivity.this, MainActivity.class));
            finish();
        } else {
            ToastUtil.showShort(bean.getMsg());
        }
    }

    @Override
    public void getUserLogin(LoginUserBean loginUserBean) {
        if (loginUserBean.getResult() == 1) {
            mToken = loginUserBean.getToken();

            startActivity(new Intent(LoginActivity.this, MainActivity.class));

        } else {
            ToastUtil.showShort(loginUserBean.getMsg());
        }
    }

    @Override
    public void getRegisterCode(RegisterCode bean) {
        if (bean.getResult() == 1) {
            mSn = bean.getSn();
            isRegister = false;
        } else {
            ToastUtil.showShort("请稍后再试");
        }
    }

    @Override
    public void getError(String msg) {
        ToastUtil.showShort(msg);
    }

}
