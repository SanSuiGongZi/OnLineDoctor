package com.example.wayne.dentist.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


import com.example.wayne.dentist.base.BaseFragment;
import com.example.wayne.dentist.ui.fragment.Fragment_ency_son2;

import java.util.ArrayList;

/**
 * @name 张东
 * @time wayne2019/8/2
 * @describe    main_ViewPager
 */
public class MyAdapter_Vp extends FragmentPagerAdapter {

    public MyAdapter_Vp(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment_ency_son2 encySon2 = new Fragment_ency_son2();
        return encySon2;
    }

    @Override
    public int getCount() {
        return 5;
    }
}
