package com.example.wayne.dentist.ui.fragment;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.wayne.dentist.R;
import com.example.wayne.dentist.base.BaseFragment;
import com.example.wayne.dentist.base.Constants;
import com.example.wayne.dentist.bean.TabBean;
import com.example.wayne.dentist.mvp.encyclopedia.EncyPre;
import com.example.wayne.dentist.mvp.encyclopedia.EncyView;
import com.example.wayne.dentist.ui.adapter.MyAdapter;
import com.example.wayne.dentist.ui.adapter.MyAdapter_Vp;
import com.example.wayne.dentist.util.ImageLoader;
import com.example.wayne.dentist.util.SpUtil;
import com.example.wayne.dentist.util.ToastUtil;
import com.example.wayne.dentist.widget.BanViewPager;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

import static android.support.constraint.Constraints.TAG;


/**
 * A simple {@link Fragment} subclass.
 */
public class Encyclopedia extends BaseFragment<EncyView, EncyPre> implements EncyView {


    @BindView(R.id.mVp)
    BanViewPager mVp;
    @BindView(R.id.mTab)
    TabLayout mTab;
    private MyAdapter adapter;


    public Encyclopedia() {
        // Required empty public constructor
    }


    @Override
    protected EncyPre GetPresenter() {
        return new EncyPre();
    }

    @Override
    protected int GetId() {
        return R.layout.fragment_encyclopedia;
    }

    @Override
    protected void initData() {
        mPresenter.getList(1, 0);
    }

    @Override
    public void tabData(TabBean tabBean) {
        final List<TabBean.DataBean> data = tabBean.getData();
        int total = tabBean.getTotal();
        FragmentManager fm = getFragmentManager();
        adapter = new MyAdapter(fm,total,data);
        mVp.setAdapter(adapter);

        for (int i = 0; i < total; i++) {
            mTab.addTab(mTab.newTab().setText(data.get(i).getTName()));
            // 修改样式
            mTab.getTabAt(i).setCustomView(getTabView(data.get(i).getTName(),i));
        }

        Log.d(TAG, "tabData: ");

        mVp.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTab));
        mTab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                mVp.setCurrentItem(tab.getPosition());
                changeTabSelect(tab);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                changeTabNormal(tab);
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    @Override
    public void Error(String msg) {
        ToastUtil.showLong(msg);
    }

    // Tab自定义view
    public View getTabView(String title, int location) {
        TextView v = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.tab_item_son, null);
        if (location==0) {
            v.setBackground(getResources().getDrawable(R.drawable.text_shape));
            v.setTextColor(getResources().getColor(R.color.white));
        } else {
            v.setBackground(getResources().getDrawable(R.drawable.text_noshape));
            v.setTextColor(getResources().getColor(R.color.c_9B9B9B));
        }
        v.setText(title);
        return v;
    }

    // 切换颜色
    private void changeTabSelect(TabLayout.Tab tab) {
        TextView txt_title = (TextView) tab.getCustomView();
        txt_title.setBackground(getResources().getDrawable(R.drawable.text_shape));
        txt_title.setTextColor(getResources().getColor(R.color.white));
    }

    private void changeTabNormal(TabLayout.Tab tab) {
        TextView txt_title = (TextView) tab.getCustomView();
        txt_title.setBackground(getResources().getDrawable(R.drawable.text_noshape));
        txt_title.setTextColor(getResources().getColor(R.color.c_9B9B9B));
    }

}
