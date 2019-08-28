package com.example.wayne.dentist.ui.fragment.inquiry_package;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.wayne.dentist.R;
import com.example.wayne.dentist.base.BaseFragment;
import com.example.wayne.dentist.mvp.Empty.EmptyPre;
import com.example.wayne.dentist.mvp.Empty.EmptyView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class ToothacheFragment extends BaseFragment<EmptyView, EmptyPre> implements EmptyView {


    @BindView(R.id.mTv_issue)
    TextView mTvIssue;
    @BindView(R.id.mTv_feed)
    TextView mTvFeed;
    @BindView(R.id.mTv_spontaneity)
    TextView mTvSpontaneity;
    @BindView(R.id.mIv_spontaneity_back)
    ImageView mIvSpontaneityBack;
    @BindView(R.id.mIsTwo)
    RelativeLayout mIsTwo;
    @BindView(R.id.mIv_eat_back)
    ImageView mIvEatBack;
    @BindView(R.id.mTv_is)
    TextView mTvIs;
    @BindView(R.id.mll_two)
    LinearLayout mllTwo;
    @BindView(R.id.mTv_eat)
    TextView mTvEat;
    @BindView(R.id.mTv_cold_sweet)
    TextView mTvColdSweet;
    @BindView(R.id.mTv_hotFood)
    TextView mTvHotFood;
    @BindView(R.id.mTv_allDayLong)
    TextView mTvAllDayLong;
    @BindView(R.id.mIsThree)
    RelativeLayout mIsThree;
    @BindView(R.id.mIv_eatFood_back)
    ImageView mIvEatFoodBack;
    @BindView(R.id.mTv_eatFood)
    TextView mTvEatFood;
    @BindView(R.id.mll_three)
    LinearLayout mllThree;
    @BindView(R.id.mTv_stopEat)
    TextView mTvStopEat;
    @BindView(R.id.mTv_stopEat_yes)
    TextView mTvStopEatYes;
    @BindView(R.id.mTv_stopEat_no)
    TextView mTvStopEatNo;
    @BindView(R.id.mIsFour)
    RelativeLayout mIsFour;
    @BindView(R.id.mIv_stopEat_back)
    ImageView mIvStopEatBack;
    @BindView(R.id.mTv_IsEat)
    TextView mTvIsEat;
    @BindView(R.id.mll_four)
    LinearLayout mllFour;
    @BindView(R.id.mTv_IsStopEat)
    TextView mTvIsStopEat;
    @BindView(R.id.mTv_IsStopEat_yes)
    TextView mTvIsStopEatYes;
    @BindView(R.id.mTv_IsStopEat_no)
    TextView mTvIsStopEatNo;
    @BindView(R.id.mTv_PurePain)
    TextView mTvPurePain;
    @BindView(R.id.mIsFive)
    RelativeLayout mIsFive;
    @BindView(R.id.mIv_IsStopEat_back)
    ImageView mIvIsStopEatBack;
    @BindView(R.id.mTv_IfEat)
    TextView mTvIfEat;
    @BindView(R.id.mll_five)
    LinearLayout mllFive;
    @BindView(R.id.mTv_ifAggravate)
    TextView mTvIfAggravate;
    @BindView(R.id.mTv_ifAggravate_yes)
    TextView mTvIfAggravateYes;
    @BindView(R.id.mTv_ifAggravate_no)
    TextView mTvIfAggravateNo;
    @BindView(R.id.mIsSix)
    RelativeLayout mIsSix;
    @BindView(R.id.mIv_ifAggravatet_back)
    ImageView mIvIfAggravatetBack;
    @BindView(R.id.mTv_ifAggravatet)
    TextView mTvIfAggravatet;
    @BindView(R.id.mll_sex)
    LinearLayout mllSex;
    @BindView(R.id.mTv_ifLoose)
    TextView mTvIfLoose;
    @BindView(R.id.mTv_ifLoose_yes)
    TextView mTvIfLooseYes;
    @BindView(R.id.mTv_ifLoose_no)
    TextView mTvIfLooseNo;
    @BindView(R.id.mIsSeven)
    RelativeLayout mIsSeven;
    @BindView(R.id.mIv_ifLoose_back)
    ImageView mIvIfLooseBack;
    @BindView(R.id.mTv_isLoose)
    TextView mTvIsLoose;
    @BindView(R.id.mll_seven)
    LinearLayout mllSeven;
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
    @BindView(R.id.mIsResult)
    RelativeLayout mIsResult;
    private String mHotFood;
    private String mEat;
    private String mString;

    public ToothacheFragment() {
        // Required empty public constructor
    }

    @Override
    protected EmptyPre GetPresenter() {
        return new EmptyPre();
    }

    @Override
    protected int GetId() {
        return R.layout.fragment_toothache;
    }

    @OnClick({R.id.mTv_feed, R.id.mTv_spontaneity, R.id.mIv_spontaneity_back, R.id.mIv_eat_back, R.id.mTv_cold_sweet, R.id.mTv_hotFood, R.id.mTv_allDayLong,
            R.id.mIv_eatFood_back, R.id.mTv_stopEat_yes, R.id.mTv_stopEat_no, R.id.mIv_stopEat_back, R.id.mTv_IsStopEat_yes, R.id.mTv_IsStopEat_no,
            R.id.mTv_PurePain, R.id.mIv_IsStopEat_back, R.id.mTv_ifAggravate_yes, R.id.mTv_ifAggravate_no, R.id.mIv_ifAggravatet_back, R.id.mTv_ifLoose_yes,
            R.id.mTv_ifLoose_no, R.id.mIv_ifLoose_back, R.id.mTv_result, R.id.mBtn_GeneralMap, R.id.mBtn_reading, R.id.mBtn_of_cases, R.id.mBtn_newInquiry})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.mTv_feed:
                //隐藏该问题选项
                mTvFeed.setVisibility(View.GONE);
                mTvSpontaneity.setVisibility(View.GONE);
                mIvSpontaneityBack.setVisibility(View.GONE);

                mTvAllDayLong.setVisibility(View.GONE);
                mTvIs.setText(getResources().getText(R.string.describe_symptom_eat));
                mTvEat.setText(getResources().getText(R.string.describe_symptom_eat_of));
                mTvColdSweet.setText(getResources().getText(R.string.describe_symptom_eat_cold));
                mTvHotFood.setText(getResources().getText(R.string.describe_symptom_eat_hot));

                //显示选项内容
                mTvIs.setVisibility(View.VISIBLE);
                mIvEatBack.setVisibility(View.VISIBLE);
                //显示下一个问题
                mIsThree.setVisibility(View.VISIBLE);
                //获取选择的内容
                mString = mTvIs.getText().toString();

                break;
            case R.id.mTv_spontaneity:
                //选项二
                //隐藏该问题选项
                mTvFeed.setVisibility(View.GONE);
                mTvSpontaneity.setVisibility(View.GONE);
                mIvSpontaneityBack.setVisibility(View.GONE);
                mTvAllDayLong.setVisibility(View.VISIBLE);

                mTvIs.setText(getResources().getText(R.string.describe_symptom_spontaneity));
                mTvEat.setText(getResources().getText(R.string.ifTime));
                mTvColdSweet.setText(getResources().getText(R.string.daytime));
                mTvHotFood.setText(getResources().getText(R.string.night));
                mTvAllDayLong.setText(getResources().getText(R.string.allDayLong));

                //显示选项内容
                mTvIs.setVisibility(View.VISIBLE);
                mIvEatBack.setVisibility(View.VISIBLE);
                //显示下一个问题
                mIsThree.setVisibility(View.VISIBLE);
                //获取选择的内容
                mString = mTvIs.getText().toString();

                break;
            case R.id.mIv_spontaneity_back:
                break;
            case R.id.mIv_eat_back:
                break;
            case R.id.mTv_cold_sweet:
                //第三个问题(第一个选项)
                //隐藏该问题选项
                mTvColdSweet.setVisibility(View.GONE);
                mTvHotFood.setVisibility(View.GONE);
                mTvAllDayLong.setVisibility(View.GONE);
                mHotFood = mTvColdSweet.getText().toString();
                //赋值
                if (mHotFood.equals(getResources().getText(R.string.describe_symptom_eat_cold))) {
                    mTvEatFood.setText(getResources().getText(R.string.describe_symptom_eat_cold));
                    mTvStopEat.setText(getResources().getText(R.string.if_stopEat));
                    mTvStopEatYes.setText(getResources().getText(R.string.if_stopEat_yes));
                    mTvStopEatNo.setText(getResources().getText(R.string.if_stopEat_no));

                } else if (mHotFood.equals(getResources().getText(R.string.daytime))) {
                    mTvEatFood.setText(getResources().getText(R.string.daytime));
                    mTvStopEat.setText(getResources().getText(R.string.ifIntervalOrContinuity));
                    mTvStopEatYes.setText(getResources().getText(R.string.interval));
                    mTvStopEatNo.setText(getResources().getText(R.string.continuity));

                }
                mEat = mTvEatFood.getText().toString();
                //显示选项内容
                mTvEatFood.setVisibility(View.VISIBLE);
                mIvEatFoodBack.setVisibility(View.VISIBLE);
                //显示下一个问题
                mIsFour.setVisibility(View.VISIBLE);

                break;
            case R.id.mTv_hotFood:
                //第三个问题(第二个选项)
                //隐藏该问题选项
                mTvColdSweet.setVisibility(View.GONE);
                mTvHotFood.setVisibility(View.GONE);
                mTvAllDayLong.setVisibility(View.GONE);
                mHotFood = mTvHotFood.getText().toString();
                //赋值
                if (mHotFood.equals(getResources().getText(R.string.describe_symptom_eat_hot))) {
                    mTvEatFood.setText(getResources().getText(R.string.describe_symptom_eat_hot));
                    mTvStopEat.setText(getResources().getText(R.string.if_stopEat));
                    mTvStopEatYes.setText(getResources().getText(R.string.if_stopEat_yes));
                    mTvStopEatNo.setText(getResources().getText(R.string.if_stopEat_no));
                    //显示下一个问题
                    mIsFour.setVisibility(View.VISIBLE);
                } else if (mHotFood.equals(getResources().getText(R.string.night))) {
                    mTvEatFood.setText(getResources().getText(R.string.night));
                    mTvStopEat.setText(getResources().getText(R.string.ifIntervalOrContinuity));
                    mTvStopEatYes.setText(getResources().getText(R.string.interval));
                    mTvStopEatNo.setText(getResources().getText(R.string.continuity));
                    //显示下一个问题
                    mIsFour.setVisibility(View.VISIBLE);
                }
                mEat = mTvEatFood.getText().toString();
                //显示选项内容
                mTvEatFood.setVisibility(View.VISIBLE);
                mIvEatFoodBack.setVisibility(View.VISIBLE);

                break;
            case R.id.mTv_allDayLong:
                //第三个问题(第三个选项)
                //隐藏该问题选项
                mTvColdSweet.setVisibility(View.GONE);
                mTvHotFood.setVisibility(View.GONE);
                mTvAllDayLong.setVisibility(View.GONE);

                String dayFood = mTvAllDayLong.getText().toString();
                if (dayFood.equals(getResources().getText(R.string.allDayLong))) {
                    mTvEatFood.setText(getResources().getText(R.string.allDayLong));
                    mTvStopEat.setText(getResources().getText(R.string.ifIntervalOrContinuity));
                    mTvStopEatYes.setText(getResources().getText(R.string.interval));
                    mTvStopEatNo.setText(getResources().getText(R.string.continuity));
                }
                mEat = mTvEatFood.getText().toString();
                //显示选项内容
                mTvEatFood.setVisibility(View.VISIBLE);
                mIvEatFoodBack.setVisibility(View.VISIBLE);
                //显示下一个问题
                mIsFour.setVisibility(View.VISIBLE);

                break;
            case R.id.mIv_eatFood_back:
                break;
            case R.id.mTv_stopEat_yes:
                //第四个问题(第一个选项)
                //隐藏该问题选项
                mTvStopEatYes.setVisibility(View.GONE);
                mTvStopEatNo.setVisibility(View.GONE);
                //赋值
                //显示结论
                //龋病(虫牙)
                if (mString.equals(getResources().getText(R.string.describe_symptom_eat))) {
                    mTvIsEat.setText(getResources().getText(R.string.if_stopEat_yes));
                    mIsFive.setVisibility(View.GONE);
                    mIsSix.setVisibility(View.GONE);
                    mIsSeven.setVisibility(View.GONE);
                    mIsResult.setVisibility(View.VISIBLE);
                    mTvResult.setText(getResources().getText(R.string.decayed_tooth));

                } else if (mString.equals(getResources().getText(R.string.describe_symptom_spontaneity))) {
                    mTvIsEat.setText(getResources().getText(R.string.interval));
                    mTvIsStopEat.setText(getResources().getText(R.string.isFeel));
                    //赋值第五个问题选项
                    mTvIsStopEatYes.setText(getResources().getText(R.string.swellingPain));
                    mTvIsStopEatNo.setText(getResources().getText(R.string.jumpingPain));
                    mTvPurePain.setText(getResources().getText(R.string.PurePain));
                    mIsFive.setVisibility(View.VISIBLE);
                    mTvPurePain.setVisibility(View.VISIBLE);
                    mIsSix.setVisibility(View.GONE);
                    mIsSeven.setVisibility(View.GONE);
                }
                //显示选项内容
                mTvIsEat.setVisibility(View.VISIBLE);
                mIvStopEatBack.setVisibility(View.VISIBLE);
                break;
            case R.id.mTv_stopEat_no:
                //第四个问题(第二个选项)
                //隐藏该问题选项
                mTvStopEatYes.setVisibility(View.GONE);
                mTvStopEatNo.setVisibility(View.GONE);
                //赋值
                //显示下一个问题
                if (mString.equals(getResources().getText(R.string.describe_symptom_eat))) {

                    mTvIsEat.setText(getResources().getText(R.string.if_stopEat_no));

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
                    mTvPurePain.setVisibility(View.GONE);
                } else if (mString.equals(getResources().getText(R.string.describe_symptom_spontaneity))) {
                    mTvIsEat.setText(getResources().getText(R.string.continuity));

                    mTvIsStopEat.setText(getResources().getText(R.string.isFeel));
                    //赋值第五个问题选项
                    mTvIsStopEatYes.setText(getResources().getText(R.string.swellingPain));
                    mTvIsStopEatNo.setText(getResources().getText(R.string.jumpingPain));
                    mTvPurePain.setText(getResources().getText(R.string.PurePain));
                    mTvPurePain.setVisibility(View.VISIBLE);

                }
                //显示选项内容
                mTvIsEat.setVisibility(View.VISIBLE);
                mIvStopEatBack.setVisibility(View.VISIBLE);
                mIsFive.setVisibility(View.VISIBLE);
                mIsSix.setVisibility(View.GONE);
                mIsSeven.setVisibility(View.GONE);

                break;
            case R.id.mIv_stopEat_back:
                break;
            case R.id.mTv_IsStopEat_yes:
                //第五个问题(第一个选项)
                //隐藏该问题选项
                mTvIsStopEatYes.setVisibility(View.GONE);
                mTvIsStopEatNo.setVisibility(View.GONE);
                mTvPurePain.setVisibility(View.GONE);

                //赋值
                if (mString.equals(getResources().getText(R.string.describe_symptom_eat))) {
                    //不显示下一个问题
                    mTvPurePain.setVisibility(View.GONE);
                    mIsSix.setVisibility(View.GONE);
                    mIsSeven.setVisibility(View.GONE);

                    if (mEat.equals(getResources().getText(R.string.describe_symptom_eat_cold))) {
                        mTvIfEat.setText(getResources().getText(R.string.shortTime));
                    } else if (mEat.equals(getResources().getText(R.string.describe_symptom_eat_hot))) {
                        mTvIfEat.setText(getResources().getText(R.string.if_stopEat_yes));
                    }
                    //结论
                    mIsResult.setVisibility(View.VISIBLE);
                    mTvResult.setText(getResources().getText(R.string.pulpitis));

                } else if (mString.equals(getResources().getText(R.string.describe_symptom_spontaneity))) {

                    mTvIfEat.setText(getResources().getText(R.string.swellingPain));
                    mTvIfAggravate.setText(getResources().getText(R.string.ifAggravate));
                    mTvIfAggravateYes.setText(getResources().getText(R.string.if_stopEat_yes));
                    mTvIfAggravateNo.setText(getResources().getText(R.string.if_stopEat_no));

                    mTvIfEat.setVisibility(View.VISIBLE);
                    mIvIsStopEatBack.setVisibility(View.VISIBLE);

                    mIsSix.setVisibility(View.VISIBLE);
                    mIsSeven.setVisibility(View.GONE);

                }
                //显示选项内容
                mTvIfEat.setVisibility(View.VISIBLE);
                mIvIsStopEatBack.setVisibility(View.VISIBLE);
                break;
            case R.id.mTv_IsStopEat_no:
                break;
            case R.id.mTv_PurePain:
                break;
            case R.id.mIv_IsStopEat_back:
                break;
            case R.id.mTv_ifAggravate_yes:
                break;
            case R.id.mTv_ifAggravate_no:
                break;
            case R.id.mIv_ifAggravatet_back:
                break;
            case R.id.mTv_ifLoose_yes:
                break;
            case R.id.mTv_ifLoose_no:
                break;
            case R.id.mIv_ifLoose_back:
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
