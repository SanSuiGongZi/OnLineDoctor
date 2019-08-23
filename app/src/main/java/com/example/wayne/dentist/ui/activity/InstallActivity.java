package com.example.wayne.dentist.ui.activity;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.example.wayne.dentist.R;
import com.example.wayne.dentist.base.BaseActivity;
import com.example.wayne.dentist.mvp.install.InstallPre;
import com.example.wayne.dentist.mvp.install.InstallView;
import com.jaeger.library.StatusBarUtil;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class InstallActivity extends BaseActivity<InstallView, InstallPre> implements InstallView {

    @BindView(R.id.mIv_getBack)
    ImageView mIvGetBack;
    @BindView(R.id.mTool)
    Toolbar mTool;
    @BindView(R.id.mLl_clear_cache)
    RelativeLayout mLlClearCache;
    @BindView(R.id.mLl_as_regards)
    RelativeLayout mLlAsRegards;
    @BindView(R.id.mBt_quit_Account)
    Button mBtQuitAccount;

    @Override
    protected InstallPre getPresenter() {
        return new InstallPre();
    }

    @Override
    protected int getId() {
        return R.layout.activity_install;
    }

    @Override
    public void initView(Bundle savedInstanceState) {
        mTool.setTitle("");
        setSupportActionBar(mTool);
        StatusBarUtil.setLightMode(this);
    }

    @OnClick({R.id.mIv_getBack, R.id.mLl_clear_cache, R.id.mLl_as_regards, R.id.mBt_quit_Account})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.mIv_getBack:
                finish();
                break;
            case R.id.mLl_clear_cache:
                break;
            case R.id.mLl_as_regards:
                break;
            case R.id.mBt_quit_Account:
                break;
        }
    }
}
