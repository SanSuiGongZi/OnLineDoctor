package com.example.wayne.dentist.ui.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

import com.example.wayne.dentist.R;
import com.example.wayne.dentist.base.BaseActivity;
import com.example.wayne.dentist.mvp.MakeAnAppointment.MakePre;
import com.example.wayne.dentist.mvp.MakeAnAppointment.MakeView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MakeAnAppointment extends BaseActivity<MakeView, MakePre> implements MakeView {

    @BindView(R.id.mIv_getBack)
    ImageView mIvGetBack;
    @BindView(R.id.mTool)
    Toolbar mTool;
    @BindView(R.id.mTab)
    TabLayout mTab;
    @BindView(R.id.mVp)
    ViewPager mVp;

    @Override
    protected MakePre getPresenter() {
        return new MakePre();
    }

    @Override
    protected int getId() {
        return R.layout.activity_make_an_appointment;
    }

    @OnClick(R.id.mIv_getBack)
    public void onViewClicked() {
        finish();
    }
}
