package com.example.wayne.dentist.ui.activity;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.wayne.dentist.R;
import com.example.wayne.dentist.base.BaseActivity;
import com.example.wayne.dentist.mvp.HostitalMessage.HospitalMessagePre;
import com.example.wayne.dentist.mvp.HostitalMessage.HospitalMessageView;
import com.jaeger.library.StatusBarUtil;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HostitalMessageActivity extends BaseActivity<HospitalMessageView, HospitalMessagePre> implements HospitalMessageView {

    @BindView(R.id.mIv_getBack)
    ImageView mIvGetBack;
    @BindView(R.id.mTool)
    Toolbar mTool;
    @BindView(R.id.mIv_Hospital)
    ImageView mIvHospital;
    @BindView(R.id.mTv_Hospital)
    TextView mTvHospital;
    @BindView(R.id.mTv_phone)
    TextView mTvPhone;
    @BindView(R.id.mTv_Official_Accounts)
    TextView mTvOfficialAccounts;
    @BindView(R.id.mBt_copy)
    Button mBtCopy;
    @BindView(R.id.mTv_official_website)
    TextView mTvOfficialWebsite;
    @BindView(R.id.mTv_cure_project)
    TextView mTvCureProject;

    @Override
    protected HospitalMessagePre getPresenter() {
        return new HospitalMessagePre();
    }

    @Override
    protected int getId() {
        return R.layout.activity_hostital_message;
    }

    @Override
    public void initView(Bundle savedInstanceState) {
        mTool.setTitle("");
        setSupportActionBar(mTool);
        StatusBarUtil.setLightMode(this);
    }

    @OnClick({R.id.mIv_getBack, R.id.mBt_copy})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.mIv_getBack:
                break;
            case R.id.mBt_copy:
                break;
        }
    }
}
