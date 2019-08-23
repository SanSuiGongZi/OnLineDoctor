package com.example.wayne.dentist.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.wayne.dentist.R;
import com.example.wayne.dentist.base.BaseActivity;
import com.example.wayne.dentist.mvp.regulate.RegulatePre;
import com.example.wayne.dentist.mvp.regulate.RegulateView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RegulateActivity extends BaseActivity<RegulateView, RegulatePre> implements RegulateView {

    @BindView(R.id.mIv_getBack)
    ImageView mIvGetBack;
    @BindView(R.id.mTv_details)
    TextView mTvDetails;
    @BindView(R.id.mTool)
    Toolbar mTool;
    @BindView(R.id.mTV_regulate)
    TextView mTVRegulate;
    @BindView(R.id.mTV_opinion)
    TextView mTVOpinion;
    @BindView(R.id.preconcentration)
    TextView preconcentration;

    @Override
    protected RegulatePre getPresenter() {
        return new RegulatePre();
    }

    @Override
    protected int getId() {
        return R.layout.activity_regulate;
    }

    @Override
    public void initView(Bundle savedInstanceState) {

        mTool.setTitle("");
        setSupportActionBar(mTool);

        //设置颜色(定保诊所)
        SpannableStringBuilder builder = new SpannableStringBuilder(mTVRegulate.getText());
        //设置前景色
        ForegroundColorSpan span = new ForegroundColorSpan(getResources().getColor(R.color.blue));
        //设置下划线
        UnderlineSpan span1 = new UnderlineSpan();
        builder.setSpan(span, (mTVRegulate.length()), mTVRegulate.length(), Spanned.SPAN_EXCLUSIVE_INCLUSIVE);
        builder.setSpan(span1, (mTVRegulate.length()), mTVRegulate.length(), Spanned.SPAN_EXCLUSIVE_INCLUSIVE);
        mTVRegulate.setText(builder);

        //设置颜色(预选定保诊所)
        SpannableStringBuilder builders = new SpannableStringBuilder(preconcentration.getText());
        ForegroundColorSpan spans = new ForegroundColorSpan(getResources().getColor(R.color.blue));
        builders.setSpan(spans, (preconcentration.length()-6), preconcentration.length(), Spanned.SPAN_EXCLUSIVE_INCLUSIVE);
        mTVRegulate.setText(builders);

    }

    @OnClick({R.id.mIv_getBack, R.id.mTV_regulate, R.id.mTV_opinion, R.id.preconcentration})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.mIv_getBack:
                finish();
                break;
            case R.id.mTV_regulate:
                break;
            case R.id.mTV_opinion:
                break;
            case R.id.preconcentration:
                //预选定保诊所
                startActivity(new Intent(RegulateActivity.this,PreselectionActivity.class));

                break;
        }
    }

}
