package com.example.wayne.dentist.ui.fragment.inquiry_package;


import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.wayne.dentist.R;
import com.example.wayne.dentist.base.BaseFragment;
import com.example.wayne.dentist.mvp.Empty.EmptyPre;
import com.example.wayne.dentist.mvp.Empty.EmptyView;
import com.example.wayne.dentist.util.ToastUtil;
import com.example.wayne.dentist.widget.MediumTextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 * 牙痛
 */
public class ToothacheFragment extends BaseFragment<EmptyView, EmptyPre> implements EmptyView {

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
    @BindView(R.id.mTv_ifAggravate_yes)
    TextView mTvIfAggravateYes;
    @BindView(R.id.mTv_ifAggravate_no)
    TextView mTvIfAggravateNo;
    Unbinder unbinder;
    @BindView(R.id.mTv_never)
    TextView mTvNever;
    @BindView(R.id.mTv_Peculiar)
    TextView mTvPeculiar;
    @BindView(R.id.mTv_Peculiar_yes)
    TextView mTvPeculiarYes;
    @BindView(R.id.mTv_Peculiar_no)
    TextView mTvPeculiarNo;
    @BindView(R.id.mIsPeculiar)
    RelativeLayout mIsPeculiar;
    @BindView(R.id.mIv_Peculiar_back)
    ImageView mIvPeculiarBack;
    @BindView(R.id.mTv_IsPeculiar)
    TextView mTvIsPeculiar;
    @BindView(R.id.mTv_Inquiry)
    TextView mTvInquiry;
    @BindView(R.id.mTv_Inquiry_yes)
    TextView mTvInquiryYes;
    @BindView(R.id.mTv_Inquiry_no)
    TextView mTvInquiryNo;
    @BindView(R.id.mIsInquiry)
    RelativeLayout mIsInquiry;
    @BindView(R.id.mIv_Inquiry_back)
    ImageView mIvInquiryBack;
    @BindView(R.id.mTv_IsInquiry)
    TextView mTvIsInquiry;
    private String mString;
    private String mEat;
    private String mFeel;
    private String mHotFood;
    private String mPeculiar;

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

    @OnClick({R.id.mTv_toothache, R.id.mTv_badBreath, R.id.mTv_bleeding, R.id.mTv_nigrities, R.id.mIv_nigrities_hint, R.id.mIv_nigrities_back,
            R.id.mTv_issue, R.id.mTv_feed, R.id.mTv_spontaneity, R.id.mIv_spontaneity_back, R.id.mIv_eat_back, R.id.mTv_eat, R.id.mTv_cold_sweet,
            R.id.mTv_hotFood, R.id.mTv_allDayLong, R.id.mIv_eatFood_back, R.id.mTv_eatFood, R.id.mTv_stopEat, R.id.mTv_never,
            R.id.mTv_stopEat_yes, R.id.mTv_stopEat_no, R.id.mIv_stopEat_back, R.id.mTv_IsEat, R.id.mTv_IsStopEat, R.id.mTv_IsStopEat_yes,
            R.id.mTv_IsStopEat_no, R.id.mTv_PurePain, R.id.mIv_IsStopEat_back, R.id.mTv_IfEat, R.id.mTv_ifAggravate, R.id.mTv_ifAggravate_yes,
            R.id.mTv_ifAggravate_no, R.id.mIv_ifAggravatet_back, R.id.mTv_ifAggravatet, R.id.mTv_ifLoose, R.id.mTv_ifLoose_yes, R.id.mTv_ifLoose_no,
            R.id.mIv_ifLoose_back, R.id.mTv_isLoose, R.id.mTv_result, R.id.mBtn_GeneralMap, R.id.mBtn_reading, R.id.mBtn_of_cases, R.id.mBtn_newInquiry,
            R.id.mTv_Peculiar_yes, R.id.mTv_Peculiar_no, R.id.mIv_Peculiar_back, R.id.mTv_Inquiry_yes, R.id.mTv_Inquiry_no, R.id.mIv_Inquiry_back})

    public void onViewClicked(View view) {
        switch (view.getId()) {
            //--------------------------------------- 二问 -----------------------------------------------
            case R.id.mTv_feed:
                //选项一
                //隐藏该问题选项
                mTvFeed.setVisibility(View.GONE);
                mTvSpontaneity.setVisibility(View.GONE);
                mIvSpontaneityBack.setVisibility(View.GONE);
                //赋值
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
                // mIvNigritiesBack.setVisibility(View.GONE);

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

            //--------------------------------------- 三问 -----------------------------------------------
            case R.id.mTv_cold_sweet:
                //第三个问题(第一个选项)
                //隐藏该问题选项
                mTvColdSweet.setVisibility(View.GONE);
                mTvHotFood.setVisibility(View.GONE);
                mTvAllDayLong.setVisibility(View.GONE);
                mHotFood = mTvColdSweet.getText().toString();

                //隐藏返回按钮
                mIvEatBack.setVisibility(View.GONE);

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

                //隐藏返回按钮
                mIvEatBack.setVisibility(View.GONE);

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

                //隐藏返回按钮
                mIvEatBack.setVisibility(View.VISIBLE);

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

            //--------------------------------------- 四问 -----------------------------------------------
            case R.id.mTv_stopEat_yes:
                //第四个问题(第一个选项)
                //隐藏该问题选项
                mTvStopEatYes.setVisibility(View.GONE);
                mTvStopEatNo.setVisibility(View.GONE);

                //隐藏返回按钮
                mIvEatFoodBack.setVisibility(View.GONE);

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
                    mTvNever.setVisibility(View.GONE);

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

                //隐藏返回按钮
                mIvEatFoodBack.setVisibility(View.GONE);

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
                    mTvNever.setVisibility(View.GONE);
                } else if (mString.equals(getResources().getText(R.string.describe_symptom_spontaneity))) {
                    mTvIsEat.setText(getResources().getText(R.string.continuity));

                    mTvIsStopEat.setText(getResources().getText(R.string.isFeel));
                    //赋值第五个问题选项
                    mTvIsStopEatYes.setText(getResources().getText(R.string.swellingPain));
                    mTvIsStopEatNo.setText(getResources().getText(R.string.jumpingPain));
                    mTvPurePain.setText(getResources().getText(R.string.PurePain));
                    mTvPurePain.setVisibility(View.VISIBLE);
                    mTvNever.setVisibility(View.GONE);

                }
                //显示选项内容
                mTvIsEat.setVisibility(View.VISIBLE);
                mIvStopEatBack.setVisibility(View.VISIBLE);

                break;

            //--------------------------------------- 五问 -----------------------------------------------
            case R.id.mTv_IsStopEat_yes:
                //第五个问题(第一个选项)
                //隐藏该问题选项
                mTvIsStopEatYes.setVisibility(View.GONE);
                mTvIsStopEatNo.setVisibility(View.GONE);
                mTvPurePain.setVisibility(View.GONE);
                mTvNever.setVisibility(View.GONE);

                //隐藏返回按钮
                mIvStopEatBack.setVisibility(View.GONE);

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

                } else {
                    //显示下一个问题
                    mIsSix.setVisibility(View.VISIBLE);
                    mIsSeven.setVisibility(View.GONE);
                }
                //显示选项内容
                mTvIfEat.setVisibility(View.VISIBLE);
                mIvIsStopEatBack.setVisibility(View.VISIBLE);

                break;
            case R.id.mTv_IsStopEat_no:
                //第五个问题(第二个选项)
                //隐藏该问题选项
                mTvIsStopEatYes.setVisibility(View.GONE);
                mTvIsStopEatNo.setVisibility(View.GONE);
                mTvPurePain.setVisibility(View.GONE);
                mTvNever.setVisibility(View.GONE);

                //隐藏返回按钮
                mIvStopEatBack.setVisibility(View.GONE);

                //赋值
                if (mString.equals(getResources().getText(R.string.describe_symptom_eat))) {
                    ToastUtil.showShort(mString);
                    //不显示下一个问题
                    mTvPurePain.setVisibility(View.GONE);
                    mTvNever.setVisibility(View.GONE);
                    mIsSix.setVisibility(View.GONE);
                    mIsSeven.setVisibility(View.GONE);
                    if (mEat.equals(getResources().getText(R.string.describe_symptom_eat_cold))) {
                        mTvIfEat.setText(getResources().getText(R.string.longTime));
                    } else if (mEat.equals(getResources().getText(R.string.describe_symptom_eat_hot))) {
                        mTvIfEat.setText(getResources().getText(R.string.if_stopEat_no));
                    }
                    //结论
                    mIsResult.setVisibility(View.VISIBLE);
                    mTvResult.setText(getResources().getText(R.string.pulpitis));
                } else if (mString.equals(getResources().getText(R.string.describe_symptom_spontaneity))) {

                    mTvIfEat.setText(getResources().getText(R.string.jumpingPain));
                    mTvIfAggravate.setText(getResources().getText(R.string.ifAggravate));
                    mTvIfAggravateYes.setText(getResources().getText(R.string.if_stopEat_yes));
                    mTvIfAggravateNo.setText(getResources().getText(R.string.if_stopEat_no));

                    mTvIfEat.setVisibility(View.VISIBLE);
                    mIvIsStopEatBack.setVisibility(View.VISIBLE);
                    mIsSix.setVisibility(View.VISIBLE);
                    mIsSeven.setVisibility(View.GONE);

                } else {
                    //显示下一个问题
                    mIsSix.setVisibility(View.VISIBLE);
                    mIsSeven.setVisibility(View.GONE);
                }
                //显示选项内容
                mTvIfEat.setVisibility(View.VISIBLE);
                mIvIsStopEatBack.setVisibility(View.VISIBLE);
                break;
            case R.id.mTv_PurePain:
                //第五个问题(第三个选项)
                //隐藏该问题选项
                mTvIsStopEatYes.setVisibility(View.GONE);
                mTvIsStopEatNo.setVisibility(View.GONE);
                mTvPurePain.setVisibility(View.GONE);
                mTvNever.setVisibility(View.GONE);

                //隐藏返回按钮
                mIvStopEatBack.setVisibility(View.GONE);

                if (mString.equals(getResources().getText(R.string.describe_symptom_spontaneity))) {

                    mTvIfEat.setText(getResources().getText(R.string.PurePain));
                    mTvIfAggravate.setText(getResources().getText(R.string.ifAggravate));
                    mTvIfAggravateYes.setText(getResources().getText(R.string.if_stopEat_yes));
                    mTvIfAggravateNo.setText(getResources().getText(R.string.if_stopEat_no));

                    mTvIfEat.setVisibility(View.VISIBLE);
                    mIvIsStopEatBack.setVisibility(View.VISIBLE);
                    mIsSix.setVisibility(View.VISIBLE);
                    mIsSeven.setVisibility(View.GONE);
                }
                break;

            //--------------------------------------第六问-------------------------------------------
            case R.id.mTv_ifAggravate_yes:
                //第六个问题(第一个选项)
                mTvIfAggravateYes.setVisibility(View.GONE);
                mTvIfAggravateNo.setVisibility(View.GONE);

                //隐藏返回按钮
                mIvIsStopEatBack.setVisibility(View.GONE);


                mTvIfAggravatet.setText(getResources().getText(R.string.if_stopEat_yes));
                mTvIfLoose.setText(getResources().getText(R.string.ifLoose));
                mTvIfLooseYes.setText(getResources().getText(R.string.if_stopEat_yes));
                mTvIfLooseNo.setText(getResources().getText(R.string.if_stopEat_no));

                mTvIfAggravatet.setVisibility(View.VISIBLE);
                mIvIfAggravatetBack.setVisibility(View.VISIBLE);
                mIsSeven.setVisibility(View.VISIBLE);

                break;
            case R.id.mTv_ifAggravate_no:
                //第六个问题(第二个选项)
                mTvIfAggravateYes.setVisibility(View.GONE);
                mTvIfAggravateNo.setVisibility(View.GONE);

                //隐藏返回按钮
                mIvIsStopEatBack.setVisibility(View.GONE);

                mTvIfAggravatet.setText(getResources().getText(R.string.if_stopEat_no));
                mTvIfAggravatet.setVisibility(View.VISIBLE);
                mIvIfAggravatetBack.setVisibility(View.VISIBLE);
                mIsSeven.setVisibility(View.GONE);

                //结论
                mIsResult.setVisibility(View.VISIBLE);
                mTvResult.setText(getResources().getText(R.string.pulpitis));

                break;

            //---------------------------------------------第七问---------------------------------------------------
            case R.id.mTv_ifLoose_yes:
                //第七个问题(第一个选项)
                mTvIfLooseYes.setVisibility(View.GONE);
                mTvIfLooseNo.setVisibility(View.GONE);

                //隐藏返回按钮
                mIvIfAggravatetBack.setVisibility(View.GONE);
                mTvIsLoose.setText(getResources().getText(R.string.if_stopEat_yes));
                //结论
                mTvIsLoose.setVisibility(View.VISIBLE);
                mIvIfLooseBack.setVisibility(View.VISIBLE);
                mIsResult.setVisibility(View.VISIBLE);
                mTvResult.setText(getResources().getText(R.string.pulpitis_unite));

                break;
            case R.id.mTv_ifLoose_no:
                //第七个问题(第二个选项)
                mTvIfLooseYes.setVisibility(View.GONE);
                mTvIfLooseNo.setVisibility(View.GONE);

                //隐藏返回按钮
                mIvIfAggravatetBack.setVisibility(View.GONE);

                mTvIsLoose.setText(getResources().getText(R.string.if_stopEat_no));
                //结论
                mTvIsLoose.setVisibility(View.VISIBLE);
                mIvIfLooseBack.setVisibility(View.VISIBLE);
                mIsResult.setVisibility(View.VISIBLE);
                mTvResult.setText(getResources().getText(R.string.apicitis));

                break;
            case R.id.mIv_eat_back:
                //重新选择(选项二问题)
                mIsTwo.setVisibility(View.VISIBLE);
                mTvFeed.setVisibility(View.VISIBLE);
                mTvSpontaneity.setVisibility(View.VISIBLE);
                mIvSpontaneityBack.setVisibility(View.VISIBLE);

                mIvNigritiesBack.setVisibility(View.VISIBLE);

                mIvEatBack.setVisibility(View.GONE);
                mTvIs.setVisibility(View.GONE);
                mIsThree.setVisibility(View.GONE);
                break;
            case R.id.mIv_eatFood_back:
                //重新选择(第三个问题)
                mIsThree.setVisibility(View.VISIBLE);
                mTvColdSweet.setVisibility(View.VISIBLE);
                mTvHotFood.setVisibility(View.VISIBLE);
                mTvAllDayLong.setVisibility(View.VISIBLE);

                if (mString.equals(getResources().getText(R.string.describe_symptom_spontaneity))) {
                    mTvAllDayLong.setVisibility(View.VISIBLE);
                } else {
                    mTvAllDayLong.setVisibility(View.GONE);
                }

                mIvEatBack.setVisibility(View.VISIBLE);

                mIvEatFoodBack.setVisibility(View.GONE);
                mTvEatFood.setVisibility(View.GONE);
                mIsFour.setVisibility(View.GONE);
                mIsResult.setVisibility(View.GONE);
                break;
            case R.id.mIv_stopEat_back:
                //重新选择(第四个问题)
                mIsFour.setVisibility(View.VISIBLE);
                mTvStopEatYes.setVisibility(View.VISIBLE);
                mTvStopEatNo.setVisibility(View.VISIBLE);

                mIvEatFoodBack.setVisibility(View.VISIBLE);

                mIvStopEatBack.setVisibility(View.GONE);
                mTvIsEat.setVisibility(View.GONE);
                mIsFive.setVisibility(View.GONE);
                mIsResult.setVisibility(View.GONE);
                break;
            case R.id.mIv_IsStopEat_back:
                //第五个问题(返回选项)
                mIsFive.setVisibility(View.VISIBLE);
                mTvIsStopEatYes.setVisibility(View.VISIBLE);
                mTvIsStopEatNo.setVisibility(View.VISIBLE);
                if (mString.equals(getResources().getText(R.string.describe_symptom_spontaneity))) {
                    mTvPurePain.setVisibility(View.VISIBLE);
                    mTvNever.setVisibility(View.GONE);

                } else {
                    mTvPurePain.setVisibility(View.GONE);
                    mTvNever.setVisibility(View.GONE);
                }

                mIvStopEatBack.setVisibility(View.VISIBLE);

                mIvIsStopEatBack.setVisibility(View.GONE);
                mTvIfEat.setVisibility(View.GONE);
                mIsSix.setVisibility(View.GONE);
                mIsResult.setVisibility(View.GONE);
                break;
            case R.id.mIv_ifAggravatet_back:
                //第六个问题(返回选项)
                mIsSix.setVisibility(View.VISIBLE);
                mTvIfAggravateYes.setVisibility(View.VISIBLE);
                mTvIfAggravateNo.setVisibility(View.VISIBLE);

                mIvIsStopEatBack.setVisibility(View.VISIBLE);

                mIvIfAggravatetBack.setVisibility(View.GONE);
                mTvIfAggravatet.setVisibility(View.GONE);
                mIsSeven.setVisibility(View.GONE);
                mIsResult.setVisibility(View.GONE);
                break;
            case R.id.mIv_ifLoose_back:
                //第七个问题(返回选项)
                mIsSeven.setVisibility(View.VISIBLE);
                mTvIfLooseYes.setVisibility(View.VISIBLE);
                mTvIfLooseNo.setVisibility(View.VISIBLE);

                mIvIfAggravatetBack.setVisibility(View.VISIBLE);

                mIvIfLooseBack.setVisibility(View.GONE);
                mTvIsLoose.setVisibility(View.GONE);
                mIsResult.setVisibility(View.GONE);
                break;
            case R.id.mIv_spontaneity_back:
                //选项二介绍
                initPop(2);
                break;
            case R.id.mTv_result:
                //结论
                break;
            case R.id.mBtn_GeneralMap:
                //识图自诊
                break;
            case R.id.mBtn_reading:
                //推荐阅读
                break;
            case R.id.mBtn_of_cases:
                //数字病例
                break;
            case R.id.mBtn_newInquiry:
                //新的问诊
                break;

        }
    }

    private void initPop(int id) {
        View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.item_popup, null, false);
        PopupWindow popupWindow = new PopupWindow(inflate, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        MediumTextView name = inflate.findViewById(R.id.mTv_popName);
        TextView details = inflate.findViewById(R.id.mTv_popDetails);

        name.setText(R.string.describe_symptom_spontaneity);
        details.setText(R.string.spontaneity);

        popupWindow.setOutsideTouchable(true);
        popupWindow.setBackgroundDrawable(new ColorDrawable());

        popupWindow.showAtLocation(inflate, Gravity.BOTTOM, 0, 0);
    }

}
