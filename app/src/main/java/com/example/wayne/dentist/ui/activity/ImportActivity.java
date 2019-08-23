package com.example.wayne.dentist.ui.activity;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.wayne.dentist.R;
import com.example.wayne.dentist.base.BaseActivity;
import com.example.wayne.dentist.mvp.Import.ImportPre;
import com.example.wayne.dentist.mvp.Import.ImportView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ImportActivity extends BaseActivity<ImportView, ImportPre> implements ImportView {

    @BindView(R.id.mIv_getBack)
    ImageView mIvGetBack;
    @BindView(R.id.mTool)
    Toolbar mTool;
    @BindView(R.id.mIv_clear)
    ImageView mIvClear;
    @BindView(R.id.mLv_hotCity)
    ListView mLvHotCity;
    @BindView(R.id.mTv_province)
    TextView mTvProvince;
    @BindView(R.id.mTv_city)
    TextView mTvCity;
    @BindView(R.id.mTv_district)
    TextView mTvDistrict;
    @BindView(R.id.mLv_city)
    ListView mLvCity;

    @Override
    protected ImportPre getPresenter() {
        return new ImportPre();
    }

    @Override
    protected int getId() {
        return R.layout.activity_import;
    }

    @Override
    public void initView(Bundle savedInstanceState) {
        mTool.setTitle("");
        setSupportActionBar(mTool);
    }

    @OnClick({R.id.mIv_getBack, R.id.mIv_clear, R.id.mTv_province, R.id.mTv_city, R.id.mTv_district})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.mIv_getBack:
                finish();
                break;
            case R.id.mIv_clear:
                break;
            case R.id.mTv_province:
                break;
            case R.id.mTv_city:
                break;
            case R.id.mTv_district:
                break;
        }
    }
}
