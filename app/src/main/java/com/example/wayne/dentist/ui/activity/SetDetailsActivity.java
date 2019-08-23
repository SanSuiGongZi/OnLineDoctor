package com.example.wayne.dentist.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.wayne.dentist.R;
import com.example.wayne.dentist.base.BaseActivity;
import com.example.wayne.dentist.mvp.SetDetails.SetDetailsPre;
import com.example.wayne.dentist.mvp.SetDetails.SetDetailsView;
import com.jaeger.library.StatusBarUtil;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SetDetailsActivity extends BaseActivity<SetDetailsView,SetDetailsPre> implements SetDetailsView {

    @BindView(R.id.mIv_getBack)
    ImageView mIvGetBack;
    @BindView(R.id.mTv_details)
    TextView mTvDetails;
    @BindView(R.id.preserve)
    TextView preserve;
    @BindView(R.id.mTool)
    Toolbar mTool;
    @BindView(R.id.mTv_phone)
    TextView mTvPhone;
    @BindView(R.id.mBt_getCode)
    Button mBtGetCode;
    @BindView(R.id.mEt_code)
    EditText mEtCode;
    @BindView(R.id.mBt_next)
    Button mBtNext;
    @BindView(R.id.mLL_next)
    LinearLayout mLLNext;
    @BindView(R.id.mEt_Newphone)
    EditText mEtNewphone;
    @BindView(R.id.mBt_getNewCode)
    Button mBtGetNewCode;
    @BindView(R.id.mEt_Newcode)
    EditText mEtNewcode;
    @BindView(R.id.mBt_ok)
    Button mBtOk;
    @BindView(R.id.mLL_ok)
    LinearLayout mLLOk;
    @BindView(R.id.mEt_name)
    EditText mEtName;
    @BindView(R.id.mLl_name)
    LinearLayout mLlName;
    @BindView(R.id.mEt_RealName)
    EditText mEtRealName;
    @BindView(R.id.mLl_RealName)
    LinearLayout mLlRealName;
    @BindView(R.id.man)
    TextView man;
    @BindView(R.id.view)
    View view;
    @BindView(R.id.lady)
    TextView lady;
    @BindView(R.id.mRb_man)
    RadioButton mRbMan;
    @BindView(R.id.mRb_lady)
    RadioButton mRbLady;
    @BindView(R.id.mLl_sex)
    RelativeLayout mLlSex;

    @Override
    protected SetDetailsPre getPresenter() {
        return new SetDetailsPre();
    }

    @Override
    protected int getId() {
        return R.layout.activity_set_details;
    }

    @Override
    public void initView(Bundle savedInstanceState) {
        mTool.setTitle("");
        setSupportActionBar(mTool);
        StatusBarUtil.setLightMode(this);
    }

    @OnClick({R.id.mIv_getBack, R.id.preserve, R.id.mBt_getCode, R.id.mBt_next, R.id.mBt_getNewCode, R.id.mBt_ok})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.mIv_getBack:
                break;
            case R.id.preserve:
                break;
            case R.id.mBt_getCode:
                break;
            case R.id.mBt_next:
                break;
            case R.id.mBt_getNewCode:
                break;
            case R.id.mBt_ok:
                break;
        }
    }
}
