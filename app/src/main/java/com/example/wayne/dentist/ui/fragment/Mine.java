package com.example.wayne.dentist.ui.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.wayne.dentist.R;
import com.example.wayne.dentist.base.BaseFragment;
import com.example.wayne.dentist.mvp.mine.MinePre;
import com.example.wayne.dentist.mvp.mine.MineView;
import com.example.wayne.dentist.ui.activity.HostitalMessageActivity;
import com.example.wayne.dentist.ui.activity.InstallActivity;
import com.example.wayne.dentist.ui.activity.PersonalDetails;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;


/**
 * A simple {@link Fragment} subclass.
 */
public class Mine extends BaseFragment<MineView, MinePre> implements MineView {

    @BindView(R.id.mIv_photo)
    ImageView mIvPhoto;
    @BindView(R.id.mRl)
    RelativeLayout mRl;
    @BindView(R.id.mTv_name)
    TextView mTvName;
    @BindView(R.id.mTv_set)
    TextView mTvSet;
    @BindView(R.id.mIv_Hospital)
    ImageView mIvHospital;
    @BindView(R.id.mTv_Hospital)
    TextView mTvHospital;
    @BindView(R.id.mLL_hospital)
    LinearLayout mLLHospital;
    @BindView(R.id.mTv_NoHospital)
    TextView mTvNoHospital;
    @BindView(R.id.mRv_serve)
    RecyclerView mRvServe;
    @BindView(R.id.mRv_BuyerNotice)
    RecyclerView mRvBuyerNotice;
    @BindView(R.id.mLL_setHospital)
    LinearLayout mLLSetHospital;
    @BindView(R.id.install)
    ImageView install;

    public Mine() {
        // Required empty public constructor
    }

    @Override
    protected MinePre GetPresenter() {
        return new MinePre();
    }

    @Override
    protected int GetId() {
        return R.layout.fragment_mine;
    }

    @Override
    protected void initView() {

        SpannableStringBuilder builder = new SpannableStringBuilder(mTvNoHospital.getText());
        //设置前景色
        ForegroundColorSpan span = new ForegroundColorSpan(getResources().getColor(R.color.blue));
        UnderlineSpan span1 = new UnderlineSpan();
        builder.setSpan(span, (mTvNoHospital.length() - 2), mTvNoHospital.length(), Spanned.SPAN_EXCLUSIVE_INCLUSIVE);
        builder.setSpan(span1, (mTvNoHospital.length() - 2), mTvNoHospital.length(), Spanned.SPAN_EXCLUSIVE_INCLUSIVE);
        mTvNoHospital.setText(builder);

    }

    @OnClick({R.id.mRl, R.id.mTv_set, R.id.mLL_setHospital, R.id.install, R.id.mTv_NoHospital, R.id.mLL_hospital})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.mRl:
                //修改个人资料
                Intent intent = new Intent(getActivity(), PersonalDetails.class);
                startActivity(intent);
                break;
            case R.id.mTv_set:
                //修改个人资料
                Intent intent1 = new Intent(getActivity(), PersonalDetails.class);
                startActivity(intent1);
                break;
            case R.id.mLL_setHospital:
                //更改定保诊所
                break;
            case R.id.install:
                //设置
                startActivity(new Intent(getActivity(), InstallActivity.class));
                break;
            case R.id.mTv_NoHospital:
                //设置定保诊所
                break;
            case R.id.mLL_hospital:
                //查看门诊信息
                startActivity(new Intent(getActivity(),HostitalMessageActivity.class));
                break;
        }
    }
}
