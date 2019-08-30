package com.example.wayne.dentist.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.TableLayout;

import com.example.wayne.dentist.base.BaseFragment;
import com.example.wayne.dentist.bean.TabBean;
import com.example.wayne.dentist.ui.fragment.Fragment_ency_son;

import java.util.ArrayList;
import java.util.List;

/**
 * @name 张东
 * @time wayne2019/8/2
 * @describe main_ViewPager
 */
public class MyAdapter extends FragmentPagerAdapter {

    private int mSize;
    private List<TabBean.DataBean> mList;

    public MyAdapter(FragmentManager fm, int size , List<TabBean.DataBean> list) {
        super(fm);
        mSize = size;
        mList = list;
    }

    @Override
    public Fragment getItem(int i) {
        Fragment_ency_son son = new Fragment_ency_son();
        TabBean.DataBean bean = mList.get(i);
        int ID = bean.getId();
        int tSortID = bean.getTSortID();

        son.setTab(ID,tSortID);
        return son;
    }

    @Override
    public int getCount() {
        return mSize;
    }



}
