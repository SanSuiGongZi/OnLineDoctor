package com.example.wayne.dentist.ui.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.wayne.dentist.R;
import com.example.wayne.dentist.base.BaseFragment;
import com.example.wayne.dentist.mvp.inquiry.InquiryPre;
import com.example.wayne.dentist.mvp.inquiry.InquiryView;
import com.example.wayne.dentist.util.ToastUtil;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;


/**
 * A simple {@link Fragment} subclass.
 */
public class Inquiry extends BaseFragment<InquiryView, InquiryPre> implements InquiryView {

    @BindView(R.id.mTv_toothache)
    TextView mTvToothache;
    @BindView(R.id.mTv_badBreath)
    TextView mTvBadBreath;
    @BindView(R.id.mTv_bleeding)
    TextView mTvBleeding;
    @BindView(R.id.mTv_nigrities)
    TextView mTvNigrities;
    @BindView(R.id.mIv_nigrities_hint)
    ImageView mIvNigritiesHint;
    @BindView(R.id.mIv_nigrities_back)
    ImageView mIvNigritiesBack;
    @BindView(R.id.mTv_isIllness)
    TextView mTvIsIllness;
    @BindView(R.id.mTv_issue)
    TextView mTvIssue;
    @BindView(R.id.mTv_feed)
    TextView mTvFeed;
    @BindView(R.id.mTv_spontaneity)
    TextView mTvSpontaneity;
    @BindView(R.id.mIv_spontaneity_back)
    ImageView mIvSpontaneityBack;
    @BindView(R.id.mIv_eat_back)
    ImageView mIvEatBack;
    @BindView(R.id.mTv_is)
    TextView mTvIs;
    @BindView(R.id.mTv_eat)
    TextView mTvEat;
    @BindView(R.id.mTv_cold_sweet)
    TextView mTvColdSweet;
    @BindView(R.id.mTv_hotFood)
    TextView mTvHotFood;
    @BindView(R.id.mTv_allDayLong)
    TextView mTvAllDayLong;
    @BindView(R.id.mIv_eatFood_back)
    ImageView mIvEatFoodBack;
    @BindView(R.id.mTv_eatFood)
    TextView mTvEatFood;
    @BindView(R.id.mTv_stopEat)
    TextView mTvStopEat;
    @BindView(R.id.mTv_stopEat_yes)
    TextView mTvStopEatYes;
    @BindView(R.id.mTv_stopEat_no)
    TextView mTvStopEatNo;
    @BindView(R.id.mIv_stopEat_back)
    ImageView mIvStopEatBack;
    @BindView(R.id.mTv_IsEat)
    TextView mTvIsEat;
    @BindView(R.id.mTv_IsStopEat)
    TextView mTvIsStopEat;
    @BindView(R.id.mTv_IsStopEat_yes)
    TextView mTvIsStopEatYes;
    @BindView(R.id.mTv_IsStopEat_no)
    TextView mTvIsStopEatNo;
    @BindView(R.id.mTv_PurePain)
    TextView mTvPurePain;
    @BindView(R.id.mIv_IsStopEat_back)
    ImageView mIvIsStopEatBack;
    @BindView(R.id.mTv_IfEat)
    TextView mTvIfEat;
    @BindView(R.id.mTv_ifAggravate)
    TextView mTvIfAggravate;
    @BindView(R.id.mTv_ifAggravate_yes)
    TextView mTvIfAggravateYes;
    @BindView(R.id.mTv_ifAggravatet_no)
    TextView mTvIfAggravatetNo;
    @BindView(R.id.mIv_ifAggravatet_back)
    ImageView mIvIfAggravatetBack;
    @BindView(R.id.mTv_ifAggravatet)
    TextView mTvIfAggravatet;
    @BindView(R.id.mTv_ifLoose)
    TextView mTvIfLoose;
    @BindView(R.id.mTv_ifLoose_yes)
    TextView mTvIfLooseYes;
    @BindView(R.id.mTv_ifLoose_no)
    TextView mTvIfLooseNo;
    @BindView(R.id.mIv_ifLoose_back)
    ImageView mIvIfLooseBack;
    @BindView(R.id.mTv_isLoose)
    TextView mTvIsLoose;
    @BindView(R.id.mTv_result)
    TextView mTvResult;
    @BindView(R.id.mBtn_GeneralMap)
    Button mBtnGeneralMap;
    @BindView(R.id.mBtn_reading)
    Button mBtnReading;
    @BindView(R.id.mBtn_of_cases)
    Button mBtnOfCases;
    @BindView(R.id.mBtn_newInquiry)
    Button mBtnNewInquiry;
    @BindView(R.id.mIsOne)
    RelativeLayout mIsOne;
    @BindView(R.id.mIsTwo)
    RelativeLayout mIsTwo;
    @BindView(R.id.mIsThree)
    RelativeLayout mIsThree;
    @BindView(R.id.mIsFour)
    RelativeLayout mIsFour;
    @BindView(R.id.mIsFive)
    RelativeLayout mIsFive;
    @BindView(R.id.mIsSix)
    RelativeLayout mIsSix;
    @BindView(R.id.mIsSeven)
    RelativeLayout mIsSeven;
    @BindView(R.id.mIsResult)
    RelativeLayout mIsResult;
    private String mString;
    private String mEat;
    private String mFeel;

    public Inquiry() {
        // Required empty public constructor
    }

    @Override
    protected InquiryPre GetPresenter() {
        return new InquiryPre();
    }

    @Override
    protected int GetId() {
        return R.layout.fragment_inquiry;
    }

    @OnClick({R.id.mTv_toothache, R.id.mTv_badBreath, R.id.mTv_bleeding, R.id.mTv_nigrities, R.id.mIv_nigrities_hint, R.id.mIv_nigrities_back,
            R.id.mTv_issue, R.id.mTv_feed, R.id.mTv_spontaneity, R.id.mIv_spontaneity_back, R.id.mIv_eat_back, R.id.mTv_eat, R.id.mTv_cold_sweet,
            R.id.mTv_hotFood, R.id.mTv_allDayLong, R.id.mIv_eatFood_back, R.id.mTv_eatFood, R.id.mTv_stopEat,
            R.id.mTv_stopEat_yes, R.id.mTv_stopEat_no, R.id.mIv_stopEat_back, R.id.mTv_IsEat, R.id.mTv_IsStopEat, R.id.mTv_IsStopEat_yes,
            R.id.mTv_IsStopEat_no, R.id.mTv_PurePain, R.id.mIv_IsStopEat_back, R.id.mTv_IfEat, R.id.mTv_ifAggravate, R.id.mTv_ifAggravate_yes,
            R.id.mTv_ifAggravatet_no, R.id.mIv_ifAggravatet_back, R.id.mTv_ifAggravatet, R.id.mTv_ifLoose, R.id.mTv_ifLoose_yes, R.id.mTv_ifLoose_no,
            R.id.mIv_ifLoose_back, R.id.mTv_isLoose, R.id.mTv_result, R.id.mBtn_GeneralMap, R.id.mBtn_reading, R.id.mBtn_of_cases, R.id.mBtn_newInquiry})

    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.mTv_toothache:
                //牙疼
                //隐藏选项
                mIsOne.setVisibility(View.GONE);
                //显示选择内容
                mTvIsIllness.setVisibility(View.VISIBLE);
                mIvNigritiesBack.setVisibility(View.VISIBLE);
                //赋值
                mTvIsIllness.setText(getResources().getText(R.string.symptom_toothache));
                //问题二赋值
                mTvIssue.setText(getResources().getText(R.string.describe_symptom));
                mTvFeed.setText(getResources().getText(R.string.describe_symptom_eat));
                mTvSpontaneity.setText(getResources().getText(R.string.describe_symptom_spontaneity));
                //显示下一个问题
                mIsTwo.setVisibility(View.VISIBLE);
                //获取选择的内容
                mFeel = mTvToothache.getText().toString();
                break;
            case R.id.mTv_badBreath:
                //口腔异味
                mTvIssue.setText(getResources().getText(R.string.peculiar));
                //问题二赋值
                mTvIssue.setText(getResources().getText(R.string.describe_symptom));
                mTvFeed.setText(getResources().getText(R.string.yes_peculiar));
                mTvSpontaneity.setText(getResources().getText(R.string.no_peculiar));

                break;
            case R.id.mTv_bleeding:
                //刷牙出血
                mTvIssue.setText(getResources().getText(R.string.hemorrhage));
                //问题二赋值
                mTvIssue.setText(getResources().getText(R.string.describe_symptom));
                mTvFeed.setText(getResources().getText(R.string.yes_hemorrhage));
                mTvSpontaneity.setText(getResources().getText(R.string.no_hemorrhage));

                break;
            case R.id.mTv_nigrities:
                //牙齿颜色变黑
                mTvIssue.setText(getResources().getText(R.string.habit));
                //问题二赋值
                mTvIssue.setText(getResources().getText(R.string.describe_symptom));
                mTvFeed.setText(getResources().getText(R.string.yes_habit));
                mTvSpontaneity.setText(getResources().getText(R.string.no_habit));

                break;
            case R.id.mIv_nigrities_hint:
                //牙齿颜色变黑解释
                break;
            case R.id.mIv_nigrities_back:
                //返回牙齿问题选择
                break;
            case R.id.mTv_feed:
                //选项一
                //隐藏该问题选项
                mTvFeed.setVisibility(View.GONE);
                mTvSpontaneity.setVisibility(View.GONE);
                mIvSpontaneityBack.setVisibility(View.GONE);

                //赋值
                if (mFeel.equals(getResources().getText(R.string.symptom_toothache))) {
                    mTvIs.setText(getResources().getText(R.string.describe_symptom_eat));
                    mTvEat.setText(getResources().getText(R.string.describe_symptom_eat_of));
                    mTvColdSweet.setText(getResources().getText(R.string.describe_symptom_eat_cold));
                    mTvHotFood.setText(getResources().getText(R.string.describe_symptom_eat_hot));

                } else if (mFeel.equals(getResources().getText(R.string.symptom_Bad_breath))) {
                    mTvIs.setText(getResources().getText(R.string.yes_peculiar));
                    mTvEat.setText(getResources().getText(R.string.describe_symptom_eat_of));

                } else if (mFeel.equals(getResources().getText(R.string.symptom_bleeding))) {
                    mTvIs.setText(getResources().getText(R.string.yes_hemorrhage));
                    mTvEat.setText(getResources().getText(R.string.describe_symptom_eat_of));

                } else {
                    mTvIs.setText(getResources().getText(R.string.yes_habit));
                    mTvEat.setText(getResources().getText(R.string.describe_symptom_eat_of));

                }
                //显示选项内容
                mTvIs.setVisibility(View.VISIBLE);
                mIvEatBack.setVisibility(View.VISIBLE);
                //显示下一个问题
                mIsThree.setVisibility(View.VISIBLE);
                //获取选择的内容
                mString = mTvFeed.getText().toString();
                break;
            case R.id.mTv_spontaneity:
                //选项二
                //隐藏该问题选项
                mTvFeed.setVisibility(View.GONE);
                mTvSpontaneity.setVisibility(View.GONE);
                mIvSpontaneityBack.setVisibility(View.GONE);

                //赋值
                if (mFeel.equals(getResources().getText(R.string.symptom_toothache))) {
                    mTvAllDayLong.setVisibility(View.VISIBLE);

                    mTvIs.setText(getResources().getText(R.string.describe_symptom_spontaneity));
                    mTvEat.setText(getResources().getText(R.string.ifTime));
                    mTvColdSweet.setText(getResources().getText(R.string.daytime));
                    mTvHotFood.setText(getResources().getText(R.string.night));
                    mTvAllDayLong.setText(getResources().getText(R.string.allDayLong));

                } else if (mFeel.equals(getResources().getText(R.string.symptom_Bad_breath))) {
                    mTvIs.setText(getResources().getText(R.string.no_peculiar));

                } else if (mFeel.equals(getResources().getText(R.string.symptom_bleeding))) {
                    mTvIs.setText(getResources().getText(R.string.no_hemorrhage));

                } else {
                    mTvIs.setText(getResources().getText(R.string.no_habit));

                }
                //显示选项内容
                mTvIs.setVisibility(View.VISIBLE);
                mIvEatBack.setVisibility(View.VISIBLE);
                //显示下一个问题
                mIsThree.setVisibility(View.VISIBLE);
                //获取选择的内容
                mString = mTvSpontaneity.getText().toString();
                break;
            case R.id.mIv_spontaneity_back:
                //选项二介绍
                break;
            case R.id.mIv_eat_back:
                //重新选择(详细问题)
                break;
            case R.id.mTv_cold_sweet:
                //第三个问题(第一个选项)
                //隐藏该问题选项
                mTvColdSweet.setVisibility(View.GONE);
                mTvHotFood.setVisibility(View.GONE);
                mTvAllDayLong.setVisibility(View.GONE);
                //显示选项内容
                mTvEatFood.setVisibility(View.VISIBLE);
                mIvEatFoodBack.setVisibility(View.VISIBLE);
                //赋值
                mTvEatFood.setText(getResources().getText(R.string.describe_symptom_eat_cold));
                //显示下一个问题
                mIsFour.setVisibility(View.VISIBLE);
                break;
            case R.id.mTv_hotFood:
                //第三个问题(第二个选项)

                break;
            case R.id.mTv_allDayLong:
                //第三个问题(第三个选项)
                break;
            case R.id.mIv_eatFood_back:
                //重新选择(第三个问题)
                break;
            case R.id.mTv_stopEat_yes:
                //第四个问题(第一个选项)
                //隐藏该问题选项
                mTvStopEatYes.setVisibility(View.GONE);
                mTvStopEatNo.setVisibility(View.GONE);
                //显示选项内容
                mTvIsEat.setVisibility(View.VISIBLE);
                mIvStopEatBack.setVisibility(View.VISIBLE);
                //赋值
                mTvIsEat.setText(getResources().getText(R.string.if_stopEat_yes));
                //显示结论

                //龋病(虫牙)
                if (mString.equals(getResources().getText(R.string.describe_symptom_eat))) {
                    mIsResult.setVisibility(View.VISIBLE);
                    mTvResult.setText(getResources().getText(R.string.decayed_tooth));
                }
                break;
            case R.id.mTv_stopEat_no:
                //第四个问题(第二个选项)
                //隐藏该问题选项
                mTvStopEatYes.setVisibility(View.GONE);
                mTvStopEatNo.setVisibility(View.GONE);
                //显示选项内容
                mTvIsEat.setVisibility(View.VISIBLE);
                mIvStopEatBack.setVisibility(View.VISIBLE);
                //赋值
                mTvIsEat.setText(getResources().getText(R.string.if_stopEat_no));
                //显示下一个问题
                mEat = mTvEatFood.getText().toString();
                if (mEat.equals(getResources().getText(R.string.describe_symptom_eat_cold))) {

                    mTvIsStopEat.setText(getResources().getText(R.string.degreeOrTime));
                    //赋值第五个问题选项
                    mTvIsStopEatYes.setText(getResources().getText(R.string.shortTime));
                    mTvIsStopEatNo.setText(getResources().getText(R.string.longTime));


                } else if (mEat.equals(getResources().getText(R.string.describe_symptom_eat_hot))) {

                    mTvIsStopEat.setText(getResources().getText(R.string.if_cold_water));
                    //赋值第五个问题选项
                    mTvIsStopEatYes.setText(getResources().getText(R.string.if_stopEat_yes));
                    mTvIsStopEatNo.setText(getResources().getText(R.string.if_stopEat_no));

                }
                mIsFive.setVisibility(View.VISIBLE);
                break;
            case R.id.mIv_stopEat_back:
                //重新选择(第四个问题)
                break;
            case R.id.mTv_IsStopEat_yes:
                //第五个问题(第一个选项)
                //隐藏该问题选项
                mTvIsStopEatYes.setVisibility(View.GONE);
                mTvIsStopEatNo.setVisibility(View.GONE);
                //显示选项内容
                mTvIfEat.setVisibility(View.VISIBLE);
                mIvIsStopEatBack.setVisibility(View.VISIBLE);

                //赋值
                mTvIfEat.setText(getResources().getText(R.string.shortTime));

                if (mString.equals(getResources().getText(R.string.describe_symptom_eat))) {
                    //不显示下一个问题
                    mIsSix.setVisibility(View.GONE);
                    mIsSeven.setVisibility(View.GONE);
                    //结论
                    mIsResult.setVisibility(View.VISIBLE);
                    mTvResult.setText(getResources().getText(R.string.pulpitis));
                } else {
                    //显示下一个问题
                    mIsFive.setVisibility(View.VISIBLE);
                }
                break;
            case R.id.mTv_IsStopEat_no:
                //第五个问题(第二个选项)
                //隐藏该问题选项
                mTvIsStopEatYes.setVisibility(View.GONE);
                mTvIsStopEatNo.setVisibility(View.GONE);
                //显示选项内容
                mTvIfEat.setVisibility(View.VISIBLE);
                mIvIsStopEatBack.setVisibility(View.VISIBLE);
                //赋值
                mTvIfEat.setText(getResources().getText(R.string.shortTime));

                if (mString.equals(getResources().getText(R.string.describe_symptom_eat))) {
                    ToastUtil.showShort(mString);
                    //不显示下一个问题
                    mIsSix.setVisibility(View.GONE);
                    mIsSeven.setVisibility(View.GONE);
                    //结论
                    mIsResult.setVisibility(View.VISIBLE);
                    mTvResult.setText(getResources().getText(R.string.pulpitis));
                } else {
                    //显示下一个问题
                    mIsFive.setVisibility(View.VISIBLE);
                }
                break;
            case R.id.mTv_PurePain:
                //第五个问题(第三个选项)
                break;
            case R.id.mIv_IsStopEat_back:
                break;
            case R.id.mTv_IfEat:
                break;
            case R.id.mTv_ifAggravate:
                break;
            case R.id.mTv_ifAggravate_yes:
                break;
            case R.id.mTv_ifAggravatet_no:
                break;
            case R.id.mIv_ifAggravatet_back:
                break;
            case R.id.mTv_ifAggravatet:
                break;
            case R.id.mTv_ifLoose:
                break;
            case R.id.mTv_ifLoose_yes:
                break;
            case R.id.mTv_ifLoose_no:
                break;
            case R.id.mIv_ifLoose_back:
                break;
            case R.id.mTv_isLoose:
                break;
            case R.id.mTv_result:
                break;
            case R.id.mBtn_GeneralMap:
                break;
            case R.id.mBtn_reading:
                break;
            case R.id.mBtn_of_cases:
                break;
            case R.id.mBtn_newInquiry:
                break;
        }
    }

}
